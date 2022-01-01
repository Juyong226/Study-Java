package chap07.sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {

		/*
		 * ===========================================================
		 * 타입 변환 후에 멤버 접근
		 * ===========================================================
		 * 부모 타입으로 타입 변환이 이루어지면 더 이상 원래 자신(자식 객체)의 멤버에는 접근할 수가 없다.
		 * 단, 오버라이딩한 메서드가 존재할 경우 해당 메서드만 예외적으로 호출이 가능하다.
		 * */
		Child child = new Child();
		
		Parent parent = child;
		
		/*
		 * 변수 child가 참조하는 Child 클래스의 객체가 Parent 타입으로 변환되었기 때문에
		 * 부모 클래스에 정의된 method1()과 method2()는 접근이 가능하지만
		 * 자식 클래스에 정의된 method3()에는 접근이 불가능해졌다.
		 * */
		parent.method1();
		parent.method2();
		// parent.method3();
	}

}
