package com.example.java.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ComplexAnnotation {

	String someValue();

	String anotherValue();

}
