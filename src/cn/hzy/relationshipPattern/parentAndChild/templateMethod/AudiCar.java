package cn.hzy.relationshipPattern.parentAndChild.templateMethod;

public class AudiCar extends Car{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("奥迪车启动：5555555555555555");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("奥迪车刹车：ccccccccccc");
	}

}
