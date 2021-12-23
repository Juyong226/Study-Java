package chap05.sec06_array;

public class E_ArrayInArrayExmaple {

	public static void main(String[] args) {
		
		/*
		 * ======================================================
		 * 다차원 배열; 중첩 배열
		 * ======================================================
		 * 어떤 배열의 각 저장 공간이 또 다른 배열을 참조할 때, 이 구조를 다차원 배열이라 한다.
		 * 예를 들어 int 타입의 길이가 2인 배열의 각 인덱스가 각각 int 타입의 길이가 3인 배열을 참조할 수 있다.
		 * 
		 * 다차원 배열의 객체가 생성될 때 '데이터 타입', '길이', 그리고 '차원의 수'가 결정된다.
		 * 따라서 다차원 배열을 선언할 때 []의 수로 차원의 갯수를 미리 정해야 한다.
		 * => int[][][][] fourLayerArray = int[3][][][];
		 * => int[][][][] fourLayerArray; fourLayerArray = new int[3][][][];
		 * 
		 * 다차원 배열은 기본적으로 배열을 참조하는 배열이 연속적으로 이어진 구조이다.
		 * => int[][] multiDimensionalArray;
		 * => 첫번째 대괄호는 다른 배열을 참조하는 배열, 두번째 대괄호는 참조의 대상이 되는 배열을 뜻한다.
		 * 
		 * 다차원 배열의 구조에서 특정 값의 표현
		 * 예를 들어 int[1][3]은, '첫번째 배열의 1번 인덱스가 참조하는 배열의 3번 인덱스의 값'을 의미한다.
		 * 
		 * 다차원 배열 타입의 변수를 초기화 할 때는 일반 배열 타입 변수를 초기화 할 때와 마찬가지로 3가지 방법이 있다.
		 * 1. 다차원 배열 타입의 변수 선언과 동시에 값을 나열하여 초기화 하는 방식
		 * 2. 다차원 배열 타입 변수를 먼저 선언하고 이후 new 연산자를 통해 배열 객체를 초기화 하는 방식
		 * 3. 다차원 배열의 길이만 먼저 확정하고, 이후 값을 초기화 하는 방식
		 * */
		
		/*
		 * 다차원 배열의 길이를 먼저 확정하고, 이후 값을 초기화 하는 방식
		 * */
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
			}
		}
		System.out.println("=====================================");
		
		int[][][] tripleArray = new int[2][3][3];
		for(int i=0; i<tripleArray.length; i++) {
			for(int k=0; k<tripleArray[i].length; k++) {
				for(int j=0; j<tripleArray[i][k].length; j++) {
					tripleArray[i][k][j] = i + k + j;
					System.out.println("tripleArray[" + i + "][" + k + "][" + j + "] = " + tripleArray[i][k][j]);
				}
			}
		}
		System.out.println("=====================================");
		
		/*
		 * 각 차원의 배열의 길이는 다차원 배열 타입 변수의 선언 이후에 자유롭게 정할 수 있다.
		 * 단, 선언 시 정한 차원의 수는 맞아야 한다.
		 * => int[][] twoLayerArray = new int[2][];
		 * => twoLayerArray[0] = new int[3][]; (X)
		 * */
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
		System.out.println("=====================================");
		
		/*
		 * 다차원 배열 타입의 변수 선언과 동시에 값을 나열하여 초기화 하는 방식
		 * */
		int[][] javaScores = { { 90, 97, 87 }, { 88, 99, 100, 95 } };
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "] = " + javaScores[i][k]);
			}
		}
		System.out.println("=====================================");
		
	}

}
