package cn.hzy.relationshipPattern.parentAndChild.templateMethod;

/**
 * 模板方法模式适用场景
 * 	一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
 * 	各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。
 *  首先识别现有代码中的不同之处，并且将不同之处分离为新的操作。
 *  最后，用一个调用这些新的操作的模板方法来替换这些不同的代码。
 * 	控制子类扩展。模板方法只在特定点调用“useCar”操作，这样就只允许在这些点进行扩展。
 * 
 * 提供一个汽车模型
 * 
 * @author hzy
 *
 */
public abstract class Car {

	//汽车启动
	protected abstract void start();
	
	//刹车
	protected abstract void stop();
	
	//用户并不需要关注你的车怎么启动或者停下来的，可以开可以停就可以啦
	final public void useCar(){
		start();
		stop();
	}
}
