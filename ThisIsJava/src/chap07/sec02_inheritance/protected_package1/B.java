package chap07.sec02_inheritance.protected_package1;

public class B {

	/*
	 * A와 같은 패키지 내부에 있으므로 protected 접근 제한자를 부여받은 A의 멤버에 접근이 가능하다.
	 * */
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
