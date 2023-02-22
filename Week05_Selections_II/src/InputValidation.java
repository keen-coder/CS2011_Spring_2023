

import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int x = in.nextInt();

		//Validate x
		if (x < 0) {
			System.out.println("ERROR: x cannot be negative!");
			System.out.println("Program will now exit.");
			System.exit(1);
		}

		System.out.print("Enter a value between 10 and 35: ");
		double y = in.nextDouble();

		//Validate y
		if (y < 10 || y > 35) {
			System.out.println("ERROR: y must be between 10 and 35!");
			System.out.println("Program will now exit.");
			System.exit(1);
		}
	}
}