package cn.hzy.relationshipPattern.betweenTwoObj.observer;

/**
 * 抽象观察者（观察者--本例中是用户，就是调用服务的一方）
 * 定义了一个uodate()方法，当被观察者调用notifyObserver()方法时，观察者的update()方法会被回调。
 * @author hzy
 *
 */
public interface Observer {

	public void update(String message);
}
