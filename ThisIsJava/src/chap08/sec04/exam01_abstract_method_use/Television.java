package chap08.sec04.exam01_abstract_method_use;

public class Television implements RemoteControl {

	private int volume;
	
	/*
	 * 클래스 Television은 인터페이스 RemoteControl을 구현하므로
	 * 인터페이스에 명시된 추상 메서드를 반드시 오버라이딩을 해야 한다.
	 * => 오버라이딩을 하지 않을 시 컴파일 오류가 발생한다.
	 * => 오버라이딩을 의도적으로 피하려면(인터페이스의 추상 메서드를 전체 또는 일부 오버라이딩 하지 않으려면) 클래스를 '추상 클래스'로 선언해야 한다. (추상 클래스만이 추상 메서드를 가질 수 있기 때문)
	 * */
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

	
}
