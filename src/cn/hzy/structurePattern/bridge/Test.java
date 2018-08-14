package cn.hzy.structurePattern.bridge;

import cn.hzy.structurePattern.bridge.targetCity.CityZ;

/**
 * （1、定义一个桥接口，使其与一方绑定，这一方的扩展全部使用实现桥接口的方式。）
 * 通过一个桥接口Bridge，并提供一个方法供扩展
 * 让右边的城市CityX、CityY、CityZ都去实现桥接口。
 * 
 * （2、定义一个抽象类，来表示另一方，在这个抽象类内部要引入桥接口，而这一方的扩展全部使用继承该抽象类的方式。）
 * 再提供一个抽象类SourceCity，里面包含桥接口的引用，提供一个方法供扩展
 * 让左边的城市CityA、CityB、CityC都去继承这个抽象类
 * 
 * 假如不使用桥接模式的话，要实现左边连接右边，每一种连接方式都需要一个具体类，代码复杂
 * 加入每个城市中又有具体的乡镇的？代码将会呈几何倍数增长，而且修改一方的代码将会导致另一方修改很多的代码，简直是灾难
 * 
 * 而使用了桥接模式的话，再看本例，只是多了一个接口和一个抽象类。
 * 
 * 桥接模式用聚合等关联关系代替了继承，简化了系统
 * 桥接模式提高了系统的可扩展性，注意到，对各个维度的扩展均是独立饿。符合OCP（开闭原则）。
 * 间接实现了对用户隐藏细节的功能。
 * 
 * @author hzy
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		SourceCity sourceCityA = new SourceCityA();
		sourceCityA.bridge = new CityZ();
		
		sourceCityA.fromCity();
		sourceCityA.bridge.targetCity();
		
	}

}
