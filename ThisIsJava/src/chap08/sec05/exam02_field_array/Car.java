package chap08.sec05.exam02_field_array;

public class Car {

	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
		System.out.println("=======================");
	}
}
