package chap07.sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire의 수명: " + (maxRotation - accumulatedRotation));
			return true;
		}
		else {
			System.out.println("***" + location + " HankookTire에 펑크가 났습니다.");
			return false;
		}
	}
}
