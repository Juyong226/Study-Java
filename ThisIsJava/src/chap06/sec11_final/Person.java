package chap06.sec11_final;

public class Person {

	/*
	 * ======================================================
	 * final 필드
	 * ======================================================
	 * 필드가 최초의 초기화 된 값에서 변경되지 않아야 한다면 final 필드로 선언한다.
	 * final 필드는 최초 초기화 된 이후 프로그램이 재시작 되지 않는 이상 변경할 수 없다.
	 * */
	final String nation = "South Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
