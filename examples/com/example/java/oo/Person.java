package com.example.java.oo;

// IMPORTANT: every class extends from Object
// public class Person extends Object {
public class Person {

	public String firstName;

	private String lastName;

	private Integer age;

	public Person() {
		// NOTE: ctor has no return value
		System.out.println("Person.Person(): default ctor");
	}

	public Person(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
