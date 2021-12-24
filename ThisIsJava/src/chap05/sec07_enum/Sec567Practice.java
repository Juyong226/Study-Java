package chap05.sec07_enum;

public class Sec567Practice {

	public static void main(String[] args) {
		
		/*
		 * 연습 문제 7
		 * */
		int max = 0;
		int[] array7 = { 1, 5, 3, 8, 2 };
		for(int val : array7) {
			if(max < val) {
				max = val;
			}
		}
		
		System.out.println("max: " + max);
		System.out.println("=========================");
		
		/*
		 * 연습 문제 8
		 * */
		int[][] array8 = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int totalLength = 0;
		for(int[] inner : array8) {
			for(int val : inner) {
				sum += val;
			}
			totalLength += inner.length;
		}
		avg = sum / (double) totalLength;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		System.out.println("=========================");
		
	}

}
