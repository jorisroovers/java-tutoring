package com.example.refresher.jdk;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		input();
		// nextIntNextLine();
		// readNumberValidation();
		// basicCLI();
	}

	public static void input() {
		System.out.println("ScannerExample.input()");
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		System.out.println(n);
		reader.close(); // IMPORTANT!
	}

	public static void nextIntNextLine() {
		// There is a tricky issue when using Scanner.nextLine() after a Scanner.nextFoo() method:
		// http://stackoverflow.com/questions/13102045/skipping-nextline-after-using-next-nextint-or-other-nextfoo-methods
		System.out.println("ScannerExample.nextIntNextLine()");
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		System.out.println("You number was: " + n);
		// reader.nextInt() only reads the number you entered and leaves the newline (=enter/return) in the buffer
		// which is why you need an extra call to nextLine();
		reader.nextLine();
		System.out.println("Enter a name now: ");
		String name = reader.nextLine();
		System.out.println("Your entered name was: " + name);

		reader.close(); // IMPORTANT!

		// NOTE: it's actually better to always do nextLine() and use Integer.parseInt() but that's something else.
	}

	public static void readNumberValidation() {
		int number = -1;
		Scanner reader = new Scanner(System.in);
		// expected input: 1 <= number <= 20
		while (number < 1 || number > 20) {
			System.out.print("Enter a number between 1 and 20: ");
			number = reader.nextInt();
		}
		System.out.println("Number: " + number);
		reader.close();
	}

	public static void basicCLI() {
		System.out.println("Welcome to spaceship simulator 2000! Type 'help' for help!");

		Scanner reader = new Scanner(System.in);
		String command = "";
		while (true) {
			System.out.print("> ");
			command = reader.nextLine();

			if ("eject".equals(command)) {
				ejectSeat();
			} else if ("fire".equals(command)) {
				fireLasers();
			} else if ("help".equals(command)) {
				System.out.println("Available commands: help, eject, fire, exit.");
			} else if ("exit".equals(command)) {
				System.out.println("Ok, thanks, bye!");
				break; // you can also use return/system.exit()
			} else {
				System.out.printf("Unknown command '%s'. Available commands: help, eject, fire, exit %n.", command);
			}
		}
		reader.close();
	}

	public static void ejectSeat() {
		System.out.println("Ejecting seat in...3...2...1:");
		System.out.println("*** EJECT ***");
		System.out.println("Passenger succesfully ejected.");

	}

	public static void fireLasers() {
		System.out.println("Firing lasers!");
		System.out.println(":=- -- -- -- ");
		System.out.println("PEW PEW PEW!");
	}

}
