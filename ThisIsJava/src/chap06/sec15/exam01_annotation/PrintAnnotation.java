package chap06.sec15.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * ==========================================================
 * 어노테이션, annotation
 * ==========================================================
 * 어노테이션은 메타데이터(metadata)라 볼 수 있다.
 * 메타데이터란 컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일하고 처리할 것인지를 알려주는 정보이다.
 * => 어노테이션은 명령어가 아님, 컴파일러나 JVM이 소스 코드를 컴파일하고 프로그램을 실행하는 과정에서 참고할 수 있는 정보 같은 것
 * => 설명서라 보면 됨
 * => 결국 컴파일러나 JVM이 특정 어노테이션을 만났을 때 해야할 행동을 규정하는 별도의 프로그래밍이 필요함 
 * */

/*
 * ==========================================================
 * 어노테이션의 정의
 * ==========================================================
 * @interface를 사용하여 어노테이션을 정의한다.
 * => @interface AnnotationName {}
 * 
 * 어노테이션은 '엘리먼트'를 가질 수 있다.
 * 엘리먼트는 보다 디테일한 설명서를 만들기 위해 추가적으로 보관하는 정보라 생각하면 된다. 
 * 만약 어노테이션의 적용 대상마다 다른 엘리먼트 값을 저장한 어노테이션을 부여한다면 그 자체로 대상을 구분할 수 있음
 * (exmaple => @RequestMapping("main") / @RequestMapping("/member"))
 * */

/*
 * @Target을 통해 어노테이션을 정의할 때, 해당 어노테이션을 적용할 수 있는 대상을 정할 수 있다.
 * 적용 대상은 java.lang.annotation.ElementType에 정의된 열거 상수 중에서 선택할 수 있다.
 * 
 * 아래의 경우 메서드에만 PrintAnnoation을 적용할 수 있다는 의미
 * */
@Target({ElementType.METHOD})

/*
 * @Retention을 통해 어노테이션의 유지 정책을 선택할 수 있다.
 * 어노테이션의 유지 정책이란 해당 어노테이션을 어느 시점까지 유지할 것인지 정하는 것으로 java.lang.annotation.RetentionPolicy에 정의된 열거 상수 중에서 선택한다.
 * 1. SOURCE: 소스코드에서만 유지, 컴파일하면서 @AnnotationName은 컴파일 되지 않음
 * 2. CLASS: 어노테이션을 함께 컴파일, 하지만 실행 단계에서는 어노테이션의 정보를 얻을 수 없음
 * 3. RUNTIME: 프로그램 실행 중 리플렉션을 이용하여 어노테이션의 정보를 얻을 수 있음
 * */
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {

	/*
	 * 엘리먼트
	 * 
	 * 엘리먼트는 다음 구조로 정의한다.
	 * [타입][엘리먼트 이름]() default [디폴트 값];
	 * 
	 * 엘리먼트의 타입에는 기본 타입, 참조 타입, 배열 타입을 사용할 수 있다. 
	 * 엘리먼트 이름 뒤에는 만드시 ()를 붙여야 한다.
	 *
	 * value()는 기본 엘리먼트를 의미한다. 
	 * 어노테이션을 적용하는 쪽에서 엘리먼트에 대입할 값들을 명시적으로 넘겨주는데, 만약 그 값이 하나라면 자동으로 value에 초기화 된다.
	 * */
	String value() default "=";
	int number() default 30;
}
