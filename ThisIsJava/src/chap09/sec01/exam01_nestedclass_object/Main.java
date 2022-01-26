package chap09.sec01.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		/*
		 * 중첩 클래스의 타입은 [바깥 클래스].[중첩 클래스]이다.
		 * B는 인스턴스 멤버 클래스이므로 A의 객체를 통해서만 생성자를 호출할 수 있다.
		 * B의 객체 생성 후 B의 인스턴스 멤버에 접근이 가능하다. (B는 정적 멤버를 가질 수 없음)
		 * */
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		/*
		 * C는 정적 멤버 클래스이므로 A의 객체 없이 생성자 호출이 가능하다.
		 * C의 객체 생성 후 C의 인스턴스 멤버에 접근이 가능하다.
		 * */
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		
		/*
		 * C의 정적 멤버에는 C의 객체를 통하지 않고 클래스로 곧바로 접근한다.
		 * */
		A.C.field2 = 2;
		A.C.method2();
		
		/*
		 * A의 인스턴스 메서드 내부에 선언된 로컬 클래스 D는 메서드 실행 시에만 사용된다.
		 * */
		a.method1();
	}

}
