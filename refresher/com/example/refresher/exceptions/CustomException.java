package com.example.refresher.exceptions;

public class CustomException extends Exception {

	final int count;

	public CustomException(final int count) {
		super("The count equals " + count);
		this.count = count;
	}

	public int getCount() {
		return this.count;
	}

}
