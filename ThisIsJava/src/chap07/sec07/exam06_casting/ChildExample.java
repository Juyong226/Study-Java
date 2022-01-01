package chap07.sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {

		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// parent.field2 = "data2";
		// parent.method3();
		
		/*
		 * ===========================================================
		 * 강제 타입 변환, casting
		 * ===========================================================
		 * 자식 타입을 부모 타입으로 타입 변환을 하면 원래 자식 객체가 가지고 있던 멤버에 접근을 할 수 없다.
		 * 하지만 부득이하게 자식 객체의 멤버에 접근을 해야 할 상황에는 '(자식 타입)'을 명시하므로써 다시 강제적으로 원래의 상태로 돌아갈 수 있다.
		 * */
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
	}

}
