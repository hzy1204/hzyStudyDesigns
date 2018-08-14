package cn.hzy.structurePattern.decorator;

/**
 * 装饰者抽象类 -- Decorator
 * 维持一个指向Component实例的引用，并定义一个与Component接口一致的接口。
 * 
 * 提供一个方法，在这个方法里面去调用Person接口里面的eat()方法。
 * 
 * 最好提供的这个方法的方法名和需要扩展功能的方法方法名相同，因为装饰模式是对某一个方法动态地扩展功能，方法名一样更能体现这一点
 * 因为这个类是装饰者抽象类，没有具体实现装饰功能，就算我把本类中的eat方法改为eat1方法，只要保证具体装饰者里面为super.eat1()，也没问题    最好一样
 * 
 * 但是，具体装饰对象中的装饰方法一定要和被装饰的方法名一致
 * @author hzy
 *
 */
public abstract class Decorator implements Person {

	private Person person;

	public void setPerson(Person person) {
		this.person = person;
	}

	public void eat() {
		person.eat();
	}

}
