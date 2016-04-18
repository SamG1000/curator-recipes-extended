package org.apache.curator.framework.recipes.time;

public interface CurrentTimeProvider {
	public long getCurrentTime() throws Exception;
}
