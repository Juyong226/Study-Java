package chap07.sec02_inheritance;

public class B_StudentExample {

	public static void main(String[] args) {

		B_Student student = new B_Student("홍길동", "123456-1234567", 1);
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("studentNo: " + student.studentNo);
	}

}
