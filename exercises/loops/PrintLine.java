package loops;

public class PrintLine {

	public static void main(String[] args) {
		printLine(1);
		printLine(5);
		printLine(23);
	}

	public static void printLine(int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
