package com.example.java.annotation;

public @interface CompileTimeAnnotation {
	// This annotation won't be available at runtime
	// i.e. you won't see it when you use reflection.

	// It can be used to give compiler hints (e.g. @Override -> there needs to be a method that is overridden).

}
