package chap08.sec03.exam03_multi_implement_class;

/*
 * 인터페이스는 다중으로 구현이 가능하다.
 * 다중 구현이 갖는 의미는 이 클래스가 여러 인터페이스 타입으로 활용될 수 있다는 것이다.
 * */
public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

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
