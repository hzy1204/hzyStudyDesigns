package cn.hzy.creationPattern.factoryMethod;

/**
 * 提供一个接口，让工厂类去实现，当我们需要增加功能时，
 * 直接增加实现类，而不用改原来的代码，符合开闭原则
 * @author hzy
 *
 */
public interface Provider {
	
	public Sender produce();

}
