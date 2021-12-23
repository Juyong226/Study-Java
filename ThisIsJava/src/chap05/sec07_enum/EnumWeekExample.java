package chap05.sec07_enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		/*
		 * 열거 타입의 열거 상수는 메서드 영역에 생성된다.
		 * 열거 상수는 그 갯수만큼 힙 영역에 열거 타입 객체로 생성된다.
		 * 메서드 영역의 열거 상수는 힙 영역의 열거 타입 객체를 참조한다.
		 * 
		 * Week today = Week.THURSDAY;
		 * => 힙 영역에 열거 타입 Week의 객체가 열거 상수만큼 생성된다. (각 열거 타입 객체는 하나의 열거 상수 문자열을 가진다.)
		 * => 메서드 영역의 열거 상수 THURSDAY가 힙 영역의 열거 타입 객체 THURSDAY를 참조한다.
		 * => 스택영역에 열거 Week 타입의 변수 today가 메서드 영역의 열거 상수 THURSDAY가 가진 메모리 주소값으로 초기화 된다.
		 * ==> 이는 다시 말하면 열거 타입 객체는 한 번씩만 생성되며, 같은 열거 상수로 초기화 된 모든 열거 타입 변수는 같은 객체를 참조한다.
		 * */
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘은: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일엔 내가 짜파게티 요리사!");
		}
		else {
			System.out.println("공부하자!");
		}
		
		/*
		 * 열거 객체의 메서드 name()
		 * 열거 객체가 가진 열거 상수의 문자열(String)을 리턴한다.
		 * */
		String name = today.name();
		System.out.println(name);
		
		/*
		 * 열거 객체의 메서드 ordinal()
		 * 열거 객체가 가진 열거 상수의 선언된 순서(int, 0부터 시작)를 리턴한다.
		 * */
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		/*
		 * 열거 객체의 메서드 compareTo(Week e)
		 * => e1.compareTo(e2);
		 * 두 열거 객체의 ordinal() 값을 비교한다.
		 * 비교 방법은 앞 객체의 ordinal() 값에서 뒤 객체의 ordianl() 값을 뺀다.
		 * (+)값이 나온다면 앞 열거 상수가 뒤 열거 상수보다 나중에 선언된 것이고,
		 * (-)값이 나온다면 앞 열거 상수가 뒤 열거 상수보다 먼저 선언된 것이다.
		 * */
		Week day1 = Week.MONDAY;
		Week day2 = Week.FRIDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		/*
		 * 열거 객체의 메서드 valueOf(String s)
		 * 매개변수로 받은 문자열과 같은 열거 객체를 리턴한다. 
		 * */
		Week weekDay = Week.valueOf(name);
		if(weekDay == Week.SUNDAY) {
			System.out.println("오 일요일이다");
		}
		else {
			System.out.println("공부하자!");
		}
		
		/*
		 * 열거 객체의 메서드 values()
		 * 해당 열거 타입의 모든 열거 객체를 배열 형태로 리턴한다.
		 * 리턴된 배열의 각 인덱스는 힙 영역의 열거 객체를 ordinal() 순으로 각각 참조한다.
		 * 열거 타입 배열 변수는 힙 영역에 생성된 배열의 메모리 주소로 초기화 된다.
		 * */
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.print(day + ", 월요일이라면 values()의 열거 배열은 같은 열거 객체를 참조하고 있나요? => ");
			System.out.println(day == Week.MONDAY);
		}
	}

}
