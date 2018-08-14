package cn.hzy.structurePattern.adapter.adapterForClass;

/**
 * 这是Adapter  继承Source类  实现Targetable接口
 * 
 * 这样的话Targetable接口，不仅仅是实现了method2这个方法，因为Adapter还继承了Source，
 * 也就是说Targetable接口具有了Source类的功能
 * 
 * 注意 ： 当一个类实现一个接口时，必须实现里面的每一个方法
 * 但是这里Targetable接口有两个抽象方法，Adapter只实现了一个，
 * 是因为Adapter继承了Source，并且在Source类里面有一个和Adapter接口里面method1抽象方法名字一模一样的一个方法
 * 
 * 也就是说要想把Source类里面的功能扩展到Adapter里面，必须要被扩展的那个方法，方法名相同。
 * @author hzy
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("这是自己实现的方法");

	}

}
