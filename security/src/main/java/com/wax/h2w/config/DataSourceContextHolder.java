package com.wax.h2w.config;

public class DataSourceContextHolder {
	private static final ThreadLocal<String> local = new ThreadLocal<String>();

	public static ThreadLocal<String> getLocal() {
		return local;
	}

	/**
	 * 切换到读库
	 */
	public static void change2Read() {
		local.set(DataSourceType.read.getType());
	}

	/**
	 * 切换到写库
	 */
	public static void change2Write() {
		local.set(DataSourceType.write.getType());
	}

	public static String getDatabaseType() {
		return local.get();
	}
}
