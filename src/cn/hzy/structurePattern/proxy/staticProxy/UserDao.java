package cn.hzy.structurePattern.proxy.staticProxy;

/**
 * 接口实现
 * 被代理类
 * @author hzy
 *
 */
public class UserDao implements IUserDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("数据已保存！");

	}

}
