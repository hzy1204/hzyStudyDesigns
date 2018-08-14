package cn.hzy.structurePattern.adapter.adapterForInterface;

public class AdapterTest {

	public static void main(String[] args) {  
        Sourceable source1 = new SourceSub1();  
        Sourceable source2 = new SourceSub2();  
        System.out.println((source1 instanceof Sourceable));
        source1.method1();  
        source1.method2();  
        System.out.println((source2 instanceof Sourceable));
        source2.method1();  
        source2.method2();  
    } 
}
