package chap06.sec10_static_member;

public class C_CarExample {

	int speed;
	
	void run() {
		System.out.println(speed + "km/h로 달립니다.");
	}
	
	/*
	 * ======================================================
	 * 정적 메서드와 블록을 선언할 때 주의할 점
	 * ======================================================
	 * 정적 멤버는 객체 생성없이 접근할 수 있어야 한다.
	 * 따라서 정적 메서드와 정적 블록 내부에는 객체 생성 이후 사용할 수 있는 '인스턴스 멤버'가 허용되지 않는다.
	 * 정적 메서드와 블록 내부에서 인스턴스 멤버를 사용하기 위해서는 반드시 생성자를 통해 객체를 생성해야 한다.
	 * */
	public static void main(String[] args) {
		C_CarExample myCar = new C_CarExample();
		myCar.speed = 60;
		myCar.run();
	}
}
