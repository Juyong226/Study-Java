package chap06.sec09_instance_member;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car("Porsche");
		Car yourCar = new Car("Mercedes Benz");
		
		myCar.run();
		yourCar.run();
	}

}
