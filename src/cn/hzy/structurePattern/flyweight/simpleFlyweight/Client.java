package cn.hzy.structurePattern.flyweight.simpleFlyweight;

public class Client {

	/**
	 * 享元模式：这里其实只有两个对象，
	 * @param args
	 */
	public static void main(String[] args) {
		
		//定义五个对象
		Flyweight fw1,fw2,fw3,fw4,fw5;
		
		//获取享元工厂
		FlyweightFactory factory = FlyweightFactory.getInstance();
		
		//通过享元工厂获取三个ConcreteFlyweight01类对象
		fw1 = factory.getFlyweight("ConcreteFlyweight01");
		fw2 = factory.getFlyweight("ConcreteFlyweight01");
		fw3 = factory.getFlyweight("ConcreteFlyweight01");
		//通过享元工厂获取两个ConcreteFlyweight02类对象
		fw4 = factory.getFlyweight("ConcreteFlyweight02");
		fw5 = factory.getFlyweight("ConcreteFlyweight02");
		
		System.out.println("打印ConcreteFlyweight01类型的享元对象：");
		System.out.println(fw1);
		System.out.println(fw2);
		System.out.println(fw3);
		System.out.println("打印ConcreteFlyweight02类型的享元对象：");
		System.out.println(fw4);
		System.out.println(fw5);
		/**
		 * 每个对象可以负责不同的功能，但是他们也都有相同的功能
		 * 也就是说内部状态一致，外部状态不一致
		 */
		//调用内部状态
		System.out.println("调用内部状态：");
		fw1.inside();
		fw2.inside();
		fw3.inside();
		fw4.inside();
		fw5.inside();
		System.out.println("调用ConcreteFlyweight01类型的享元对象的外部状态：");
		fw1.operation("第一次");
		fw2.operation("第二次");
		fw3.operation("第三次");
		System.out.println("调用ConcreteFlyweight02类型的享元对象的外部状态：");
		fw4.operation("第一次");
		fw5.operation("第二次");
		
		//判断是否是同一个对象
		System.out.println("fw1 == fw2 "+(fw1 == fw2));
		System.out.println("fw4 == fw5 "+(fw4 == fw5));
		System.out.println("fw1 == fw4 "+(fw1 == fw4));
		
	}
}
