package cn.hzy.creationPattern.prototype;

/**
 * 原型模式虽然是创建型的模式，但是与工厂模式没有关系，从名字即可看出，
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 * @author hzy
 *
 */
public class SimplePrototype implements Cloneable {

	/**
	 * 很简单，一个原型类，只需要实现Cloneable接口，覆写clone方法，
	 * 此处clone方法可以改成任意的名称，因为Cloneable接口是个空接口，
	 * 你可以任意定义实现类的方法名，如cloneA或者cloneB，
	 * 因为此处的重点是super.clone()这句话，super.clone()调用的是Object的clone()方法，
	 * 而在Object类中，clone()是native的，具体怎么实现，此处不再深究。
	 * 
	 * 首先需要了解对象深、浅复制的概念：
	 */
	public Object clone() throws CloneNotSupportedException{
		SimplePrototype proto = (SimplePrototype) super.clone();
		return proto;
	}
}
