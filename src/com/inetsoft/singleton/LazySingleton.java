package com.inetsoft.singleton;
/**
 * @Description: 懒汉式单例: 为解决饿汉式单例存在多线程问题，也可以使用懒汉式单例 
 * @Warning: 懒汉式单例虽然可以避免饿汉式单例的多线程问题， 但是在类加载的时候就初始化对象,因此将导致项目启动较慢，
 * 		而且，这个对象可能一直不被使用，将导致内存占用
 * @Author DreamLi
 * @Package SingletonPattern  --  com.inetsoft.singleton.LazySingleton
 * @Date: 2017年12月6日 上午8:28:03
 * @Version: 1.0.0
 */
public class LazySingleton {
	private static LazySingleton lazySingleton = new LazySingleton();

	private LazySingleton() {
	}
	
	public static LazySingleton getInstance() {
		return lazySingleton;
	}
	
}
