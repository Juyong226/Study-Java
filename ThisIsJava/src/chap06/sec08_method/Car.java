package chap06.sec08_method;

public class Car {

	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isGasLeft() {
		if(gas == 0) {
			System.out.println("Gas가 없습니다.");
			return false;
		}
		System.out.println("Gas가 남아 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas == 0) {
				System.out.println("운행을 중단합니다. (Gas 잔량: " + gas + ")");
				break;
			}
			System.out.println("운행 중 입니다. (Gas 잔량: " + gas + ")");
			gas--;
		}
		return;
	}
}
