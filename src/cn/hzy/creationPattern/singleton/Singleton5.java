package cn.hzy.creationPattern.singleton;

/**
 * 考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响。
 * 
 * 我的理解：和Singleton3的不同点，以及为什么不会出现Singleton3的情况
 * 这里我们将创建和getInstance()分开了，synchronized锁住了初始化也就是创建对象实例的整个方法，不会出现Singleton3的情况
 * 
 * @author hzy
 *
 */
public class Singleton5 {

	private static Singleton5 instance = null;

	private Singleton5() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new Singleton5();
		}
	}

	public static Singleton5 getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}
}
