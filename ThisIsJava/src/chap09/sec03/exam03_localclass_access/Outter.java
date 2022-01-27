package chap09.sec03.exam03_localclass_access;

public class Outter {

	/*
	 * ====================================================================
	 * 중첩(로컬) 클래스에서 바깥 클래스 멤버에 대한 접근
	 * ====================================================================
	 * 로컬 클래스가 선언된 메서드의 매개 변수나 로컬 변수를
	 * 로컬 클래스에서 사용할 때 문제가 발생할 수 있다.
	 * 
	 * 1. 로컬 클래스가 선언된 메서드의 매개 변수나 로컬 변수는 메서드가 종료되면 스택 메모리 영역에서 삭제된다.
	 * 2. 로컬 클래스가 선언된 메서드가 종료되어도 로컬 클래스는 힙 메모리 영역에 계속 존재하면서 사용될 수 있다.
	 * => 로컬 클래스는 보통 새로운 스레드로 선언되고 메인 스레드와 독립된 일을 처리하도록 활용되는 경우가 많다.
	 * 3. 이 경우 로컬 클래스에서 바깥 메서드의 매개 변수나 로컬 변수를 사용하는 상황에서 바깥 메서드가 종료되면, 로컬 클래스에서 참조하던 변수가 사라지는 문제가 발생한다.
	 * 
	 * 자바는 이 문제를 해결하기 위해 바깥 메서드의 매개 변수와 로컬 변수를 
	 * 컴파일 시에 로컬 클래스 내부로 복사하여 안전한게 사용될 수 있도록 한다.
	 * 그리고 매개 변수나 로컬 변수가 수정되어 값이 변경되면 로컬 클래스에 복사해 둔 값과 달라지는 문제를 해결하기 위해 
	 * 매개 변수나 로컬 변수를 'final'로 선언하도록 한다.
	 * */
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	/* 자바 7 이전 
	 * 바깥 메서드의 매개 변수와 로컬 변수를 final로 선언해야 한다.
	 * final로 선언된 매개 변수와 로컬 변수는 변수가 사용되는 로컬 클래스 내부 메서드의 로컬 변수로 복사된다.
	 * */
	public void method3(final int arg) {
		final int localVariable = 1;
		class Inner {
			void method() {
				field1 = 1;
				field2 = 2;
				method1();
				method2();
				
				int result = arg + localVariable;
			}
		}
	}
	
	public static void method4(final int arg) {
		final int localVariable = 1;
		class Inner {
			void method() {
				// field1 = 1;
				field2 = 2;
				// method1();
				method2();
				
				int result = arg + localVariable;
			}
		}
	}
	
	/* 자바 8 이후 
	 * 바깥 메서드의 매개 변수와 로컬 변수는 자동으로 final의 특성을 갖는다.
	 * final이 명시되지 않는 경우 매개 변수와 로컬 변수는 로컬 클래스의 필드로 복사되어 사용된다.
	 */
	public void metho5(int arg) {
		int localVariable = 1;
		/*
		 * 매개 변수와 로컬 변수가 자동으로 final의 특성을 갖기 때문에
		 * 값을 변경할 수 없다.
		 * */
		// arg = 10;
		// localVariable = 20;
		class Inner {
			void method() {
				field1 = 1;
				field2 = 2;
				method1();
				method2();
				
				int result = arg + localVariable;
			}
		}
	}
	
	public static void method6(final int arg) {
		final int localVariable = 1;
		class Inner {
			void method() {
				// field1 = 1;
				field2 = 2;
				// method1();
				method2();
				
				int result = arg + localVariable;
			}
		}
	}
}
