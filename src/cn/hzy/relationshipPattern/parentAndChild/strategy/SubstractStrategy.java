package cn.hzy.relationshipPattern.parentAndChild.strategy;

/**
 * 实现减法运算
 * @author hzy
 *
 */
public class SubstractStrategy implements Strategy{

	@Override
	public int caculate(int a, int b) {

		return a-b;
	}

}
