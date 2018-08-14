package cn.hzy.structurePattern.bridge.targetCity;

import cn.hzy.structurePattern.bridge.Bridge;

public class CityX implements Bridge{

	@Override
	public void targetCity() {
		// TODO Auto-generated method stub
		System.out.println("到达城市X了！");
	}

	
}
