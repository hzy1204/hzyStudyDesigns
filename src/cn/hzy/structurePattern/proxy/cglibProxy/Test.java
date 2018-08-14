package cn.hzy.structurePattern.proxy.cglibProxy;

public class Test {

	public static void main(String[] args) {
		CGLibProxy proxy = new CGLibProxy();
		Object proxy2 = proxy.getProxy(Train.class);
		System.out.println(proxy2.getClass()+"==========");
		System.out.println(proxy2.getClass().getSuperclass()+"====1111======");
		System.out.println((proxy2 instanceof Train)+"**********");//发现代理类为委托类的子类
		Train train = (Train) proxy2;
		train.move();
	}
}
