package chap06.sec09_instance_member;

public class Car {

	/*
	 * =================================================
	 * 인스턴스 멤버, instance member
	 * =================================================
	 * 인스턴스 멤버란 객체(instance)를 생성한 후 사용할 수 있는 필드와 메서드를 뜻하고 각각 인스턴스 필드, 인스턴스 메서드라 말한다.
	 * 인스턴스 멤버는 객체(instance)에 소속된 멤버로, 객체 없이는 사용할 수 없다.
	 * 
	 * 어떤 클래스의 객체가 여러개라면 각각의 객체는 서로 다른 인스턴스 필드를 갖는다.
	 * 단, 인스턴스 메서드는 객체 내부가 아닌 메서드 영역에 저장되고 여러 객체들 사이에서 공유된다.
	 * */
	String model;
	int speed;
	
	/*
	 * 객체 내부에서 인스턴스 멤버에 접근하기 위해 this를 사용할 수 있다.
	 * 보통 생성자나 메서드의 매개변수와 인스턴스 필드를 명확하게 구분하기 위해 사용한다.
	 * */
	Car(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/*
	 * 매개변수가 없어 인스턴스 필드임을 명확히 할 필요가 없는 경우 this를 사용하지 않아도 된다.
	 * */
	void run() {
		for(int i=0; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(model + "가 달립니다. (시속: " + speed + "km/h)");
		}
	}
}
