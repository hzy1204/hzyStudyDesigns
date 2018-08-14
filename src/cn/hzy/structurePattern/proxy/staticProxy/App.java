package cn.hzy.structurePattern.proxy.staticProxy;

public class App {
	
	public static void main(String[] args) {
		
		/**
		 * 客户并不知道代理委托了另一个对象
		 */
		IUserDao proxy = new UserDaoProxy();
		
		proxy.save();
	}

}
