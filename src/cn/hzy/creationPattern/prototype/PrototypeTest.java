package cn.hzy.creationPattern.prototype;

import java.io.IOException;

/**
 * 完全没用的测试  应该是测试方式不对  
 * 
 * 测试目标： 体现下面一段话
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
 * 		简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * @author hzy
 *
 */
public class PrototypeTest {

	public static void main(String[] args) {
		
		Prototype prototype = new Prototype();
		try {
			Object clone = prototype.clone();
			System.out.println(prototype==clone);
			System.out.println(prototype.equals(clone));
			System.out.println(prototype);
			System.out.println(clone);
			System.out.println((clone instanceof Prototype));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("===============");
		
		try {
			Object deepClone = prototype.deepClone();
			System.out.println(prototype==deepClone);
			System.out.println(prototype.equals(deepClone));
			System.out.println(prototype);
			System.out.println(deepClone);
			System.out.println((deepClone instanceof Prototype));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
