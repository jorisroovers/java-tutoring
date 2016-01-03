package students.nurley;

import java.util.Scanner;

public class Opgave2 {

	public static void main(String[] args) {
		// Vraag de naam van een persoon en lees deze in.
		// Joris: Je gebruikte hier println(...), de opgave gebruikt echter print() (zonder ln!) zodat de naam op
		// dezelfde lijn blijft staan wanneer je hem typt.
		System.out.print("Hoe heet je? ");

		// maak een scanner object aan
		Scanner input = new Scanner(System.in);

		// input: naam geboortejaar leeftijd gebruik variable
		String naam = input.nextLine();

		// Joris: Je kan best je vraag telkens *tussen* je input.nextXXX() plaatsen. Op die manier wordt de vraag
		// afgedrukt, gevolgd door de gebruiker invoer.

		// Output vraag het geboortje jaar
		System.out.print("Wat is je geboorte jaar? ");

		// Joris: je gebruikte hier voordien een double, maar een geboorte jaar is een geheel getal, dus beter 'int'
		// gebruiken.
		int geboortejaar = input.nextInt();

		// Joris: huidige jaar is een constante, gebruik 'final' en zet de constante in HOOFDLETTERS (=code conventie!)
		final int HUIDIGJAAR = 2014; // Joris: je kan dit naar 2015 veranderen, in de opgave gebruikt men 2014
		// Iemand's leeftijd is gewoon het verschil tussen het huidige jaar en het geboortejaar
		int leeftijd = HUIDIGJAAR - geboortejaar;

		System.out.println("Beste " + naam + ", in " + HUIDIGJAAR + " zal je leeftijd " + leeftijd + " zijn.");

		// Joris: gewoon delen door 0.62 zoals aangegeven in voetnoot 1 onderaan op de opgave
		double venusJaren = leeftijd / 0.62;

		System.out.println("En je leeftijd is dan " + venusJaren + " in Venusjaren.");

	}

}
