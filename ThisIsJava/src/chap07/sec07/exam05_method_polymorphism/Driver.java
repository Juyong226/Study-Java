package chap07.sec07.exam05_method_polymorphism;

public class Driver {

	/*
	 * ===========================================================
	 * 매개 변수의 다형성
	 * ===========================================================
	 * 메서드의 매개 변수의 타입을 포괄적으로 정의하면 다형성을 실현할 수 있다.
	 * */
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
