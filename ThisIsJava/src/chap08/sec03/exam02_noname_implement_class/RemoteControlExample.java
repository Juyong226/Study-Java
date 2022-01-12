package chap08.sec03.exam02_noname_implement_class;

import chap08.sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		/*
		 * =============================================================
		 * 익명 구현 객체
		 * =============================================================
		 * 일반적으로는 인터페이스의 구현 클래스를 만들어 사용하고, 이렇게 해야 클래스의 재활용도 가능하기 때문에 효율적이다.
		 * 하지만 '일회성'의 구현 객체가 필요할 경우, 소스 파일을 만들지 않고 실행 코드 내에서 구현 객체를 정의하고 사용할 수 있다.
		 * 
		 * [인터페이스] [변수명] = new [인터페이스]() { ... };
		 * => 인터페이스는 생성자가 없지만, new 인터페이스() { ... }; 라는 명령은 해당 인터페이스를 구현하여 중괄호 안의 내용으로 클래스를 선언하고 객체를 생성하라는 의미이다.
		 * => 이렇게 선언된 클래스는 인터페이스가 명시한 추상 메서드를 모두 오버라이딩 해야 한다.
		 * => **인터페이스에 명시되지 않은 필드나 메서드를 선언할 수 있지만, 이는 익명 객체 내부에서만 사용이 가능하다.**
		 * */
		RemoteControl rc = new RemoteControl() {

			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}
				else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}
				else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨: " + this.volume);
			}
			
		};
		
	}
}
