package cn.hzy.structurePattern.adapter.adapterForClass;

public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		/**
		 * 这个方法是因为Adapter继承了Source，同时还实现了Targetable接口
		 * Targetable接口就具备了Source类的功能
		 */
		target.method1();
		target.method2();
	}
}
