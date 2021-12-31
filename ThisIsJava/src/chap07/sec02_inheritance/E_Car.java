package chap07.sec02_inheritance;

/*
 * =============================================================
 * final 클래스와 final 메서드
 * =============================================================
 * 클래스 선언부에 final 키워드가 사용되면 이는 '상속할 수 없는 클래스', 하위 클래스를 가질 수 없는 클래스라는 의미이다.
 * 아래 주석과 같이 final 키워드를 붙이게 되면 Car 클래스는 상속할 수 없다.
 * */

// public final class Car {
public class E_Car {
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}

	/*
	 * 메서드 선언부에 final 키워드가 사용되면 이는 '재정의 할 수 없는 메서드'라는 의미이다.
	 * 아래와 같이 final 키워드를 붙이게 되면 stop()은 하위 클래스에서 재정의 할 수 없다.
	 * */
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
