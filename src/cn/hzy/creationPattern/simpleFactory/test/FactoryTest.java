package cn.hzy.creationPattern.simpleFactory.test;

import cn.hzy.creationPattern.simpleFactory.SendFactory;
import cn.hzy.creationPattern.simpleFactory.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		try {
			/**
			 * 当传入的字符串出错时，就不能创建对象 
			 */
			Sender sender = sendFactory.produce("邮1件");
			sender.send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
