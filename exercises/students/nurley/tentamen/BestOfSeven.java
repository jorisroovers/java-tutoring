package students.nurley.tentamen;

import java.util.Scanner;

public class BestOfSeven {

	public static void main(String[] args) {
		// STAP 1
		System.out.println("Dit programma is gemaakt door Joris Roovers, Klas 1A, 1234");
		System.out.println();

		// STAP 2
		Scanner input = new Scanner(System.in);
		System.out.print("Naam van team 1: ");
		String team1 = input.nextLine();

		// STAP 3
		System.out.print("Naam van team 2: ");
		String team2 = input.nextLine();
		System.out.println();

		// STAP 4
		final int AANTALWEDSTRIJDEN = 7; // constante -> hoofdletter (code conventie!)
		int[] puntenTeam1 = new int[AANTALWEDSTRIJDEN];
		int[] puntenTeam2 = new int[AANTALWEDSTRIJDEN];

		// STAP 5
		int aantalGewonnenTeam1 = 0;
		int aantalGewonnenTeam2 = 0;

		int wedstrijdNummer = 0;
		while (!(aantalGewonnenTeam1 == 4 || aantalGewonnenTeam2 == 4)) {
			System.out.println("Uitslag wedstrijd " + (wedstrijdNummer + 1));
			System.out.print("Aantal punten " + team1 + ": ");
			puntenTeam1[wedstrijdNummer] = input.nextInt();

			System.out.print("Aantal punten " + team2 + ": ");
			puntenTeam2[wedstrijdNummer] = input.nextInt();
			System.out.println();

			// bepaal wie er heeft gewonnen
			if (puntenTeam1[wedstrijdNummer] > puntenTeam2[wedstrijdNummer]) {
				aantalGewonnenTeam1++;
			} else {
				aantalGewonnenTeam2++;
			}
			wedstrijdNummer++;
		}

		// STAP 6
		System.out.println("Aantal gespeelde wedstrijden: " + wedstrijdNummer);

		// STAP 7
		printWinnaar(team1, team2, aantalGewonnenTeam1, aantalGewonnenTeam2);
		System.out.println();

		// STAP 8
		for (int i = 0; i < AANTALWEDSTRIJDEN; i++) {
			System.out.print("wedstrijd " + (i + 1) + ": " + team1 + " - " + team2 + " ");
			System.out.println(puntenTeam1[i] + " - " + puntenTeam2[i]);

		}

	}

	public static void printWinnaar(String team1, String team2, int aantalWinstTeam1, int aantalWinstTeam2) {
		if (aantalWinstTeam1 > aantalWinstTeam2) {
			System.out.println(team1 + " heeft gewonnen met " + aantalWinstTeam1 + "- " + aantalWinstTeam2);
		} else {
			System.out.println(team2 + " heeft gewonnen met " + aantalWinstTeam2 + "- " + aantalWinstTeam1);
		}
	}

}
