package cn.hzy.structurePattern.proxy.staticProxy;

/**
 * 代理对象，静态代理
 * @author hzy
 *
 */
public class UserDaoProxy implements IUserDao {
	
	private IUserDao target;
	
	public UserDaoProxy() {
		/**
		 * 在编译的时候就知道要代理哪个类
		 */
		this.target = new UserDao();
	}

	@Override
	public void save() {
		System.out.println("开始事务！");
		target.save();
		System.out.println("提交事务！");

	}

}
