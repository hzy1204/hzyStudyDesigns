package cn.hzy.relationshipPattern.parentAndChild.strategy;

/**
 * 定义具体的环境角色，持有Strategy接口的引用，
 * 并且有get和set方法可以完成策略更换。
 * 在环境角色中调用接口的方法完成动作。
 * @author hzy
 *
 */
public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int calculate(int a,int b) {
		// TODO Auto-generated method stub
		return strategy.caculate(a, b);
	}
	
	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
}
