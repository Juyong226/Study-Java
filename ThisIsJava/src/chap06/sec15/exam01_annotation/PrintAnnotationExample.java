package chap06.sec15.exam01_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {

		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			System.out.print(method.getName());
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				System.out.print(" [PrintAnnotation 적용 O]");
				
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				System.out.print(" [value: " + printAnnotation.value() + "]");
				System.out.println(" [number: " + printAnnotation.number() + "]");
			}
			else {
				System.out.println(" [PrintAnnotation 적용 X]");
			}
		}
	}

}
