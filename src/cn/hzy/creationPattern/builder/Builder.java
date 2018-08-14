package cn.hzy.creationPattern.builder;

import java.util.ArrayList;
import java.util.List;

import cn.hzy.creationPattern.builder.impl.MailSender;
import cn.hzy.creationPattern.builder.impl.SmsSender;

/**
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 * 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性
 * @author hzy
 *
 */
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
