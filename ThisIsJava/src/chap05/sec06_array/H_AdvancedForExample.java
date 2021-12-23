package chap05.sec06_array;

public class H_AdvancedForExample {

	public static void main(String[] args) {

		/*
		 * ======================================================
		 * 향상된 for
		 * ======================================================
		 * for문으로 배열에 담긴 많은 양의 데이터를 다루기 쉽다.
		 * 하지만 배열과 for문을 활용할 순간이 많기 때문에 for문의 조건을 다는 일이 귀찮기도 하다.
		 * 향상된 for는 조건 부분을 간추려 배열의 길이만큼 알아서 for문을 실행한다.
		 * 단, 무조건 배열의 길이만큼 for문을 실행시킨다는 점을 고려해서 사용!
		 * */
		int[] scores = { 94, 93, 44, 29, 9 };
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("총합: " + sum);
	}

}
