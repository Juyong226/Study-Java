package chap07.sec02_inheritance;

public class C_Computer extends C_Calculator {

	/*
	 * =============================================================
	 * 메서드 재정의(오버라이딩), overriding
	 * =============================================================
	 * 상위 클래스에서 상속 받은 메서드를 하위 클래스에서 수정해서 사용하는 것을 '오버라이딩'이라 한다.
	 * 오버라이딩을 하게 되면, 상위 클래스의 메서드는 숨겨지는 효과(shadow effect)가 발생하고, 하위 클래스의 재정의된 메서드가 사용된다.
	 *  
	 * 메서드를 오버라이딩 하는 것은 '상속 받은 메서드를 수정하는 것'이기 때문에 '새로운 메서드를 정의하는 것'과 다르다.
	 * 따라서 오버라이딩의 대상이 되는 메서드의 선언부가 상위 클래스의 것과 같아야 한다.
	 * => 리턴 타입, 메서드 이름, 매개 변수가 상위 클래스의 것과 같은 지 확인해야 한다.
	 * => 다르다면 오버라이딩이 아닌 새로운 메서드를 정의하는 것이 된다.
	 * => 이를 도와주는 것이 바로 어노테이션 '@Override'
	 * => 오버라이딩하려는 메서드 위에 위 어노테이션을 붙여주면 컴파일러가 리턴 타입, 메서드 이름, 매개 변수가 상위 클래스의 메서드와 같은 지 체크하고 다르면 컴파일 오류를 발생시켜 알려준다.
	 * 
	 * 이 외에도 오버라이딩할 때 지켜야 할 규칙이 2개 더 있다.
	 * 1. 상위 클래스의 메서드보다 접근 제한을 더 강하게 할 수 없다. 
	 * 2. 상위 클래스의 메서드에서 허용한 예외 이외의 추가적인 예외를 throws 할 수 없다.
	 * 
	 * 쉽게 말해 메서드의 실행 블록 내부 내용을 제외하곤 상위 클래스 메서드가 허용한 범위 밖으로 조건을 수정할 수 없다.
	 * */
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}