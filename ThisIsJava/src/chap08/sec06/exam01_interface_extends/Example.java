package chap08.sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {

		/*
		 * 인터페이스 A, B, C가 있다.
		 * C는 A와 B를 상속했다.
		 * ImplementationC는 인터페이스 C를 구현한 클래스이다.
		 * */
		ImplementationC impl = new ImplementationC();
		
		/*
		 * C를 구현한 클래스의 객체 impl을 A타입으로 자동 타입 변환한다.
		 * impl은 A, B, C의 모든 추상 메서드를 오버라이딩 했지만
		 * 이 경우 A의 추상 메서드만 호출이 가능하다.
		 * */
		InterfaceA ia = impl;
		ia.methodA();
		
		/*
		 * C를 구현한 클래스의 객체 impl을 B타입으로 자동 타입 변환한다.
		 * impl은 A, B, C의 모든 추상 메서드를 오버라이딩 했지만
		 * 이 경우 B의 추상 메서드만 호출이 가능하다.
		 * */
		InterfaceB ib = impl;
		ib.methodB();
		
		/*
		 * C를 구현한 클래스의 객체 impl을 C타입으로 자동 타입 변환한다.
		 * C는 A, B를 상속한 인터페이스이므로 A와 B의 추상 메서드도 호출이 가능하다.
		 * */
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
