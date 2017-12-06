package com.inetsoft.singleton;

/**
 * @Description: 同步饿汉式单例:  为了解决饿汉式单例的多线程问题，可以将 getInstance 方法进行同步;
 * @Warning: 该模式虽然可以避免多线程问题,但是每次获取类实例都在经历同步，若频繁的获取类实例将导致效率低下
 * @Author DreamLi
 * @Package SingletonPattern  --  com.inetsoft.singleton.SyncHungrySingleton
 * @Date: 2017年12月6日 上午8:25:22
 * @Version: 1.0.0
 */
public class SyncHungrySingleton {
	private SyncHungrySingleton() {}

	private static SyncHungrySingleton syncHungrySingleton;
	
	public synchronized static SyncHungrySingleton getInstance() {
		if(syncHungrySingleton == null) {
			syncHungrySingleton = new SyncHungrySingleton();
		}
		
		return syncHungrySingleton;
	}
}
