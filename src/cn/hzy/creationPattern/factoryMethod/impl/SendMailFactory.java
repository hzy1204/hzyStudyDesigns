package cn.hzy.creationPattern.factoryMethod.impl;

import cn.hzy.creationPattern.factoryMethod.Provider;
import cn.hzy.creationPattern.factoryMethod.Sender;

/**
 * 这个工厂去实现工厂接口，这个工厂只提供邮件发送方式的对象
 * @author hzy
 *
 */
public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
