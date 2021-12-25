package chap06.sec08_method;

public class Calculator {
	
	/*
	 * ==========================================================
	 * 메서드, method
	 * ==========================================================
	 * 메서드는 객체의 동작에 해당하는 중괄호 {} 블록을 의미한다.
	 * 메서드를 정의하는 기본 형식은 다음과 같다.
	 * [리턴 타입][메서드 이름]([매개변수 선언...]) {...}
	 * 
	 * '리턴 타입'은 메서드 중괄호 블록의 명령어들이 실행되고 난 뒤 메서드가 자신을 호출한 쪽으로 돌려주는 값을 뜻한다.
	 * => 메서드의 목적, 기능에 따라 리턴 값은 있을 수도, 없을 수도 있다.
	 * => 리턴 타입으로 기본 타입, 참조 타입 모두가 가능하다.
	 * => 리턴하는 값이 없다면 리턴 타입에 'void'를 명시한다.
	 * 
	 * '매개변수 선언'은 메서드가 실행되기 위해 필요한 값들을 메서드를 호출한 쪽에서 전달하기 위해 작성한다.
	 * 반드시 메서드에 선언된 매개변수의 데이터 타입, 갯수, 순서에 부합하도록 메서드를 호출해야 한다. 
	 * */
	
	/*
	 * 매개변수와 리턴 값이 없는 메서드
	 * */
	void powerOn() {
		System.out.println("계산기가 곧 켜집니다.");
	}
	
	/*
	 * 매개변수와 리턴 값이 있는 메서드
	 * */
	int plus(int x, int y) {
		return x + y;
	}
	
	/*
	 * 메서드 오버로딩
	 * => 메서드도 생성자와 마찬가지로 필요에 따라 오버로딩이 가능하다.
	 * 
	 * 사전에 매개변수의 갯수를 알 수 없을 때, 혹은 매개변수의 갯수가 중요하지 않을 때
	 * => 배열 형식의 매개변수로 선언이 가능하다. 이 때 해당 메서드를 호출할 때는 반드시 매개 변수로 배열 타입 변수를 넘겨주어야 한다.
	 * => '[타입] ... 변수명' 형식으로 매개변수 선언이 가능하다. 이 때는 매개변수의 값을 나열해서 메서드를 호출할 수 있다. (배열 타입 변수도 가능)
	 * */
	int plus(int ... values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
	
	double getAvg(int ... values) {
		int sum = plus(values);
		return (double) sum / values.length;
	}
	
	double divide(int x, int y) {
		return (double) x / y;
	}
	
	void execute() {
		double result = getAvg(6, 10, 3, 22);
		println("실행 결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
