package cn.hzy.creationPattern.factoryMethod.impl;

import cn.hzy.creationPattern.factoryMethod.Sender;

/**
 * 发送短信的实现
 * @author hzy
 *
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("短线发送！");

	}

}
