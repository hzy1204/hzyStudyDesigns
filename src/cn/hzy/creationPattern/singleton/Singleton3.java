package cn.hzy.creationPattern.singleton;

public class Singleton3 {

	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static Singleton3 instance = null;
	
	/* 私有构造方法，防止被实例化 */  
	private Singleton3(){
		
	}
	
	/* 静态工程方法，创建实例 */ 
	/**
	 * 不给这个getInstance()方法加锁，只在实例化的地方加锁，乍一看似乎能解决问题，
	 * 但是如果考虑到JVM在执行instance = new Singleton3()这个操作时的特殊情况就有可能或出现错误
	 * 
	 * 在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton3();语句是分两步执行的。
	 * 但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，
	 * 然后再去初始化这个Singleton实例。这样就可能出错了，
	 * 
	 * 我们以A、B两个线程为例：
	 * 1、A、B线程同时进入了第一个if判断
	 * 2、A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton3();
	 * 3、由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例，但是instance此时不为null了），
	 * 然后A离开了synchronized块，      # 并不是说就不执行instance = new Singleton3()了。而是A执行完了，但是具体操作是JVM进行的，而且这里A只是离开synchronized块，
	 * 并没有离开getInstance()方法，JVM只会保证在A离开getInstance()方法之前初始化Singleton3  #   两个#号之间是我不确定的部分，暂时这么理解
	 * 由于instance = new Singleton3()这个操作对于JVM来说是分两步执行的，但是JVM并不保证这两个操作的先后顺序，
	 * 也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。
	 * 
	 * 4、在JVM初始化Singleton3实例完成之前，B进入getInstance()方法，判断instance此时不为null（JVM先画出了一些分配给Singleton实例的空白内存，也就是说instance此时为一个空白内存，不为null）
	 * 因此B马上离开了synchronized块并将结果返回给调用该方法的程序。
	 * 
	 * 5、此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
	 * 
	 * 解决方法见Singleton4
	 * 
	 * 
	 * @return
	 */
	public static Singleton3 getInstance(){
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
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
