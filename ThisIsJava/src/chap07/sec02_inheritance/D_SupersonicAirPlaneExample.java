package chap07.sec02_inheritance;

public class D_SupersonicAirPlaneExample {

	public static void main(String[] args) {

		D_SupersonicAirplane sa = new D_SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = D_SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = D_SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();
	}

}
