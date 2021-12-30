package chap06.sec10_static_member;

public class Singleton {

	/*
	 * ======================================================
	 * 싱글톤, singleton
	 * ======================================================
	 * 프로그램 전반에서 단 하나의 객체만 생성되도록 보장되어야 하는 경우가 있다.
	 * 이 때 단 하나 생성된 이 객체를 싱글톤이라 한다.
	 * 
	 * 싱글톤은 단 하나의 객체만을 보장해야 하므로 private 접근 제한자를 통해 생성자에 대한 클래스 외부의 접근을 완전히 차단한다.
	 * 대신 클래스 내부에서 자기 자신 타입의 정적 필드를 선언하고, 이를 생성자를 통해 객체 하나를 생성하여 초기화한다. 
	 * (이때 외부에서 이 필드에 임의로 접근하여 변경하는 것을 방지하기 위해 객체 필드 역시 private으로 선언한다.)
	 * 대신 객체 필드를 리턴하는 정적 메서드를 선언하여 외부에서 이 메서드를 통해서 객체 주소를 얻을 수 있도록 한다.
	 * */
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return instance;
	}
}