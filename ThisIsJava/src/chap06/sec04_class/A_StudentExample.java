package chap06.sec04_class;

public class A_StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		if(s1 == s2) {
			System.out.println("s1과 s2는 같은 객체를 참조한다.");
			System.out.println("s1의 참조 객체: " + s1);
			System.out.println("s2의 참조 객체: " + s2);
		}
		else {
			System.out.println("s1과 s2는 다른 객체를 참조한다.");
			System.out.println("s1의 참조 객체: " + s1);
			System.out.println("s2의 참조 객체: " + s2);
		}
		
	}

}
