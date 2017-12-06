package com.inetsoft.singleton;

/**
 * @Description: 饿汉式单例 
 * @Warning: 在多线程的情况下不一定真正的单例
 * @Author DreamLi
 * @Package SingletonPattern  --  com.inetsoft.singleton.HungrySingleton
 * @Date: 2017年12月6日 上午8:23:12
 * @Version: 1.0.0
 */
public class HungrySingleton {
	
	private HungrySingleton() {}

	private static HungrySingleton hungrySingleton;
	
	public static HungrySingleton getInstance() {
		if(hungrySingleton == null) {
			hungrySingleton = new HungrySingleton();
		}
		
		return hungrySingleton;
	}
}
