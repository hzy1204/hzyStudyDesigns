package cn.hzy.relationshipPattern.betweenTwoObj.iterator01;

/**
 * 抽象聚集角色类
 * 这个角色规定出所有的具体聚集必须实现的接口。
 * 迭代子模式要求聚集对象必须有一个工厂方法，也就是createIterator()方法，以向外界提供迭代子对象的实例。
 * @author hzy
 *
 */
public abstract class Aggregate {

	public abstract Iterator createIterator();
}
