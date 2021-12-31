package chap07.sec02_inheritance.protected_package1;

public class A {

	/*
	 * =============================================================
	 * protected 접근 제한자
	 * =============================================================
	 * protected 접근 제한자를 갖는 멤버에 대한 접근은 아래의 두 경우에만 허용된다.
	 * 1. 같은 패키지 내의 클래스
	 * 2. 자식 클래스
	 * */
	protected String field;
	
	protected A() {}
	
	protected void method() {}
}
