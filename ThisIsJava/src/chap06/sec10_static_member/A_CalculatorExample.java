package chap06.sec10_static_member;

public class A_CalculatorExample {

	public static void main(String[] args) {
		
		/*
		 * ======================================================
		 * 정적 멤버의 사용
		 * ======================================================
		 * 정적 멤버는 '.'(도트 연산자)를 통해 접근한다.
		 * => [클래스 이름].[정적 멤버]		 
		 * */
		double result1 = 10 * 10 * Calculator.pi;
		double result2 = Calculator.plus(12, 35);
		double result3 = Calculator.minus(365, 123);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}

}
