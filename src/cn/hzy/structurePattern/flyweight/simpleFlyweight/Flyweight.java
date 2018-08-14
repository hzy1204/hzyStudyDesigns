package cn.hzy.structurePattern.flyweight.simpleFlyweight;

/**
 * 抽象享元角色类
 * 不一定非得是接口，抽象类也可以，视具体情况而定
 * @author hzy
 *
 */
public abstract class Flyweight {

	//一个示意性方法，参数state是外部状态，外部状态由客户端传递进来
	public abstract void operation(String state);
	
	/**
	 * 内部状态，一般不需要参数，内部状态是可以共享的，及享元对象内一样的一部分
	 * 所以这里我们可以看出，本例中抽象享元角色最好是抽象类，因为我们可以直接在这里写具体实现，再让子类去继承就OK
	 * 
	 * 不同的享元对象就通过外部状态来区分
	 */
	public void inside(){
		System.out.println("所有享元对象都拥有inside()方法，并且内部实现一样，也就是说这个部分是共享的");
	}
}
