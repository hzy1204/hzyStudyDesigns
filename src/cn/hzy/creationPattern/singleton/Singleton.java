package cn.hzy.creationPattern.singleton;

public class Singleton {

	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static Singleton instance = null;
	
	/* 私有构造方法，防止被实例化 */  
	private Singleton(){
		
	}
	
	/* 静态工程方法，创建实例 */
	/**
	 * 当在多线程情况下，A线程进入getInstance()方法，此时instance为null，执行instance = new Singleton2();
	 * 当instance = new Singleton2()还未执行完毕时，B线程进入getInstance()，此时instance依然为null
	 * B也会执行instance = new Singleton2(),此时，就不满足单例模式了
	 * 
	 * 解决方案见Singleton2
	 * 
	 * @return
	 */
	public static Singleton getInstance(){
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */ 
	/**
	 * 不懂这里、、、
	 * @return
	 */
    public Object readResolve() {  
        return instance;  
    }  
}
