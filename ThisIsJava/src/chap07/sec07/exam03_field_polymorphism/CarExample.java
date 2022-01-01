package chap07.sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
		/*
		 * 앞서 Car 클래스의 타이어들을 Tire 클래스로 정의하고
		 * Tire 클래스를 상속한 여러 타이어를 Car 객체의 필드 객체로 활용할 수 있다.
		 * 이는 타이어 성능이 좋아지면 어려움 없이 자동차에도 적용할 수 있고,
		 * 어떤 타이어가 망가지면 또 새로운 타이어로 교체하기가 쉽다는 것을 의미한다.
		 * */
		for(int i=0; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.rearLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.rearRightTire = new KumhoTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("=================================================");
		}
	}

}
