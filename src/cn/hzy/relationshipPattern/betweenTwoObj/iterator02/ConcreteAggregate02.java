package cn.hzy.relationshipPattern.betweenTwoObj.iterator02;

/**
 * 具体聚集角色类 实现了抽象聚集角色所要求的接口，也就是createIterator()方法。
 * 此外，聚集类有一个内部成员类ConcreteIterator，这个内部类实现了抽象迭代子角色所规定的接口；
 * 而工厂方法createIterator()所返还的就是这个内部成员类的实例。
 * 
 * @author hzy
 *
 */
public class ConcreteAggregate02 extends Aggregate02{

	private Object[] objArray = null;

	/**
	 * 通过构造函数将具体的内容传进这个聚合对象
	 * 
	 * @param objArray
	 */
	public ConcreteAggregate02(Object[] objArray) {
		this.objArray = objArray;
	}

	@Override
	public Iterator02 createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator02();
	}
	
	/**
	 * 内部成员类，具体迭代子类
	 */
	private class ConcreteIterator02 implements Iterator02{

		//内部索引，记录当前迭代到的索引位置  
        private int index = 0;  
        
        //记录当前聚集对象的大小  
        private int size = 0;  
        
        /** 
         * 构造函数 
         */  
        public ConcreteIterator02(){  
              
            this.size = objArray.length;  
            index = 0;  
        }
		@Override
		public void first() {
			// TODO Auto-generated method stub
			index = 0;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (index < size) {
				index ++;
			}
		}

		@Override
		public boolean isDone() {
			// TODO Auto-generated method stub
			return (index >= size);
		}

		@Override
		public Object currentItem() {
			// TODO Auto-generated method stub
			return objArray[index];
		}
		
		
	}
	
	
}
