package students.nurley.tentamen;

import java.util.Scanner;

public class Boekenlijst {

	public static void main(String[] args) {
		// STAP 1
		System.out.println("Joris Roovers, Klas 1A, 1234");
		System.out.println();

		// STAP 2
		Scanner input = new Scanner(System.in);
		int aantal = -1;
		while (aantal < 3 || aantal > 15) {
			System.out.print("Hoeveel boeken staan er op de boekenlijst? ");
			aantal = input.nextInt();
		}
		input.nextLine();
		System.out.println();

		// STAP 3
		String[] boeken = new String[aantal];
		double[] prijzen = new double[aantal];

		// STAP 4
		for (int i = 0; i < aantal; i++) {
			System.out.print("Titel van boek " + (i + 1) + ": ");
			boeken[i] = input.nextLine();
		}
		System.out.println();

		// STAP 5
		double totalePrijs = 0.0; // STAP 6
		for (int i = 0; i < aantal; i++) {
			System.out.print("Prijs van " + boeken[i] + ": ");
			prijzen[i] = input.nextDouble();
			totalePrijs = totalePrijs + prijzen[i]; // STAP 6
		}
		System.out.println();

		// STAP 6
		System.out.println("De total prijs van de boekenlijst is " + totalePrijs + " Euro.");

		// STAP 7
		String titelDuursteBoek = duursteBoek(boeken, prijzen);
		System.out.println("Het duurste boek is " + titelDuursteBoek + ".");
		System.out.println();

		// STAP 8
		System.out.println("De boekenlijst bestaat uit de volgende boeken: ");
		for (int i = 0; i < boeken.length; i++) {
			System.out.print((i + 1) + ". ");
			System.out.print(boeken[i]);
			System.out.print(" (" + prijzen[i] + " Euro), ");
			double percentage = prijzen[i] / totalePrijs * 100;
			long percentageAfgerond = Math.round(percentage);
			System.out.println(percentageAfgerond + "%");
		}
		input.close();

	}

	public static String duursteBoek(String[] titels, double[] prijzen) {
		String titelDuursteBoek = null;
		double duurstePrijs = 0;
		for (int i = 0; i < titels.length; i++) {
			if (prijzen[i] >= duurstePrijs) {
				titelDuursteBoek = titels[i];
				duurstePrijs = prijzen[i];
			}
		}
		return titelDuursteBoek;
	}

}
