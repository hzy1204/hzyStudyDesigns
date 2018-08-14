package cn.hzy.relationshipPattern.parentAndChild.templateMethod;

public class Client {

	public static void main(String[] args) {
		Car myFirstCar = new TuolajiCar();
		myFirstCar.useCar();
		
		Car mySecondCar = new AudiCar();
		mySecondCar.useCar();
		
	}
}
