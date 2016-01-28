package com.example.java.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUsage {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		AnnotationUsage annotationUsage = new AnnotationUsage();
		Method method = annotationUsage.getClass().getMethod("method2");

		Annotation[] annotations = method.getAnnotations();
		System.out.println("Annotations: ");

		for (Annotation annotation : annotations) {
			System.out.println("annotation: " + annotation);
		}

	}

	@MySimpleAnnotation
	public void method1() {

	}

	@MySimpleAnnotation
	@SimpleValueAnnotation("bar")
	public void method2() {
		System.out.println("foo");

	}

	@ComplexAnnotation(someValue = "foo", anotherValue = "bar")
	public void method3() {

	}

}
