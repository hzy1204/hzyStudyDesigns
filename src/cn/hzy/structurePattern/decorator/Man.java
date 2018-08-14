package cn.hzy.structurePattern.decorator;

/**
 * 具体被装饰的类 -- ConcreteComponent
 * 定义这样一个对象，可以给这个对象添加一些职责。
 * @author hzy
 *
 */
public class Man implements Person {
	@Override
	public void eat() {
		System.out.println("吃饭");
	}
}
