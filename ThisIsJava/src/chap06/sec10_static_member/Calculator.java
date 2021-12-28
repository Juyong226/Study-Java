package chap06.sec10_static_member;

public class Calculator {

	/*
	 * ======================================================
	 * 정적 멤버, static member
	 * ======================================================
	 * 정적 멤버는 클래스에 '고정된' 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메서드를 말한다.
	 * 정적 멤버는 객체(instance)에 속한 멤버가 아니라 클래스에 소속된 멤버이기 때문에 '클래스 멤버'라고도 한다.
	 * 정적 멤버는 필드나 메서드 앞에 'static'을 붙여 선언한다.
	 * 
	 * 정적 멤버는 클래스에 고정되어 있으므로 클래스 로더(class loader)가 클래스 파일(바이트 코드 파일)을 로딩해서 메소드 메모리 영역에 적재할 때 함께 저장되고 관리된다.
	 * => 클래스는 메소드 메모리 영역에 한 번만 로드된다. 
	 * => 클래스의 객체(instance)는 힙 영역에 여러개 생성될 수 있다.
	 * 
	 * [정적 멤버 vs 인스턴스 멤버]
	 * 필드
	 * => '고유성'이 필요없는 경우 정적 필드로 선언한다. 
	 * => 고유성이 없는 필드를 객체가 생성될 때마다 추가로 저장하는 것은 메모리 낭비다.
	 * 
	 * 메서드
	 * => 메서드 내부에서 인스턴스 필드를 사용하지 않는다면 정적 메서드로 선언한다.
	 * => 객체마다 갖는 고유 필드가 메서드 내에서 필요하지 않는다는 건, 그대로 다른 객체에서도 사용이 가능하다는 의미이므로 메모리에 한 번만 로드되고 공유하는 편이 효율적이다.
	 * */
	static double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
