package chap07.sec07.exam07_instanceof;

public class InstanceofExample {

	/*
	 * ===========================================================
	 * 객체 타입 확인, instanceof
	 * ===========================================================
	 * 강제 타입 변환은 '원래의 자기 타입'으로 되돌아 갈 때만 가능하다.
	 * 클래스 A를 상속하는 클래스 B와 C가 있을 때
	 * 필요에 의해 A로 타입 변환을 했던 B를 C로 강제 타입 변환할 수는 없다.
	 * 원래 B였던 것은 되돌려도 B로 되돌리는 것만 가능하다.
	 * 
	 * 만약 다른 타입으로 강제 타입 변환을 시도하면 예외가 발생한다.
	 * 이를 사전에 예방하기 위해 타입 변환된 A의 타입 변환 이전의 타입을 체크하는 연산자가 'instanceof'이다.
	 * 
	 * [타입 변환 후 객체] instanceof [타입 변환 전 클래스 타입]
	 * */
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
	}

}
