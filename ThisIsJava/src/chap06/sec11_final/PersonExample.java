package chap06.sec11_final;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "괴물쥐");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "United States of America";
		//p1.ssn = "123123-1231231";
		p1.name = "장지환";
		System.out.println(p1.name);
	}

}
