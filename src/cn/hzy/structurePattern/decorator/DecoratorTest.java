package cn.hzy.structurePattern.decorator;

/**
 * 注意这里的继承体系：    
 * 		Decorator implements Person
 * 		ManDecoratorA extends Decorator
 * 		ManDecoratorB extends Decorator
 * 
 * 而在Decorator中setter注入的是Person
 * 
 * 根据里氏替换原则，也可以注入ManDecoratorA和ManDecoratorB
 * 
 * 执行流程：
 * 		mdA.setPerson(man);执行Decorator中的setPerson(Person person)方法 	  
 * 				-----  Decorator类中  传的参数为Man man  				此时Person接口的具体类为Man  Person=Man(id=19)  调用Decorator的eat方法是调用的Man里面的eat方法
 * 
 * 		mdB.setPerson(mdA);执行Decorator中的setPerson(Person person)方法 	  
 * 				-----  Decorator类中  传的参数为ManDecoratorA mdA		此时Person接口的具体类为ManDecoratorA  Person=ManDecoratorA(id=22)  调用Decorator的eat方法是调用的ManDecoratorA里面的eat方法
 * 
 * 最后执行：
 * 		mdB.eat();执行ManDecoratorB里面的eat()方法 ,--> 执行super.eat();  							  -----  ManDecoratorB类中
 * 					执行Decorator中的eat(),调用Decorator的eat方法是调用的ManDecoratorA里面的eat方法     	  -----  ManDecoratorA类中
 * 					执行ManDecoratorA里面的eat方法,--> 执行super.eat();  							  -----  ManDecoratorA类中
 * 					执行Decorator中的eat(),调用Decorator的eat方法是调用的Man里面的eat方法     	  			  -----  Man类中
 * 					执行Man里面的eat方法,--> 打印   	男人在吃
 * 					此时ManDecoratorA里面的eat方法，super.eat();执行完毕，继续执行 -->  打印   	再吃一顿饭
 * 																			  打印	    ManDecoratorA类
 * 					此时ManDecoratorB里面的eat方法，super.eat();执行完毕，继续执行 -->  打印   	===============
 * 																			  打印   	ManDecoratorB类
 * 疑问1：在实例化ManDecoratorB时，为什么传入的ManDecoratorA不会覆盖在实例化ManDecoratorA时传入的Man
 * 疑问 ： 为什么在 23行注释处执行ManDecoratorA里面的eat方法时，最后调用的会是Man里面的eat方法    
 * 		通过bebug模式调试发现程序分别当执行到14和17行注释的地方时，Person指向的对象并不一样，后者并没有覆盖前者，当执行ManDecoratorA里面的eat方法时，super.eat()执行的是Man里面的eat方法，因为Decorator里面的eat方法里面的Person=Man(id=19)
 * 
 * 其实从这个测试中可以看出：我们可以用多个装饰器去装饰同一个对象，这样原来的对象代码没变，但是功能却可以动态地增加了
 * 
 * 装饰器和被装饰的类是聚合关系，就算被装饰的类不存在了，装饰器也能继续存在。
 * @author hzy
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA mdA = new ManDecoratorA();
        //ManDecoratorB mdB = new ManDecoratorB();
        
        mdA.setPerson(man);
        //mdB.setPerson(mdA);
        mdA.eat();
    }
}
