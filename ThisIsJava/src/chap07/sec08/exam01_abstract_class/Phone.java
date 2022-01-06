package chap07.sec08.exam01_abstract_class;

/*
 * ===================================================
 * 추상 클래스, abstract class
 * ===================================================
 * 추상 클래스는 여러 실체(객체)의 공통된 특징(필드, 메서드)를 정의해 놓은 클래스이다.
 * 실체의 멤버를 통일화하는데 목적이 있다. => 멤버의 이름을 통일, 내용까지도 통일 가능
 * 따라서 모든 실체의 메서드 실행내용이 같다면 이를 추상 클래스를 만들어 그곳에 한 번만 작성하고 이를 상속하여 사용하는 것이 더 효율적일 것이다.
 * 
 * 추상 클래스는 new 연산자를 통한 객체 생성이 불가능하다.
 * 하지만 super, this 연산자를 통한 객체 생성은 가능하기 때문에 생성자는 여전히 필요하다.
 * => 추상 클래스를 상속한 자식 클래스의 객체가 생성될 때, 추상 클래스의 객체도 생성된다.
 * => 추상 클래스는 그 자체로 실체로써 쓰이지 않는다.
 * */
public abstract class Phone {

	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("휴대폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("휴대폰 전원을 끕니다.");
	}
}
