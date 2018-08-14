package cn.hzy.relationshipPattern.parentAndChild.strategy;

public class Test {

	/**
	 * 客户端根据具体的需求（环境），采用对应的策略
	 * @param args
	 */
	public static void main(String[] args) {
		//加法
		Context context1 = new Context(new AddStrategy());
		System.out.println(context1.calculate(20, 10));
		//减法
		Context context2 = new Context(new SubstractStrategy());
		System.out.println(context2.calculate(20, 10));
		//乘法
		Context context3 = new Context(new MultiplyStrategy());
		System.out.println(context3.calculate(20, 10));
		//除法
		Context context4 = new Context(new DivisionStrategy());
		System.out.println(context4.calculate(20, 10));
	}
}
