package com.example.java.oo.inheritance;

import com.example.java.oo.Person;
import com.example.java.oo.School;

public class Student extends Person {

	private School school;

	public Student(String firstName, String lastName, Integer age, School school) {
		super(firstName, lastName, age);
	}

}
