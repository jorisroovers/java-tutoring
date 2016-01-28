package com.example.java.interfaces;

import com.example.java.interfaces.impl.Ford;
import com.example.java.interfaces.impl.MobileHome;

public class App {

	public static void main(String[] args) {

		Car car = new Ford();
		car.drive();

		House myHouse = new MobileHome("Mercedes", 12);
		Car myCar = new MobileHome("Chrysler", 13);
		MobileHome myMobileHome = new MobileHome("Seat", 9);

		System.out.println("myHouse.getLivingSurface(): " + myHouse.getLivingSurface());
		System.out.println("myCar.drive(): ");
		myCar.drive();

		// Let's drive the mobile home
		myMobileHome.drive();
		myMobileHome.openWindows();
		myMobileHome.drive();

	}

}
