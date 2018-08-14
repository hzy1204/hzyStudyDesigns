package cn.hzy.structurePattern.flyweight.simpleFlyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	//定义一个HashMap用于存储享元对象，实现享元池
	private static Map<String, Flyweight> files = new HashMap<String,Flyweight>();
	
	//提供一个私有化字段，得到该工厂类的实例，并添加static字段保证下面的getInstance方法能够调用
	private static FlyweightFactory instance = new FlyweightFactory();

	
	//享元工厂类的构造函数，(私有化该构造函数，保证单例),将享元对象放入享元池备用
	private FlyweightFactory() {
		Flyweight c1,c2;
		
		c1 = new ConcreteFlyweight01();
		files.put("ConcreteFlyweight01", c1);
		
		c2 = new ConcreteFlyweight02();
		files.put("ConcreteFlyweight02", c2);
	}
	
	//返回该享元工厂的唯一实例
	public static FlyweightFactory getInstance() {
		return instance;
	}
	
	//通过享元池里面的key来获取存储在Hashtable中的享元对象
	public static Flyweight getFlyweight(String type){
		
		return files.get(type);
	}
	
	
}
