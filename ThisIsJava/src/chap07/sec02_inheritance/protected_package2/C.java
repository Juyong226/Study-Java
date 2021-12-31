package chap07.sec02_inheritance.protected_package2;

import chap07.sec02_inheritance.protected_package1.A;

public class C {

	/*
	 * A와 다른 패키지에 있기 때문에 protected 접근 제한자를 갖는 A의 멤버에 접근이 불가능하다.
	 * */
	public void method() {
		/*
		A a = new A();
		a.field = "value";
		a.method();
		*/
	}
}
