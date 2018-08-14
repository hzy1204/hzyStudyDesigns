package cn.hzy.structurePattern.flyweight.simpleFlyweight;

/**
 * 其中的一个具体享元角色类
 * @author hzy
 *
 */
public class ConcreteFlyweight02 extends Flyweight{

	/**
	 * 具体享元角色类ConcreteFlyweight有一个内部状态，在本例中父类已经实现了内部状态inside()，所有的享元对象，这一部分是一样的
	 * 它的值应当在享元对象被创建时赋予。所有的内部状态在对象创建之后，就不会再改变了。
	 * 如果一个享元对象有外部状态的话，所有的外部状态都必须存储在客户端，在使用享元对象时，再由客户端传入享元对象。这里只有
	 * 一个外部状态，operation()方法的参数state就是由外部传入的外部状态。
	 */
	
	/**
	 * 外部状态作为参数传入方法中，改变方法得行为，
	 * 但是并不改变对象得内部状态。
	 * 这里就是当前享元对象区别于其他享元对象的地方
	 */
	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("外部状态为 ： Extrinsic State = "+state);
		System.out.println("5+7="+(5+7));
		
	}

}
