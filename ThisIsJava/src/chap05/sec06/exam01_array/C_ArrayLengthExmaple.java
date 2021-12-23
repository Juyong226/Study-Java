package chap05.sec06.exam01_array;

public class C_ArrayLengthExmaple {

	public static void main(String[] args) {

		/*
		 * ======================================================
		 * 배열의 길이 length
		 * ======================================================
		 * 배열의 길이는 배열이라는 자료구조가 포함하고 있는 데이터의 갯수(데이터 저장 공간의 갯수; 마지막 인덱스 + 1)
		 * 배열의 객체가 생성되면 해당 배열 객체의 속성(필드, 생성자, 메서드) 중 length 필드에 배열의 길이가 초기화 된다.
		 * length 필드는 한 번 초기화 되면 그 값을 수정할 수 없는 '읽기 전용' => final 필드
		 * length 필드는 주로 길이가 다른 수많은 배열을 다룰 필요가 있을 때, 동적 프로그래밍을 위해 사용한다.
		 * */
		int[] scores = { 59, 20, 87 };
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균: " + avg);
	}

}
