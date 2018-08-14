package cn.hzy.creationPattern.simpleFactory.test;

import cn.hzy.creationPattern.simpleFactory.SendFactoryStaticMethods;
import cn.hzy.creationPattern.simpleFactory.Sender;

public class FactoryStaticMethodsTest {
	
	public static void main(String[] args) {
		/**
		 * 直接调用工厂的静态方法来获取对应的对象实体。
		 */
		Sender sender = SendFactoryStaticMethods.produceMail();
		sender.send();
	}

}
