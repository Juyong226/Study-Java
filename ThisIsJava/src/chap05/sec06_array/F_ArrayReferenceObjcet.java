package chap05.sec06_array;

public class F_ArrayReferenceObjcet {

	public static void main(String[] args) {
		
		/*
		 * 참조 타입 배열 또한 생성이 가능하다. (다차원 배열이 단적인 예)
		 * 아래는 String 클래스 타입을 참조하는 배열을 생성한 것
		 * 
		 * 참조 타입 배열은 값 자체를 초기화 하는 것이 아닌, 참조하는 객체의 메모리 주소를 초기화 하는 것이므로
		 * ==, != 연산자로 값의 내용을 비교해선 안 된다. (이는 객체를 비교하는 것임)
		 * String의 경우 값의 내용을 비교하고 자 할 때에는 equals() 메서드를 활용하자. (문자열 리터럴로 초기화 한 것이 아니라면) 
		 * */
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));

	}

}
