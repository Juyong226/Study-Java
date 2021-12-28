package chap06.sec10_static_member;

public class SingletonExample {

	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("두 객체는 같은 객체입니다.");
		}
		else {
			System.out.println("두 객체는 다른 객체입니다.");
		}
	}

}
