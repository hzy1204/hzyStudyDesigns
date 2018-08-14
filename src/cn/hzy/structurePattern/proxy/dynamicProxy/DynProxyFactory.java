package cn.hzy.structurePattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 生成动态代理对象的工厂
 * 
 * @author hzy
 *
 */
public class DynProxyFactory {
	// 客户类调用此工厂方法获得代理对象。
	// 对客户类来说，其并不知道返回的是代理类对象还是委托类对象。
	public static Subject getInstance() {
		Subject delegate = new RealSubject();
		InvocationHandler handler = new SubjectInvocationHandler(delegate);
		Subject proxy = null;
		proxy = (Subject) Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
				delegate.getClass().getInterfaces(), handler);
		return proxy;
	}
}
