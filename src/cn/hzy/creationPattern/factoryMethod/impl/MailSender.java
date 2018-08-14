package cn.hzy.creationPattern.factoryMethod.impl;

import cn.hzy.creationPattern.factoryMethod.Sender;

/**
 * 发送邮件的实现
 * @author hzy
 *
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("邮件发送！");

	}

}
