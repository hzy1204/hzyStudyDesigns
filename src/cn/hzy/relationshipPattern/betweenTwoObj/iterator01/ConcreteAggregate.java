package cn.hzy.relationshipPattern.betweenTwoObj.iterator01;

/**
 * 具体聚集角色类
 * 实现了抽象聚集角色类所要求的接口，也就是createIterator()方法。
 * 此外，还有方法getElement()向外界提供聚集元素，    注意 ： 这两个方法是向外界开放的  迭代子就是通过这两个方法来进行迭代的
 * 而方法size()向外界提供聚集的大小等。
 * @author hzy
 *
 */
public class ConcreteAggregate extends Aggregate{

	private Object[] objArray = null;
	
	/**
	 * 通过构造函数将具体的内容传进这个聚合对象
	 * @param objArray
	 */
	public ConcreteAggregate(Object[] objArray) {
		this.objArray = objArray;
	}
	
	/**
	 * 提供一个createIterator方法来得到当前聚合对象的迭代子对象
	 */
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	/**
	 * 取值方法：向外界提供聚集元素
	 */
	public Object getElement(int index){
		
		if (index < objArray.length) {
			return objArray[index];
		}else {
			return null;
		}
	}
	
	/**
	 * 取值方法：向外界提供聚集大小
	 */
	public int size(){
		return objArray.length;
	}
	
	
}
