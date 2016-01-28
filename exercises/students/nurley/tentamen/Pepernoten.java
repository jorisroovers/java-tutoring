package students.nurley.tentamen;

import java.util.Scanner;

public class Pepernoten {

	public static void main(String[] args) {
		// STAP 1
		String achternaam = geefAchternaam();
		int studentNummer = geefStudentNummer();
		System.out.println("Dit programma is gemaakt door " + achternaam + ", " + studentNummer);
		System.out.println();

		// STAP 2
		Scanner input = new Scanner(System.in);
		String[] weekdagen = { "zondag", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag" };
		int[] aantalGegetenPepernoten = new int[weekdagen.length]; // je kan hier ook gewoon 7 gebruiken
		for (int i = 0; i < weekdagen.length; i++) {
			System.out.print("Hoeveel pepernoten heb je gegeten op " + weekdagen[i] + ": ");
			aantalGegetenPepernoten[i] = input.nextInt();
			input.nextLine();
		}
		System.out.println();

		// STAP 3
		String misselijkheidsStaat = misselijk(aantalGegetenPepernoten);
		System.out.println("Je bent " + misselijkheidsStaat + " misselijk.");

		// STAP4
		int aantalKcal = totaalKcal(aantalGegetenPepernoten);
		System.out.println("Je hebt " + aantalKcal + " kcal gegeten.");

		// STAP 5
		String voorbeeldDag = minstAantalKcal(aantalGegetenPepernoten);
		System.out.println(voorbeeldDag + " was een voorbeeld dag.");
		System.out.println();

		// STAP 6
		// De output is hier een beetje verwarrend omdat ik niet zeker weet of je printf() hebt behandeld of niet.
		// Onze output is met komma getallen (ik wil je niet verwarren hier met nieuwe dingen te gebruiken).
		// Ik denk eigenlijk dat de docent zich hier vergist ivm de output.
		double totaalVet = totaalGramVet(aantalGegetenPepernoten);
		System.out.println("Totaal gram vet: " + totaalVet);

		double totaalSuiker = totaalGramSuiker(aantalGegetenPepernoten);
		System.out.println("Totaal gram suiker: " + totaalSuiker);

		// Er is hier een fout in de opgave: we hebben reeds het totaal aantal kcal bepaald.
		// De vraag zou hier moeten zijn: bepaal het totaal aantal pepernoten gegeten pepernoten. De output is wel
		// juist.

		int totaalAantalPepernoten = totaalAantalPepernoten(aantalGegetenPepernoten);
		System.out.println("Totaal gegeten pepernoten: " + totaalAantalPepernoten);
	}

	// STAP 1
	public static String geefAchternaam() {
		return "Roovers";
	}

	// STAP 1
	public static int geefStudentNummer() {
		return 123;
	}

	// STAP 3
	public static String misselijk(int[] aantalGegetenPepernoten) {
		// NOTA: de opgave is hier niet zo duidelijk of iemand misselijk is vanaf exact 30 pepernoten per dag
		// of vanaf gemiddeld 30 pepernoten per dag. Ik vermoed dat de docent hier ook gemiddeld bedoeld.

		// STAP 3.1: bepaal het gemiddelde aantal pepernoten per dag
		// We gebruiken hier een extra methode die niet in de opgave staat om te vermijden dat we in het vervolg
		// van het tentamen telkens opnieuw het aantal moeten berekenen.
		int totaalAantalPepernoten = totaalAantalPepernoten(aantalGegetenPepernoten);
		// gemiddelde = som van de aantallen gedeeld door het aantal dagen
		int gemiddeldAantalPepernoten = totaalAantalPepernoten / aantalGegetenPepernoten.length;

		// STAP 3.2: bepaal de misselijkheids staat van de persoon op basis van het gemiddelde gegeten aantal pepernoten
		String misselijkheidsStaat = "";
		if (gemiddeldAantalPepernoten >= 30) {
			misselijkheidsStaat = "heel";
		} else if (gemiddeldAantalPepernoten >= 20) {
			misselijkheidsStaat = "licht";
		} else {
			misselijkheidsStaat = "niet";
		}

		return misselijkheidsStaat;
	}

	public static int totaalAantalPepernoten(int[] aantalGegetenPepernoten) {
		// Deze extra methode berekent het totaal aantal gegeten pepernoten
		int totaalAantalPepernoten = 0;
		for (int i = 0; i < aantalGegetenPepernoten.length; i++) {
			totaalAantalPepernoten = totaalAantalPepernoten + aantalGegetenPepernoten[i];
		}
		return totaalAantalPepernoten;
	}

	// STAP 4
	public static int totaalKcal(int[] aantalGegetenPepernoten) {
		int totaalAantalPepernoten = totaalAantalPepernoten(aantalGegetenPepernoten);
		int aantalKcal = totaalAantalPepernoten * 10; // 1 pepernoot = 10kcal, zie pagina 1
		return aantalKcal;
	}

	// STAP 5
	public static String minstAantalKcal(int[] aantalGegetenPepernoten) {
		// normaal gebruik je een zogenaamde statische constante om hier de weekdagen niet te moeten herhalen,
		// maar ik ben niet zeker of jullie dat behandeld hebben dus ik herhaal hier gewoon de weekdagen
		String[] weekdagen = { "Zondag", "Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag" };

		int laagsteAantalGegeten = aantalGegetenPepernoten[0]; // zet het laagste aantal op de 1e dag
		// je kan dit ook met het opslagen van een index doen, maar dit vond je verwarrend voordien, dus we
		// slagen gewoon meteen de weekdag naam op (negeer deze comment als hij verwarrend is).
		String weekdagLaagsteAantalGegeten = weekdagen[0]; // begin bij de eerste weekdag

		// Omdat we het laagste aantal al op de 1e dag hebben gezet kunnen we bij index 1 beginnen.
		for (int i = 1; i < aantalGegetenPepernoten.length; i++) {
			if (aantalGegetenPepernoten[i] < laagsteAantalGegeten) {
				laagsteAantalGegeten = aantalGegetenPepernoten[i];
				weekdagLaagsteAantalGegeten = weekdagen[i];
			}
		}
		return weekdagLaagsteAantalGegeten;
	}

	// STAP 6
	public static double totaalGramVet(int[] aantalGegetenPepernoten) {
		int totaalAantalPepernoten = totaalAantalPepernoten(aantalGegetenPepernoten);
		double totaalVet = totaalAantalPepernoten * 0.5; // 1 pepernoot = 0.5 gram vet, zie pagina 1
		return totaalVet;
	}

	// STAP 6
	public static double totaalGramSuiker(int[] aantalGegetenPepernoten) {
		int totaalAantalPepernoten = totaalAantalPepernoten(aantalGegetenPepernoten);
		double totaalSuiker = totaalAantalPepernoten * 1.5; // 1 pepernoot = 1.5 gram suiker, zie pagina 1
		return totaalSuiker;
	}

}
