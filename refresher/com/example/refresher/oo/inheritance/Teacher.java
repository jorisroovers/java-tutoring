package com.example.refresher.oo.inheritance;

import com.example.refresher.oo.Course;
import com.example.refresher.oo.Person;
import com.example.refresher.oo.School;

public class Teacher extends Person {

	private School school;

	private Course course;

	public Teacher(String firstName, String lastName, Integer age, School school) {
		super(firstName, lastName, age);
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
