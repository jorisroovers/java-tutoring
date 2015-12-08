package com.example.java.oo;

import com.example.java.oo.inheritance.Student;
import com.example.java.oo.inheritance.Teacher;

public class Application1 {

	public static void main(final String[] args) {

		School school = new School("University of Amsterdam");
		Person student = new Student("John", "Smith", 20, school);
		Teacher teacher = new Teacher("Marry", "Hopkins", 42, school);
		Course course = new Course("Computer Programming");
		teacher.setCourse(course);

		// TODO: access methods, inheritance, polymorphism

	}

}
