package com.example.java.exceptions;

import java.io.IOException;

public class Throwing {

	public static void main(String[] args) {
		// PRO-TIP: Exceptions occur in exceptional conditions, not as part of negative use-cases
		// For example: Invalid input is not an exception condition!

		// try {
		// throwIOException();
		// } catch (IOException e) {
		// System.out.println("Exception Message: " + e.getMessage());
		// e.printStackTrace();
		// }

		try {
			throwException();
		} catch (IOException e) {
			// you can still catch specific exceptions even though the throws declaration is generic.
			System.out.println("IOException Message: " + e.getMessage());
		} catch (Exception e) {
			// But, you MUST also catch the more generic exception that is part of the throws declaration.
			System.out.println("Exception Message: " + e.getMessage());
			e.printStackTrace();
		}

		// ---------------------------
		// try {
		// throwMultipleExceptions(5);
		// throwMultipleExceptions(15);
		// } catch (IOException e) {
		// e.printStackTrace();
		// } catch (CustomException e) {
		// System.out.println("Count: " + e.getCount());
		// }

		// -----------------------------

		// No need to catch java.lang.* exceptions but if you think they are likely to occur, it's always good to catch
		// them!
		// Also: always use catch all!
		// javaLangException();

		// Exception Hierarchy: https://docs.oracle.com/javase/7/docs/api/java/lang/package-tree.html
		// TODO (joris.roovers): catching 'Throwable' classes (not inheriting from java.lang.Exception).

	}

	/**
	 * You can add a 'throws' keyword with the specific exception that is thrown.
	 * 
	 * @throws IOException
	 *             This method always throws an IO Exception.
	 */
	public static void throwIOException() throws IOException {
		throw new IOException("Some IO Exception occured!");
	}

	/**
	 * You can add a 'throws' keyword a more generic exception.
	 * 
	 */
	public static void throwException() throws Exception {
		throw new IOException("Some IO Exception occured!");
	}

	/**
	 * You can add a multiple exceptions to the 'throws' keyword.
	 * 
	 * @throws IOException
	 *             This method always throws an IO Exception.
	 */
	public static void throwMultipleExceptions(int x) throws IOException, CustomException {
		if (x < 10) {
			throw new IOException("Some IO Exception occured!");
		} else {
			throw new CustomException(x);
		}
	}

	/**
	 * No need to specify a 'throws' clause for java.lang.* exceptions.
	 */
	public static void javaLangException() {
		throw new ArithmeticException("Illegal math!");
	}

}
