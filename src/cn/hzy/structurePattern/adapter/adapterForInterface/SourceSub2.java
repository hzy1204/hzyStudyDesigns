package cn.hzy.structurePattern.adapter.adapterForInterface;

/**
 * 注意：这个类相当于只实现了一个方法method2
 * @author hzy
 *
 */
public class SourceSub2 extends Adapter{

	//覆写的父类方法
	public void method2(){  
        System.out.println("方法2的实现");  
    }  
}
