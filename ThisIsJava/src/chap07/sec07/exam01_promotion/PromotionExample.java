package chap07.sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		/*
		 * ===========================================================
		 * 타입 변환과 다형성
		 * ===========================================================
		 * 다형성이란 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질을 말한다.
		 * 다시 말해 하나의 타입만 명시했지만, 해당 타입에 여러 객체(명시된 타입이 아닌)를 대입하여 다양한 기능을 활용할 수 있는 성질이다.
		 * 
		 * 상속을 활용하면 다형성을 구현할 수 있다.
		 * 자바는 상속 관계에 있는 두 클래스 사이에서 자식 클래스의 부모 클래스로의 타입 변환을 허용한다.
		 * 부모 타입에는 모든 자식 타입의 객체가 대입될 수 있다.
		 * */
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		/*
		 * 클래스 A는 클래스는 자신을 상속한 B, C, D, E의 객체를 참조할 수 있다. 
		 * */
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		/*
		 * 상속은 수직 관계이다. 
		 * C를 상속한 E는 B로 타입 변환될 수 없고,
		 * B를 상속한 D는 C로 타입 변활될 수 없다.
		 * */
		// B b2 = e;
		// C c2 = d;
	}

}
