package hogent.ui;

import java.util.Scanner;

import hogent.domein.Klant;

public class KlantApplicatie {

	public static void main(String[] args) {

		Klant klant1 = new Klant();
		Klant klant2 = new Klant("Jan", true);

		Scanner input = new Scanner(System.in);
		int menuKeuze = -1;
		while (menuKeuze != 0) {
			menuKeuze = menuKeuze(input);
			// we gebruiken hier een switch, maar dit kan even goed met een if/else
			switch (menuKeuze) {
			case 1: {
				System.out.print("Geef nieuwe naam voor klant1: ");
				input.nextLine(); // nextLine() na nextInt()!
				String naam = input.nextLine();
				klant1.setNaam(naam);
				break;
			}
			case 2: {
				System.out.print("Geef het bedrag van de aankoop voor klant2: ");
				double bedrag = input.nextDouble();
				double teBetalenBedrag = klant2.registreerAankoop(bedrag);
				System.out.printf("Jan moet %.1f betalen voor de aankoop%n", teBetalenBedrag);
				break;
			}
			case 3: {
				System.out.println("Instellen kortingpercentages van klant1 en klant2");
				klant1.bepaalKortingPercentage();
				klant2.bepaalKortingPercentage();
				break;
			}
			}
		}

		printKlant(klant1);
		printKlant(klant2);

		input.close(); // vergeet je scanner niet te sluiten!
	}

	public static int menuKeuze(Scanner input) {
		System.out.println("Menu");
		System.out.println("1. Nieuwe naam voor klant1");
		System.out.println("2. Aankoopbedrag door klant2");
		System.out.println("3. Kortingpercentages van klant1 en klant2 opnieuw instellen");
		System.out.println("0. Programmma verlaten");
		System.out.print("Jouw keuze: ");
		int keuze = input.nextInt();
		return keuze;
	}

	public static void printKlant(Klant klant) {
		if (klant.getKlantenkaart()) {
			System.out.printf("Klant met naam %s heeft kortingpercentage %s%n", klant.getNaam(),
					klant.getKortingPercentage());
		} else {
			System.out.printf("Klant met naam %s heeft geen klantenkaart.%n", klant.getNaam());
		}

	}

}
