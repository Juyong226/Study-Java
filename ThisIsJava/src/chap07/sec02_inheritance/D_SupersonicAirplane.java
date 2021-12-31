package chap07.sec02_inheritance;

public class D_SupersonicAirplane extends D_Airplane {

	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	/*
	 * =============================================================
	 * super를 활용한 부모 메서드의 호출
	 * =============================================================
	 * 메서드 오버라이딩을 할 때 부모 메서드를 그대로 호출할 필요가 있을 경우가 존재한다.
	 * 예를 들어, 조건에 따라 부모 메서드를 호출하거나
	 * 부모 메서드 내용에 추가적인 작업을 더하는 수정일 경우 굳이 부모 메서드의 내용을 두번 작성할 필요는 없다.
	 * 이때는 부모 객체를 의미하는 super를 통해 부모 메서드를 호출하면 된다.
	 * */
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			super.fly();
		}
	}
}
