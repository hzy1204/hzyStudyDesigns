package cn.hzy.structurePattern.adapter.adapterForInterface;

/**
 * 提供一个抽象类，去实现Sourceable接口。抽象类可以不实现接口里面的方法
 * 但是我们在这个抽象类中提供和接口方法名一样的方法(普通方法，不能是抽象方法)
 * 因为如果是抽象方法的话，就和接口里面的方法没有区别了（都必须要覆写）
 * 因为是普通方法，需哦一我想实现哪个方法就实现哪个方法，不用全部都实现，哪怕是空实现也不需要，
 * 而且就算子类调到没实现的那个方法，如AdapterTest测试类里面source1.method2();Source1并没有实现method2，但是也不会报错
 * 因为父类已经完成空实现了
 * 
 * 备注：接口里面的方法加不加abstract都一样，都是抽象方法
 * @author hzy
 *
 */
public abstract class Adapter implements Sourceable {

	public void method1() {
	}

	public void method2() {
	}

}
