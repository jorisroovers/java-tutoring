package com.example.java.oo.init;

public class Application {

	public static void main(String[] args) {

		System.out.println("Class Car");
		Car car = new Car();
		// NOTE: we can't print these things in a method because we can't pass different Car types as the parameter
		System.out.println("Color: " + car.getColor());
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Number of wheels: " + car.getNumberOfWheels());
		System.out.println("Total Cars (class call): " + Car.getTotalCars());
		System.out.println("Total Cars (object call): " + car.getTotalCars());
		System.out.println("--------------------------------");

		System.out.println("Class Car2");
		Car2 car2 = new Car2();
		System.out.println("Color: " + car2.getColor());
		System.out.println("Brand: " + car2.getBrand());
		System.out.println("Number of wheels: " + car2.getNumberOfWheels());
		System.out.println("Total Cars (class call): " + Car2.getTotalCars());
		System.out.println("Total Cars (object call): " + car2.getTotalCars());
		System.out.println("--------------------------------");

		System.out.println("Class Car3");
		Car3 car3 = new Car3();
		System.out.println("Color: " + car3.getColor());
		System.out.println("Brand: " + car3.getBrand());
		System.out.println("Number of wheels: " + car3.getNumberOfWheels());
		System.out.println("Total Cars (class call): " + Car3.getTotalCars());
		System.out.println("Total Cars (object call): " + car3.getTotalCars());
		System.out.println("--------------------------------");

		System.out.println("Class Car4");
		Car4 car4 = new Car4();
		System.out.println("Color: " + car4.getColor());
		System.out.println("Brand: " + car4.getBrand());
		System.out.println("Number of wheels: " + car4.getNumberOfWheels());
		System.out.println("Total Cars (class call): " + Car4.getTotalCars());
		System.out.println("Total Cars (object call): " + car4.getTotalCars());
		System.out.println("--------------------------------");

		System.out.println("Class Porsche");
		Porsche porsche = new Porsche();
		System.out.println("Color: " + porsche.getColor());
		System.out.println("Brand: " + porsche.getBrand());
		System.out.println("Number of wheels: " + porsche.getNumberOfWheels());
		System.out.println("Total Cars (class call): " + Porsche.getTotalCars());
		System.out.println("Total Cars (object call): " + porsche.getTotalCars());
		System.out.println("--------------------------------");

		System.out.println("Class Porsche -- custom constructor");
		Porsche porsche2 = new Porsche(true);
		System.out.println("Color: " + porsche2.getColor());
		System.out.println("Brand: " + porsche2.getBrand());
		System.out.println("Number of wheels: " + porsche2.getNumberOfWheels());
		System.out.println("Total Cars (class call): " + Porsche.getTotalCars());
		System.out.println("Total Cars (object call): " + porsche2.getTotalCars());
		System.out.println("--------------------------------");

	}

}
