package chap05.sec06.exam01_array;

public class G_ArrayCopyByForExample {

	public static void main(String[] args) {

		/*
		 * ======================================================
		 * 배열의 복사
		 * ======================================================
		 * 배열의 길이는 객체가 생성되는 시점에 한 번 초기화 되고 난 이후에 수정이 불가능하다.
		 * 따라서 배열을 통해 관리하는 데이터의 양이 어느 시점에 늘어났다면
		 * 더 이상 해당 배열로는 데이터를 관리할 수가 없다.
		 * 
		 * 배열의 길이는 수정이 불가능하기 때문에 이 때는 새로운 길의 배열을 만들어서 기존 배열의 데이터를 새 배열에 초기화 시켜줘야 한다.
		 * 
		 * 배열을 복사하는 방법에는 크게 3가지가 있다.
		 * 1. for문을 통한 데이터 초기화 작업
		 * 2. System.arrayCopy()를 통한 배열 복사
		 * 3. Arrays 클래스를 활용한 배열 복사
		 * */
		
		/*
		 * for문을 통한 데이터 초기화 작업
		 * */
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			if(i < newIntArray.length - 1) {
				System.out.print(newIntArray[i] + ", ");
			}
			else {
				System.out.println(newIntArray[i]);
				System.out.println("===============================");
			}
		}
		
		
		/*
		 * System.arrayCopy()를 통한 배열 복사
		 * => arrayCopy([복사할 배열], [복사 시작 지점 인덱스], [새 배열], [붙여넣기 시작 지점 인덱스], [복사 길이])
		 * => 새 배열에 복사만 실행 
		 * */
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			if(i < newStrArray.length - 1) {
				System.out.print(newStrArray[i] + ", ");
			}
			else {
				System.out.println(newStrArray[i]);
				System.out.println("===============================");
			}
		}
	}

}
