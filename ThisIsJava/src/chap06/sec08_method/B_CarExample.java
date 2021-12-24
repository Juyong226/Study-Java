package chap06.sec08_method;

public class B_CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.setGas(10);
		
		boolean gasState = myCar.isGasLeft();
		if(gasState) {
			System.out.println("운행을 시작합니다.");
			myCar.run();
		}
		
		if(myCar.isGasLeft() == false) {
			System.out.println("Gas를 10만큼 주입합니다.");
			myCar.setGas(10);
		}
	}

}
