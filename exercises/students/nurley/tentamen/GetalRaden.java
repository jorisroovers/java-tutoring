package students.nurley.tentamen;

import java.util.Random;
import java.util.Scanner;

public class GetalRaden {

	public static void main(String[] args) {
		// STAP 1
		System.out.println("Joris Roovers, Klas 1A, 12345");
		System.out.println();

		// STAP 3
		int[] willekeurigeGetallen = new int[3];
		Random getallenGenerator = new Random();
		willekeurigeGetallen[0] = getallenGenerator.nextInt(7) + 1;
		willekeurigeGetallen[1] = getallenGenerator.nextInt(7) + 1;
		willekeurigeGetallen[2] = getallenGenerator.nextInt(7) + 1;
		// NOTA: Je kan de bovenstaande code ook met een for-loop doen. Dit is eingelijk beter, maar ik deed het zonder
		// om het eenvoudig te houden.

		// NOTA 2: Ik heb hier overal het getal 3 gebruikt in de onderstaande code om alles duidelijk te houden. Je kan
		// dit ook vervangen door een constante (= gebruik het final keyword) of door 'willekeurigeGetallen.length'.

		Scanner input = new Scanner(System.in);

		int aantalCorrecteGetallen = 0;
		int aantalKeerGeraden = 0;
		while (aantalCorrecteGetallen != 3) {
			// STAP 4
			System.out.print("Geef 3 verschillende getallen tussen 1 en 8, gescheiden door spaties: ");
			int[] geradenGetallen = new int[3];
			for (int i = 0; i < 3; i++) {
				int geradenGetal = input.nextInt();
				geradenGetallen[i] = geradenGetal;
			}

			// STAP 5
			aantalCorrecteGetallen = 0;
			for (int i = 0; i < willekeurigeGetallen.length; i++) {
				if (komtVoorIn(willekeurigeGetallen[i], geradenGetallen)) {
					aantalCorrecteGetallen++;
				}
			}
			System.out.println("Aantal correcte getallen = " + aantalCorrecteGetallen);

			aantalKeerGeraden++; // STAP 6
		}
		System.out.println("U heeft " + aantalKeerGeraden + " keer geraden");

		// STAP 7
		System.out.println("De te raden getallen waren: ");
		for (int i = 0; i < willekeurigeGetallen.length; i++) {
			System.out.print(willekeurigeGetallen[i] + " ");
		}
		input.close();

	}

	// STAP 2
	public static boolean komtVoorIn(int zoekgetal, int[] lijst) {
		boolean getalGevonden = false;
		for (int i = 0; i < lijst.length; i++) {
			if (lijst[i] == zoekgetal) {
				getalGevonden = true;
			}
		}
		return getalGevonden;

	}

}
