package chap07.sec02_inheritance;

public class B_People {

	public String name;
	public String ssn;
	
	public B_People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모 객체 생성 완료");
	}
}
