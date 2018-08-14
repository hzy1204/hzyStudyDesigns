package cn.hzy.creationPattern.factoryMethod.test;

import cn.hzy.creationPattern.factoryMethod.Provider;
import cn.hzy.creationPattern.factoryMethod.Sender;
import cn.hzy.creationPattern.factoryMethod.impl.SendMailFactory;

public class FactoryMethodTest {

	public static void main(String[] args) {
		/**
		 * 选取相应的实体对象工厂类去得到的相应的实体对象
		 */
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
