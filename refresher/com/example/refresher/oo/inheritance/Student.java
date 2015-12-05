package com.example.refresher.oo.inheritance;

import com.example.refresher.oo.Person;
import com.example.refresher.oo.School;

public class Student extends Person {

	private School school;

	public Student(String firstName, String lastName, Integer age, School school) {
		super(firstName, lastName, age);
	}

}
