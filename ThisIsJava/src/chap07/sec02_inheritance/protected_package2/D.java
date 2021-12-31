package chap07.sec02_inheritance.protected_package2;

import chap07.sec02_inheritance.protected_package1.A;

public class D extends A {
	
	/*
	 * A와 다른 패키지에 있지만, A를 상속하기 때문에 protected 접근 제한자를 갖는 멤버에 접근이 가능하다.
	 * 이 경우 상속을 했기 때문에 super와 this를 통해 멤버에 접근한다.
	 * */
	public D() {
		super();
		this.field = "value";
		this.method();
	}
	
	public void method() {
		super.method();
		this.field = "value1";
	}
}
