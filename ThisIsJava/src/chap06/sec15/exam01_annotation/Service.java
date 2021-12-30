package chap06.sec15.exam01_annotation;

public class Service {

	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용 1");
	}
	
	/*
	 * '*'를 어노테이션의 엘리먼트 값으로 넘겨준다.
	 * 이 때 하나만 넘기므로 이는 자동으로 value()에 초기화 된다.
	 * */
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용 2");
	}
	
	/*
	 * 2개 이상의 값을 엘리먼트 값으로 넘겨줄 때는 반드시 엘리먼트 이름을 함께 명시해 주어야 한다.
	 * */
	@PrintAnnotation(value = "-", number = 35)
	public void method3() {
		System.out.println("실행 내용 3");
	}
}
