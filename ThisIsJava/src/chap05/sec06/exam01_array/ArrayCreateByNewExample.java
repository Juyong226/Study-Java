package chap05.sec06.exam01_array;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		/*
		 * ===========================================================
		 * 값 목록 없이 배열 길이만을 알 때의 배열 타입 변수 초기화
		 * ===========================================================
		 * 1. 배열 타입 변수 선언문 = new 데이터타입[배열 길이];
		 * 2. 배열 타입 변수 선언문 = null; 배열 타입 변수 = new 데이터타입[배열 길이];
		 * 
		 * 값 없이 배열의 길이로만 배열 객체가 생성되었을 때, 배열의 각 메모리 공간은 데이터 타입에 따른 '기본값(default)'으로 초기화된다.
		 * 기본 타입 변수의 기본값 = 0 (boolean 타입 변수의 기본값 = false)
		 * 참조 타입 변수의 기본값 = null (클래스와 인터페이스)
		 * */
		int[] arr1 = new int[3];
		printValues(arr1);
		putAndPrintValues(arr1);
		
		double[] arr2 = new double[5];
		printValues(arr2);
		putAndPrintValues(arr2);
		
		String[] arr3 = new String[12];
		printValues(arr3);
		putAndPrintValues(arr3);

	}

	public static void printValues(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("intArray[" + i + "]: " + array[i]);
		}
		System.out.println("===============================");
	}
	
	public static void printValues(double[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("doubleArray[" + i + "]: " + array[i]);
		}
		System.out.println("===============================");
	}
	
	public static void printValues(String[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("StringArray[" + i + "]: " + array[i]);
		}
		System.out.println("===============================");
	}
	
	public static void putAndPrintValues(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i] = i + 10;
		}
		printValues(array);
	}
	
	public static void putAndPrintValues(double[] array) {
		for(int i=0; i<array.length; i++) {
			array[i] = i + 10;
		}
		printValues(array);
	}
	
	public static void putAndPrintValues(String[] array) {
		for(int i=0; i<array.length; i++) {
			array[i] = i + 1 + "월";
		}
		printValues(array);
	}
}
