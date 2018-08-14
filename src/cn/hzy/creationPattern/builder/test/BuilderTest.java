package cn.hzy.creationPattern.builder.test;

import cn.hzy.creationPattern.builder.Builder;

public class BuilderTest {
	
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceSmsSender(5);
	}

}
