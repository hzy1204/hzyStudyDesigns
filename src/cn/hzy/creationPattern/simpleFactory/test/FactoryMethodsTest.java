package cn.hzy.creationPattern.simpleFactory.test;

import cn.hzy.creationPattern.simpleFactory.SendFactoryMethods;
import cn.hzy.creationPattern.simpleFactory.Sender;

public class FactoryMethodsTest {

	public static void main(String[] args) {
		SendFactoryMethods sendFactoryMethods = new SendFactoryMethods();
		/**
		 * 直接调用对应的工厂类方法来获取想获得的对象实体,这里不需要实例化工厂类
		 */
		Sender sender = sendFactoryMethods.produceMail();
		sender.send();
	}
}
