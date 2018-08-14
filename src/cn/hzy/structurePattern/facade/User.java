package cn.hzy.structurePattern.facade;

/**
 * 客户端，我要使用电脑，不用去关心电脑里面各个系统是怎样工作的
 * 我只需要和门面类（Computer）打交道，就能实现我想要的功能
 * @author hzy
 *
 */
public class User {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
