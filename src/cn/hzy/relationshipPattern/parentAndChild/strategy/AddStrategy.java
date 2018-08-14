package cn.hzy.relationshipPattern.parentAndChild.strategy;

/**
 * 实现加法运算
 * @author hzy
 *
 */
public class AddStrategy implements Strategy{

	@Override
	public int caculate(int a, int b) {

		return a+b;
	}

}
