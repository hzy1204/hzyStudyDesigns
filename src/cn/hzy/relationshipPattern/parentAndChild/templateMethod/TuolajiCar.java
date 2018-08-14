package cn.hzy.relationshipPattern.parentAndChild.templateMethod;

public class TuolajiCar extends Car{

	@Override
	protected void start() {
		System.out.println("拖拉机启动：动次打次   动次打次 ~~~~~");
	}

	@Override
	protected void stop() {
		System.out.println("拖拉机刹车：bbbbbbbbbb");
	}

}
