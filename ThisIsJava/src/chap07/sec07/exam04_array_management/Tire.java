package chap07.sec07.exam04_array_management;

public class Tire {

	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire의 수명: " + (maxRotation - accumulatedRotation));
			return true;
		}
		else {
			System.out.println("***" + location + " Tire에 펑크가 났습니다.");
			return false;
		}
	}
}
