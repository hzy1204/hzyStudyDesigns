package cn.hzy.creationPattern.singleton;

import java.util.Vector;

/**
 * 补充：采用"影子实例"的办法为单例对象的属性同步更新
 * 
 * 单例模式看懂了 ， 同步更新没看懂
 * @author hzy
 *
 */
public class Singleton6 {

	private static Singleton6 instance = null;
	private Vector properties = null;

	public Vector getProperties() {
		return properties;
	}

	private Singleton6() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new Singleton6();
		}
	}

	public static Singleton6 getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}

	/**
	 * 我在这里看不出属性同步更新
	 */
	public void updateProperties() {
		Singleton6 shadow = new Singleton6();
		properties = shadow.getProperties();
	}
}
