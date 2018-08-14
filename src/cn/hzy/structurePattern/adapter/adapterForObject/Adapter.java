package cn.hzy.structurePattern.adapter.adapterForObject;

/**
 * 这种适配器模式不直接继承Source类，而是持有Source类的实例，这样有个好处就是
 * 可以解决Source类和Targetable接口方法名不一致的情况，解决了兼容性
 * @author hzy
 *
 */
public class Adapter implements Targetable {

	 private Source source;  
     public Adapter(Source source){  
         super();  
         this.source = source;  
     }  
     @Override  
     public void method2() {  
         System.out.println("这是自己实现的方法");  
     }  
     @Override  
     public void method1() {  
         source.method1111();  
     } 
}
