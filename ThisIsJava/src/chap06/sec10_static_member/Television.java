package chap06.sec10_static_member;

public class Television {

	static String company = "Samsung";
	static String model = "LCD";
	static String info;

	 /*
	  * ======================================================
	  * 정적 초기화 블록
	  * ======================================================
	  * 정적 필드는 보통 선언과 동시에 초기화 하는 것이 일반적이다.
	  * 인스턴스 필드의 경우 복잡한 연산 뒤에 초기화 될 필요가 있을 때 생성자 블록을 활용한다.
	  * 정적 필드는 객체를 생성 이전에 메모리에 로드되기 때문에 생성자를 활용할 수 없다.
	  * 따라서 자바에서는 static 블록을 통해 정적 필드 초기화에 필요한 연산이 가능하게 한다.
	  * */
	static {
		info = company + "-" + model;
	}
}
