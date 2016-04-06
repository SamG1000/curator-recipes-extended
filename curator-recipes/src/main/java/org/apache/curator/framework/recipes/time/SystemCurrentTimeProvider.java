package org.apache.curator.framework.recipes.time;

/**
 * Native java implementation of current time
 */
public class SystemCurrentTimeProvider implements CurrentTimeProvider {

	@Override
	public long getCurrentTime() throws Exception {
		return System.currentTimeMillis();
	}

}
