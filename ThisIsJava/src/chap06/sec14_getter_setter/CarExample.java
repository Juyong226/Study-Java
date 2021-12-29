package chap06.sec14_getter_setter;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.setSpeed(-120);
		myCar.setStop(false);
		System.out.println("현재속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재속도: " + myCar.getSpeed());
		
		if(myCar.isStop() == false) {
			myCar.setStop(true);
			System.out.println("현재속도: " + myCar.getSpeed());
		}
	}

}
