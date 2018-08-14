package cn.hzy.creationPattern.simpleFactory;

import cn.hzy.creationPattern.simpleFactory.impl.MailSender;
import cn.hzy.creationPattern.simpleFactory.impl.SmsSender;

/**
 * 工厂，只有一个方法，根据传进来的字符串来选择创建哪种发送方式的对象
 * @author hzy
 *
 */
public class SendFactory {
	
	public Sender produce(String type){
		if ("邮件".equals(type)) {
			return new MailSender();
		}else if ("短信".equals(type)) {
			return new SmsSender();
		}else {
			System.out.println("请输入正确的类型！");
			return null;
		}
	}

}
