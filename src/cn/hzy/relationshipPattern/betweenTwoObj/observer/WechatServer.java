package cn.hzy.relationshipPattern.betweenTwoObj.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * 同时有一个List集合，用以保存注册的观察者，等需要通知观察者时，遍历该集合即可。
 * @author hzy
 *
 */
public class WechatServer implements Observerable{

	//注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
	private List<Observer> list;
	
	private String message;
	
	public WechatServer() {
		
		list = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		list.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			Observer observer = list.get(i);
			observer.update(message);
		}
	}
	
	public void setInfomation(String information){
		
		this.message = information;
		
		System.out.println("微信服务更新消息： " + information);
		
		//消息更新，通知所有观察者
        notifyObserver();
	}

}
