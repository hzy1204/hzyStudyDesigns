package cn.hzy.creationPattern.simpleFactory.impl;

import cn.hzy.creationPattern.simpleFactory.Sender;

/**
 * 邮件发送的实现
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
