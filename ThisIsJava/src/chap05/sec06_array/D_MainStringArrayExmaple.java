package chap05.sec06_array;

public class D_MainStringArrayExmaple {

	public static void main(String[] args) {

		/*
		 * ======================================================
		 * 명령 프롬프트에서 자바 프로그램을 실행하는 방법 
		 * ======================================================
		 * 1. cd 명령어를 사용하여 해당 프로젝트 디렉토리 내 bin으로 이동한다.
		 * 2. 자바 실행 명령어인 java를 사용하여 [해당 프로젝트의 main 메서드가 위치한 클래스 파일의 패키지 디렉토리 전체].[클래스 명]으로 실행
		 * => cd D:\programming\study\ThisIsJava\bin
		 * => java chap05.sec06.exam01_array.MainStringArrayExample
		 * */
		
		/*
		 * ======================================================
		 * main 메서드의 매개변수, String[] args
		 * ======================================================
		 * 자바 프로그램의 실행 명령어 뒤에 공백을 구분점으로 문자열을 나열하여 입력할 수 있다.
		 * => java chap05.sec06.exam01_array.MainStringArrayExample 값1 값2 값3
		 * 
		 * JVM은 해당 문자열들을 데이터로 갖는 배열 객체를 생성하고 이를 main 메서드의 매개변수로 전달한다.
		 * => 이는 main(new String[] { "값1", "값2", "값3" })와 같다.
		 * 
		 * 필요에 따라 전달받은 배열을 프로그램에 활용할 수 있다.
		 * */
		if(args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java chap05.sec06.exam01_array.MainStringArrayExample num1 num2");
			System.exit(0);
		}
		
		String arg1 = args[0];
		String arg2 = args[1];
		
		int num1 = Integer.parseInt(arg1);
		int num2 = Integer.parseInt(arg2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + "  + num2 + " = " + result);
	}

}
