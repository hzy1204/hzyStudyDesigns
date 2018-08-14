package cn.hzy.structurePattern.adapter.adapterForClass;

/**
 * 这是一个Source类，拥有一个方法，待适配，（将这个source类的功能扩展到目标接口里）
 * @author hzy
 *
 */
public class Source {

	public void method1(){
		
		System.out.println("这是source的功能");
	}
}
