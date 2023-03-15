import java.util.Scanner;


public class LoopsAndMenu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		String menu = "1. Print \"Hello World\"\n" +
				"2. Print \"Java\"\n" +
				"3. Exit Program\n" +
				"Choose Option (1-3): ";

		while(true) {
			System.out.print(menu);
			int menuChoice = in.nextInt();

			switch(menuChoice) {
			case 1: System.out.println("Hello World"); break;
			case 2: System.out.println("Java"); break;
			case 3: System.exit(0);
			}
			System.out.println();
		}
	}
}