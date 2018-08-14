package cn.hzy.relationshipPattern.betweenTwoObj.observer;

import java.util.Timer;

/**
 * 观察者，也就是用户定，微信公众号的具体观察者为用户User
 * 实现了update方法
 * @author hzy
 *
 */
public class User implements Observer{

	private String name;
	private String message;
	
	public User(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		read();
	}

	public void read(){
		System.out.println(name+" 收到推送消息： "+message);
	}
}
