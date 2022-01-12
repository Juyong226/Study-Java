package chap08.sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		/*
		 * 인터페이스의 구현 객체를 사용하기 위해선 인터페이스 타입으로 선언된 변수에 구현 객체를 초기화 한다.
		 * 이후 인터페이스 타입 변수에 '.' 연산자를 통해 접근하여 메서드를 호출하여 사용할 수 있다.
		 * */
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
