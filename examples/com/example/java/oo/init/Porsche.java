package com.example.java.oo.init;

/**
 * Implicit/explicit super() calls.
 */
public class Porsche extends Car4 {

	private boolean engineInFront; // some Porshes have their engine in the front, some in the back

	public Porsche() {
		// super();// super call is implicit!
		System.out.println("trace: Porsche: default constructor");
	}

	public Porsche(boolean engineInFront) {
		super("Porsche", "Black", 4); // super/this() calls MUST be the first statement
		System.out.println("trace: Porsche: custom constructor");
		this.engineInFront = engineInFront;
	}

	public boolean isEngineInFront() {
		return engineInFront;
	}

	public void setEngineInFront(boolean engineInFront) {
		this.engineInFront = engineInFront;
	}

}
