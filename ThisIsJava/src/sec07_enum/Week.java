package sec07_enum;

public enum Week {
	
	/*
	 * ======================================================
	 * 열거 타입, Enumeration; Enum
	 * ======================================================
	 * 열거 타입은 참조 타입이다.
	 * 열거타입은 보통 한정된 값만을 갖는 데이터를 대상으로 사용한다.
	 * 한정된 데이터를 열거 타입으로 선언하고, 이를 상수처럼 쓸 수 있다.
	 * 
	 * 열거 타입의 이름은 관례적으로 첫자는 대문자 나머지는 소문자로 한다.
	 * => Week, Seasons, ... etc
	 * 
	 * 열거 타입 상수값은 관례적으로 대문자로 작성한다.
	 * => SPRING, SUMMER, AUTUMN(FALL), WINTER
	 * */
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
