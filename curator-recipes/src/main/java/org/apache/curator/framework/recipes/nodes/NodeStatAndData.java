package org.apache.curator.framework.recipes.nodes;

import org.apache.zookeeper.data.Stat;

public class NodeStatAndData {
	private final String path;
	private final Stat stat;
	private final byte[] data;
	
	public NodeStatAndData(String path, Stat stat, byte[] data) {
		this.path = path;
		this.stat = stat;
		this.data = data;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @return the stat
	 */
	public Stat getStat() {
		return stat;
	}

	/**
	 * @return the data
	 */
	public byte[] getData() {
		return data;
	}
	
	/**
	 * @return the data
	 */
	public String getStringData() {
		return new String(data);
	}
	
	public long getCreatedTime() {
		return stat.getCtime();
	}

	public long getModifiedTime() {
		return stat.getMtime();
	}
	
	public int getChildrenCount() {
		return stat.getNumChildren();
	}
}
