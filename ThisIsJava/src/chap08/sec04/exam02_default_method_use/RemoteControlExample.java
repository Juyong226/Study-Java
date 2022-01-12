package chap08.sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		// RemoteControl.setMute(true); => 불가능. 반드시 구현 객체를 통해서만 default 메서드에 접근 가능
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
	}

}
