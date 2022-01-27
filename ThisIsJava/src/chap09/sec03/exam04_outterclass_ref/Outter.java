package chap09.sec03.exam04_outterclass_ref;

public class Outter {

	/*
	 * ====================================================================
	 * 중첩 클래스에서 바깥 클래스 참조 얻기
	 * ====================================================================
	 * this 연산자는 현재 객체 자신의 참조이다.
	 * 즉, 중첩 클래스 내부에서의 this는 중첩 클래스를 의미한다.
	 * 바깥 클래스의 객체를 참조하고자 할 때는 [바깥 클래스 이름].this를 사용한다.
	 * 
	 * => [바깥 클래스].this.필드
	 * => [바깥 클래스].this.메서드
	 * */
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
