package chap07.sec02_inheritance;

public class C_ComputerExample {

	public static void main(String[] args) {

		int r = 10;
		C_Calculator calc = new C_Calculator();
		System.out.println("원의 면적: " + calc.areaCircle(r));
		
		C_Computer com = new C_Computer();
		System.out.println("원의 면적: " + com.areaCircle(r));
	}

}
