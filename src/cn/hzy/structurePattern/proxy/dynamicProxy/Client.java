package cn.hzy.structurePattern.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {

		//创建代理对象 -- 注意，客户需要的是一个RealSubject，因为客户的目标是执行RealSubject里面的dealTask(String taskName)方法
		//但是我们这里创建的是一个代理对象，通过这个代理对象去调用客户需要的方法  -- 也就是说客户这边是不知道创建的是一个代理对象，（客户也不需要管创建的是什么对象，只要能实现功能即可）
		Subject proxy = DynProxyFactory.getInstance();
		System.out.println(proxy instanceof RealSubject);//输出为false
		System.out.println(proxy);//打印一个对象，会调用到Object类的toString方法，
		System.out.println(proxy.toString());//这里和上面直接打印proxy是一样的
		//为什么打印proxy会打印为null？因为最终SubjectInvocationHandler的invoke方法返回值为null
		/*
		 * 通过上面两行打印：我们发现只要调用了proxy里面的方法，（toString也是，因为Object是所有类的超类）
		 * 就会执行SubjectInvocationHandler里面的invoke方法，我们调用了的那个方法，会作为参数传递过去，
		 * 比如这里调用的public java.lang.String java.lang.Object.toString()就会传递到invoke方法里的Method method参数
		 * 
		 */
		
		System.out.println(proxy instanceof Proxy);
		
//		System.out.println(proxy.getClass());
		proxy.dealTask("DBQueryTask");
//		//System.out.println(proxy);
//		System.out.println(proxy.getClass());
	}
	

}
