package cn.hzy.relationshipPattern.betweenTwoObj.observer;

/**
 * 首先注册了三个用户，ZhangSan、LiSi、WangWu。
 * 公众号发布了一条消息"PHP是世界上最好用的语言！"，三个用户都收到了消息。
 * 用户ZhangSan看到消息后颇为震惊，果断取消订阅，
 * 这时公众号又推送了一条消息，此时用户ZhangSan已经收不到消息，
 * 其他用户还是正常能收到推送消息。
 * @author hzy
 *
 */
public class Test {

	public static void main(String[] args) {
		WechatServer server = new WechatServer();
		Observer userZhang = new User("ZhangSan");
		Observer userLi = new User("LiSi");
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.setInfomation("第一次发布消息");
		System.out.println("****华丽的分割线*******");
		server.removeObserver(userLi);
		server.setInfomation("第er次发布消息");
	}
}
