package cn.hzy.structurePattern.proxy.cglibProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 生成代理（要用到spring-core包）
 * @author hzy
 *
 */
public class CGLibProxy implements MethodInterceptor{

	//1.工具类
	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class<?> clazz){
		//2.设置父类
		enhancer.setSuperclass(clazz);
		//3.设置回调函数
		enhancer.setCallback(this);
		//4.创建子类（代理对象）
		return enhancer.create();
	}
	
	
	/**
	 * 拦截所有 目标类方法的调用
	 * 参数：obj  代理对象（其父类就是委托对象）
	 * 		method  目标方法   在本例中，这个method=Train.move()
	 * 		args  调用这个method需要的参数
	 * 		proxy  org.springframework.cglib.proxy.MethodProxy@246b179d
	 * 				
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("日志开始");
//		System.out.println(obj.getClass()+"999999999999");
//		System.out.println(obj.getClass().getSuperclass()+"999999999999");
//		System.out.println(proxy.getClass()+"8888888888");
//		System.out.println(proxy);
//		System.out.println(proxy.getClass().getSuperclass()+"8888888888");
//		System.out.println(method.getClass()+"7777777777777");
//		System.out.println(method);
//		System.out.println(method.getClass().getSuperclass()+"7777777777777");
		//代理类调用父类的方法（执行委托类方法）
		/**
		 * 以下两种方法效果一样，都会去执行Train里面的move()方法
		 */
		proxy.invokeSuper(obj, args);
		method.invoke(new Train(), args);
		
		System.out.println("日志结束");
		
		return null;
	}

}
