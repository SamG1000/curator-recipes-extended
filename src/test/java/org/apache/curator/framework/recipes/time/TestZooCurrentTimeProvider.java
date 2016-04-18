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

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.test.BaseClassForTests;
import org.apache.curator.utils.CloseableUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestZooCurrentTimeProvider extends BaseClassForTests
{

    @Test
    public void testSimple() throws Exception
    {
        CuratorFramework client = CuratorFrameworkFactory.newClient(server.getConnectString(), new RetryOneTime(1));
        ZooCurrentTimeProvider zooCurrentTimeProvider1 = new ZooCurrentTimeProvider(client, "/count");
        ZooCurrentTimeProvider zooCurrentTimeProvider2 = new ZooCurrentTimeProvider(client, "/count");
        
        try
        {
            client.start();
            
            long timeZoo1 = zooCurrentTimeProvider1.getCurrentTime();
            long timeZoo2 = zooCurrentTimeProvider2.getCurrentTime();

            Assert.assertNotEquals(timeZoo1, timeZoo2);
        }
        finally
        {
            CloseableUtils.closeQuietly(client);
        }
    }

}
