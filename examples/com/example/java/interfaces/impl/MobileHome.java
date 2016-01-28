package com.example.java.interfaces.impl;

import com.example.java.interfaces.Car;
import com.example.java.interfaces.House;

public class MobileHome implements Car, House {

	private int livingSurface;

	private final String brand;

	private boolean windowsOpened;

	public MobileHome(String brand, int livingSurface) {
		this.livingSurface = livingSurface;
		this.brand = brand;
		this.windowsOpened = false;
	}

	@Override
	public int getNumberOfRooms() {
		return 1;
	}

	@Override
	public int getLivingSurface() {
		return 0;
	}

	@Override
	public void openWindows() {
		this.windowsOpened = true;
	}

	public void closeWindows() {
		// NOTE: This method is NOT part of the interace. Classes can have additional methods!
		this.windowsOpened = false;
	}

	@Override
	public void drive() {
		if (this.windowsOpened) {
			System.out.println("VROOM VROOM SWOOSH VROOM SWOOSH");
		} else {
			System.out.println("VROOM VROOM");
		}
	}

	@Override
	public String getBrand() {
		return this.brand;
	}

}
