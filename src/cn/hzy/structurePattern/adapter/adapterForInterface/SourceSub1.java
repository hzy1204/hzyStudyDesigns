package cn.hzy.structurePattern.adapter.adapterForInterface;

/**
 * 注意：这个类相当于只实现了一个方法method1
 * @author hzy
 *
 */
public class SourceSub1 extends Adapter {

	@Override//这里加不加@Override都一样，都是覆写的父类方法，我只是加上来验证到底是不是覆写的父类的方法
	public void method1(){
		System.out.println("方法1的实现");
	}
}
