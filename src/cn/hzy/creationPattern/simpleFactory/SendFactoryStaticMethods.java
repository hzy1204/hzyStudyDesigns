package cn.hzy.creationPattern.simpleFactory;

import cn.hzy.creationPattern.simpleFactory.impl.MailSender;
import cn.hzy.creationPattern.simpleFactory.impl.SmsSender;

/**
 * 工厂，提供多个不同的静态方法，来得到不同的对象实体
 * @author hzy
 *
 */
public class SendFactoryStaticMethods {
	
	public static Sender produceMail(){
			return new MailSender();
	}
	public static Sender produceSms(){
			return new SmsSender();
	}

}
