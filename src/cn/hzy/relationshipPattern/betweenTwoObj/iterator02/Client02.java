package cn.hzy.relationshipPattern.betweenTwoObj.iterator02;

public class Client02 {

	public static void main(String[] args) {
		Client02 client = new Client02();  
        client.operation(); 
	}
	
	public void operation(){  
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};  
        //创建聚合对象  
        Aggregate02 agg = new ConcreteAggregate02(objArray);  
        //循环输出聚合对象中的值  
        Iterator02 it = agg.createIterator();  
        while(!it.isDone()){  
            System.out.println(it.currentItem());  
            it.next();  
        }  
    }
}
