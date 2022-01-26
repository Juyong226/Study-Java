package chap08.sec07.exam02_default_method_extends;

public interface ParentInterface {

	/*
	 * =============================================================
	 * 디폴트 메서드가 있는 인터페이스의 상속
	 * =============================================================
	 * 디폴트 메서드가 있는 인터페이스를 상속한 자식 인터페이스는 3가지 방법으로 디폴트 메서드를 처리할 수 있다.
	 * 1. 그대로 상속 받는다.
	 * 2. 실행 내용을 재정의 한다.
	 * 3. 추상 메서드로 재정의 한다.
	 * */
	public void method1();
	public default void method2() {
		System.out.println("ParentInterface-method2()");
	}
}
