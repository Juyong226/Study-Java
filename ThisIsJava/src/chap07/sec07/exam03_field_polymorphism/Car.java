package chap07.sec07.exam03_field_polymorphism;

public class Car {

	/*
	 * ===========================================================
	 * 필드의 다형성
	 * ===========================================================
	 * 객체 지향 프로그래밍은 다양한 객체의 조합으로 완성된다.
	 * 여러 객체가 완성품의 일부분을 각각 차지하고 있고, 각 객체가 동작하므로써 전체가 동작한다.
	 * 이때 각각의 객체를 언제든지 새로운 객체, 더 나은 객체로 교체할 수 있다면 프로그램은 더 좋은 확장성을 얻고 프로그램의 유지 및 보수가 쉬워질 것이다.
	 * 상속, 오버라이딩, 타입 변환을 활용하면 이를 실현할 수 있다.
	 * 
	 * 어떤 객체를 구성하는 필드를 또 다른 객체로 사용할 때가 많다.
	 * 만약 이 객체의 필드를 한 클래스 타입으로 정의하고, 
	 * 해당 타입을 상속한 다양한 클래스 타입의 객체로 필드를 초기화 할 수 있다면
	 * 이 객체의 결과는 다양해질 수 있다.
	 * */
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire rearLeftTire = new Tire("뒤왼쪽", 3);
	Tire rearRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(rearLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(rearRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	private void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
