package cn.hzy.structurePattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 这是一个动态代理类对应的调用处理程序类
 * 动态代理角色
 * @author hzy
 *
 */
public class SubjectInvocationHandler implements InvocationHandler{

	//代理类持有一个委托类的对象引用--这个是我们要代理的真实对象
	private Object delegate;
	
	//通过构造方法给我们要代理的真实对象赋初值
	public SubjectInvocationHandler(Object delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//执行方法开始的时间
		Long sTime = System.currentTimeMillis();
		
		//可以在代理真实对象之前进行一些自己的操作，比如说判断等
		System.out.println("参数Method为:"+method);
		
		//利用反射机制将请求分派给委托类处理。Method的invoke返回Object对象作为方法执行结果
		//因为示例程序没有返回值，所以这里忽略了返回值处理
		//当代理对象调用真实对象的方法时，其会自动的跳转到代理对象的handler对象的invoke方法来进行调用
		//method是代理对象调用的方法（客户调用的哪个方法，通过反射拿到这个方法的反射对象），delegeate是代理类调用的委托类，args是调用method方法时传的参数
		method.invoke(delegate, args);
		
		Long fTime = System.currentTimeMillis();
		
		System.out.println("执行任务耗时："+(fTime-sTime)+"毫秒！");
		
		//return "1";
		return null;
	}

}
