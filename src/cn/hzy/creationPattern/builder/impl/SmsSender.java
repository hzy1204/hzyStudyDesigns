package cn.hzy.creationPattern.builder.impl;

import cn.hzy.creationPattern.builder.Sender;

/**
 * 短信发送的实现
 * @author hzy
 *
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("短信发送！");

	}

}
