package chap07.sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {

		// Phone phone = new Phone("나"); => new 연산자를 이용한 추상 클래스의 객체 생성은 불가능하다.
		SmartPhone smartPhone = new SmartPhone("이주용");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
