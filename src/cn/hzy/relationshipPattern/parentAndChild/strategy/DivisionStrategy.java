package cn.hzy.relationshipPattern.parentAndChild.strategy;

/**
 * 实现除法运算
 * @author hzy
 *
 */
public class DivisionStrategy implements Strategy{

	@Override
	public int caculate(int a, int b) {
		if (b != 0) {
			return a / b;
		}

		else {
			throw new RuntimeException("除数不能为零");
		}

	}

}
