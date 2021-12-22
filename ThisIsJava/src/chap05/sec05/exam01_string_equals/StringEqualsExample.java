package chap05.sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		/*
		 * =============================================================
		 * Null과 NullPointerException
		 * =============================================================
		 * 모든 변수는 선언 후 초기화가 되어야 사용이 가능하다.
		 * 기본 타입 변수와 참조 타입 변수 중 참조 타입 변수만 null로 초기화 할 수 있다.
		 * null로 초기화 된 참조 타임 변수는 '현재 참조하고 있는 객체가 없다.'는 것을 의미한다.
		 * null로 초기화 된 참조 타입 변수를 사용하려고 하면 NullPointerException이 발생한다.
		 * 이는 참조하는 객체가 없기 때문에 변수가 빈 것이므로 변수를 사용할 수 없다는 의미이다.
		 * (기본 타입 변수는 null로 초기화가 불가능하므로, 기본 타입 변수가 NullPointerException의 원인일 수 없다.)
		 * */
		
		/*
		 * 참조 타입 변수의 경우 ==, != 연산자는 참조하는 객체가 같은지 다른지 여부를 판단한다.
		 * String은 클래스 타입으로 참조 타입에 속한다.
		 * */
		
		/*
		 * String으로 선언된 여러 변수들에 '동일한 문자열 리터럴'을 대입하는 경우
		 * 메모리 상에는 하나의 String 객체만 생성되고, 모든 변수들은 같은 객체를 참조한다.
		 * 따라서 해당 변수들을 == 연산자로 비교하면 true를 리턴한다.
		 * */
		String strVar1 = "문자열";
		String strVar2 = "문자열";
	 
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}
		else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		/*
		 * new 연산자는 무조건 새로운 객체를 생성한다.
		 * 생성하려는 문자열이 같더라도 new 연산자를 통해 생성한다면 메모리 상에 서로 다른 객체가 각각 생성된다.
		 * 따라서 해당 변수들을 == 연산자로 비교하면 각기 다른 객체를 참조하고 있으므로 false를 리턴한다. 
		 * */
		String strVar3 = new String("문자열");
		String strVar4 = new String("문자열");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}
		else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		/*
		 * 서로 다른 객체를 참조하는 String 타입의 변수의 문자열'만'을 비교하고자 할 때는
		 * String 클래스의 equals() 메서드를 활용하여 비교한다.
		 * equals() 메서드는 비교하는 두 변수가 서로 다른 String 객체를 참조하더라도
		 * 문자열만을 비교하여 같다면 true, 다르다면 false를 리턴한다.
		 * */
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		else {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
		}

	}

}
