/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.curator.framework.recipes.time;

import java.util.Arrays;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.api.PathAndBytesable;
import org.apache.curator.utils.PathUtils;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;

/**
 * Method of getting true time from ZK instances by creating a temporary node to
 * fetch it's time
 * 
 * Inter-Process safe way of getting current ZK time (avoid using
 * System.currentTimeMillis() as it may not be in sync across all instances)
 */
public class ZooCurrentTimeProvider implements CurrentTimeProvider {
	private final CuratorFramework client;
	private final String path;
	private volatile byte[] nodeData;

	/**
	 * @param client
	 *            the client
	 * @param path
	 *            path for the semaphore
	 * @param maxLeases
	 *            the max number of leases to allow for this instance
	 */
	public ZooCurrentTimeProvider(CuratorFramework client, String path) {
		this.client = client;
		this.path = PathUtils.validatePath(path);
	}

	/**
	 * Set the data to put for the node created by this semaphore. This must be
	 * called prior to calling one of the acquire() methods.
	 *
	 * @param nodeData
	 *            node data
	 */
	public void setNodeData(byte[] nodeData) {
		this.nodeData = (nodeData != null) ? Arrays.copyOf(nodeData, nodeData.length) : null;
	}

	public long getCurrentTime() throws Exception {
		PathAndBytesable<String> builder = client.create().creatingParentContainersIfNeeded().withProtection()
				.withMode(CreateMode.EPHEMERAL_SEQUENTIAL);

		// create temporary path
		String timePath = (nodeData == null ? builder.forPath(path) : builder.forPath(path, nodeData));

		try {
			// get the created time of the patch
			Stat stat = new Stat();
			client.getData().storingStatIn(stat).forPath(timePath);
			return stat.getCtime();
		} finally {
			// remove the path as we no longer need it
			client.delete().guaranteed().forPath(timePath);
		}
	}
}
