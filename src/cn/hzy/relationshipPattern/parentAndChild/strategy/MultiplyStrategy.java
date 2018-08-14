package cn.hzy.relationshipPattern.parentAndChild.strategy;

/**
 * 实现乘法运算
 * 
 * @author hzy
 *
 */
public class MultiplyStrategy implements Strategy {

	@Override
	public int caculate(int a, int b) {
		return a*b;

	}

}
