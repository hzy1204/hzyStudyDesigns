package cn.hzy.structurePattern.decorator;

/**
 * 具体装饰者 -- ConcreteDecorator
 * 具体的装饰对象，给内部持有的具体被装饰对象，增加具体的职责。
 * @author hzy
 *
 */
public class ManDecoratorB extends Decorator{

	public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }
}
