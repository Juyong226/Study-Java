package chap06.sec11_final;

public class Earth {

	/*
	 * ======================================================
	 * 상수, static final
	 * ======================================================
	 * final 필드는 한 번 초기화 되면 그 값을 변경할 수 없다.
	 * 만약 final 필드가 '주민등록번호'처럼 고유성을 갖는 필드가 아니라면 static을 추가적으로 붙여 '상수'로 선언한다.
	 * 상수는 객체 없이 접근이 가능하고, 한 번 초기화 되면 그 값을 변경할 수 없는 정적 필드다.
	 * */
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
