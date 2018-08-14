package cn.hzy.structurePattern.decorator;

/**
 * 具体装饰者 -- ConcreteDecorator
 * 具体的装饰对象，给内部持有的具体被装饰对象，增加具体的职责。
 * 
 * 提供一个方法，通过super.eat();去调用父类的eat()方法，（父类的eat()方法其实就是调用的Person里面的eat()方法）
 * 
 * 只要保证了调用了父类的eat()方法，接下来我们就可以在本类提供的方法里面进行功能的扩展了
 * 
 * 如：本例子中，先是通过调用reEat();扩展了一个打印"再吃一顿饭"的功能，然后又扩展了一个打印"ManDecoratorA类"的功能
 * @author hzy
 *
 */
public class ManDecoratorA extends Decorator{

	public void eat() {
        super.eat();
        reEat();
        //System.out.println("ManDecoratorA类");
    }

    public void reEat() {
        System.out.println("再吃一顿饭");
    }
}
