package cn.hzy.creationPattern.builder.impl;

import cn.hzy.creationPattern.builder.Sender;

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
