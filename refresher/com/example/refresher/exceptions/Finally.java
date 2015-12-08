package com.example.refresher.exceptions;

import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		// You typically use the try {..} finally construct when you don't want to deal with exceptions in
		// the method itself but still need to do some clean up in case things go bad.
		// This often happens when classes are loosely coupled (Law of Demeter), i.e. a called class is not "aware" of
		// how to deal with exceptions.
		// Examples of cleanup: Close files

		try {
			tryFinally();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// tryFinallyUnexpectedException();

		// tryFinallyReturn();

		// tryCatchFinally();

	}

	public static void tryFinally() throws IOException {
		// Simple try...finally
		try {
			// You can throw an exception yourself, or it might be a called method that throws the exception
			throw new IOException("Some IO Error Occured");
		} finally {
			System.out.println("Executing finally, cleaning up resources");
		}
	}

	public static void tryFinallyUnexpectedException() {
		System.out.println("Finally.tryFinallyUnexpectedException()");
		// You can guard against unexpected exceptions
		try {
			int x = 5 / 0;
		} finally {
			System.out.println("Executing finally, cleaning up resources");
		}
	}

	public static int tryFinallyReturn() {
		// There doesn't need to be an exception, you can also just return from the try block, the finally block will
		// still be executed
		System.out.println("Finally.tryFinallyReturn()");
		try {
			return 5;
		} finally {
			System.out.println("Executing finally, cleaning up resources");
		}
	}

	public static void tryCatchFinally() {
		// You *can* still catch exceptions if you want, the finally block will still execute
		System.out.println("Finally.tryCatchFinally()");
		try {
			int x = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Caught Arithmetic Exception");
		} finally {
			System.out.println("Executing finally, cleaning up resources");
		}
	}

}
