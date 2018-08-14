package cn.hzy.structurePattern.adapter.adapterForClass;

/**
 * 这就是目标接口，（将source类的功能扩展到这个接口）
 * @author hzy
 *
 */
public interface Targetable {

	/* 与原类中的方法相同 */ 
	public void method1();
	
	/* 新类的方法 */
	public void method2();
}
