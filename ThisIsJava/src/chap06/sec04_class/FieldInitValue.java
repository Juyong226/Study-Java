package chap06.sec04_class;

import java.util.Arrays;

public class FieldInitValue {
	
	/*
	 * =======================================================
	 * 필드의 기본 초기화 값, default initial value
	 * =======================================================
	 * 필드의 값 또는 참조 주소가 클래스에 명시되어 있지 않거나 생성자를 통해 초기화 되지 않으면 JVM은 필드를 '기본값'으로 초기화 한다.
	 * 아래와 같이 클래스에 필드를 선언만 해도 이 클래스의 객체가 생성될 때 JVM은 알아서 필드를 초기화 한다.
	 * 
	 * 정수 타입 => 0
	 * 실수 타입 => 0.0
	 * 불리언 타입 => false
	 * 참조 타입 => null
	 * 
	 * */
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;
	String referenceField;

	@Override
	public String toString() {
		return "FieldInitValue [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
				+ ", longField=" + longField + ", booleanField=" + booleanField + ", charField=" + charField
				+ ", floatField=" + floatField + ", doubleField=" + doubleField + ", arrField="
				+ Arrays.toString(arrField) + ", referenceField=" + referenceField + "]";
	}
}
