package students.nurley.tentamen;

import java.util.Scanner;

public class Tracks {

	public static void main(String[] args) {
		// STAP 1
		System.out.println("Dit programma is gemaakt door Joris Roovers, Klas 1A, 12345");
		System.out.println();

		// STAP 2

		Scanner input = new Scanner(System.in);
		int aantal = 0;
		while (aantal < 2 || aantal > 20) {
			System.out.print("Hoeveel tracks staan er op de playlist? ");
			aantal = input.nextInt();
		}
		input.nextLine();
		System.out.println();

		// STAP 3
		String[] tracktitels = new String[aantal];
		int[] tracktijden = new int[aantal];

		// STAP 4
		for (int i = 0; i < aantal; i++) {
			System.out.print("Titel van track " + (i + 1) + ": ");
			tracktitels[i] = input.nextLine();
		}
		System.out.println();

		// STAP 5 en STAP 6
		double totaleDuurtijd = 0;
		for (int i = 0; i < aantal; i++) {
			System.out.print("Lengte van " + tracktitels[i] + " in seconden: ");
			tracktijden[i] = input.nextInt();
			totaleDuurtijd = totaleDuurtijd + tracktijden[i];
		}
		System.out.println();

		// STAP 6
		double totaleDuurtijdInMinuten = totaleDuurtijd / 60.0; // 60 sec in 1 minuut
		int totaleDuurtijdAfgerond = (int) Math.round(totaleDuurtijdInMinuten);
		System.out.println("De totale duur van de playlist is " + totaleDuurtijdAfgerond + " minuten.");

		// STAP 7
		String langsteTrack = langsteTrack(tracktitels, tracktijden);
		System.out.println("De langste track is: " + langsteTrack);
		System.out.println();

		// STAP 8
		System.out.println("De playlist bestaat uit de volgende nummers: ");
		for (int i = 0; i < aantal; i++) {
			int aantalMinuten = tracktijden[i] / 60;
			System.out.print(tracktitels[i] + ": " + aantalMinuten + " minuten, ");

			int aantalOverblijvendSeconden = tracktijden[i] - (aantalMinuten * 60);
			System.out.println(aantalOverblijvendSeconden + " seconden.");
		}

		input.close(); // strict gezien niet nodig, maar wel best-practice

	}

	public static String langsteTrack(String[] titels, int[] tijden) {
		int langsteTijd = 0;
		String titelLangsteTrack = null;
		for (int i = 0; i < tijden.length; i++) {
			if (tijden[i] >= langsteTijd) {
				langsteTijd = tijden[i];
				titelLangsteTrack = titels[i];
			}
		}

		return titelLangsteTrack;

	}

}
