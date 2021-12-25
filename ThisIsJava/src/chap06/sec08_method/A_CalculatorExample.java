package chap06.sec08_method;

public class A_CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(16, 28384);
		System.out.println("더하기 결과: " + result1);
		
		int result2 = myCalc.plus(28, 342, 82763, 191092);
		System.out.println("더하기 결과: " + result2);
		
		int[] arguments = { 10, 43, 8274, 1023 };
		int result3 = myCalc.plus(arguments);
		System.out.println("더하기 결과: " + result3);
		
		byte x = 99;
		byte y = 3;
		double result4 = myCalc.divide(x, y);
		System.out.println("나누기 결과: " + result4);
		
		myCalc.execute();
	}

}
