package com.example.java.enums;

public enum Color {
	WHITE(0xFFFFFF), BLACK(0x000000), RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

	private int rgb;

	private Color(int rgb) {
		// enums can only have private constructors -> they can only be called from within the enum definition itself,
		// like we do above.
		this.rgb = rgb;
	}

	public int getRgb() {
		return rgb;
	}

	@Override
	public String toString() {
		return "(" + Integer.toHexString(this.rgb) + ")";
	}

}
