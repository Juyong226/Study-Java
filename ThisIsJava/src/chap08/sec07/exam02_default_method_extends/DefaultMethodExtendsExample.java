package chap08.sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		
		/*
		 * 1. ChildInterface1은 ParentInterface의 default 메서드를 그대로 상속 받음
		 * 이를 구현한 익명 객체는 default 메서드를 제외한 나머지 추상 메서드만 재정의 함
		 * ci1의 메서드를 모두 호출하면
		 * method1() => 익명 객체에서 재정의
		 * method2() => ParentInterface에서 정의한 내용
		 * method3() => 익명 객체에서 재정의
		 * */
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ci1-method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci1-method3()");
			}
			
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		System.out.println("======================================================");
		
		/*
		 * 1. ChildInterface2은 ParentInterface의 default 메서드를 재정의 함
		 * 이를 구현한 익명 객체는 default 메서드를 제외한 나머지 추상 메서드만 재정의 함
		 * ci1의 메서드를 모두 호출하면
		 * method1() => 익명 객체에서 재정의
		 * method2() => ChildInterface2에서 정의한 내용 
		 * method3() => 익명 객체에서 재정의
		 * */
		ChildInterface2 ci2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ci2-method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci2-method3()");
			}
			
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		System.out.println("======================================================");
		
		/*
		 * 1. ChildInterface3은 ParentInterface의 default 메서드를 '추상 메서드'로 재정의 함
		 * => 더 이상 ChildInterface3에는 default 메서드가 존재하지 않음
		 * 이를 구현한 익명 객체는 ChildInterface3의 모든 메서드를 재정의 함
		 * ci1의 메서드를 모두 호출하면
		 * method1() => 익명 객체에서 재정의
		 * method2() => 익명 객체에서 재정의
		 * method3() => 익명 객체에서 재정의
		 * */
		ChildInterface3 ci3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ci3-method1()");
			}

			@Override
			public void method2() {
				System.out.println("ci3-method2()");
			}
			
			@Override
			public void method3() {
				System.out.println("ci3-method3()");
			}
			
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
		System.out.println("======================================================");
	}

}
