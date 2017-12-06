package com.inetsoft.singleton;
/**
 * @Description: 双重检查加锁单例: 解决饿汉式的多线程问题和效率问题 
 * @Warning: 双重检查加锁模式需要 JDK1.5 或以上才能完全支持 volatile 的单例
 * @Author DreamLi
 * @Package SingletonPattern  --  com.inetsoft.singleton.DoubleCheckLockSingleton
 * @Date: 2017年12月6日 上午8:32:08
 * @Version: 1.0.0
 */
public class DoubleCheckLockSingleton {
	private static volatile DoubleCheckLockSingleton singleton;

	private DoubleCheckLockSingleton() {}
	
	public static DoubleCheckLockSingleton getInstance() {
		if(singleton == null) {
			synchronized (DoubleCheckLockSingleton.class) {
				if(singleton == null) {
					singleton = new DoubleCheckLockSingleton();
				}
			}
		}
		
		return singleton;
	}
	
	
	
}
