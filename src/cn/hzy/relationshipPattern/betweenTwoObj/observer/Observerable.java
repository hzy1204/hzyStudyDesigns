package cn.hzy.relationshipPattern.betweenTwoObj.observer;

/**
 * 抽象被观察者接口（被观察者--本例中是微信公众号，就是提供服务的一方）
 * 声明了添加、删除、通知观察者方法
 * @author hzy
 *
 */
public interface Observerable {

	//注册服务(添加)
	public void registerObserver(Observer o);
	//注销服务(删除)
	public void removeObserver(Observer o);
	//发布服务(通知观察者)
	public void notifyObserver();
	
}
