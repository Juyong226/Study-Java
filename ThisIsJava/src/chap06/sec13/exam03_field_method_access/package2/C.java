package chap06.sec13.exam03_field_method_access.package2;

import chap06.sec13.exam03_field_method_access.package1.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1;
		// a.field2 = 2;
		// a.field3 = 3;
		
		a.method1();
		//  a.method2();
		// a.method3();
	}
}
