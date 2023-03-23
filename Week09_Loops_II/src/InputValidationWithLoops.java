import java.util.Scanner;

public class InputValidationWithLoop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Declare the input variable outside of the loop so you can access
		//it later in your code.
		//Make sure to give it some initial value.
		//int value;
		int value;
		
		do {
			System.out.print("Enter a value between 4 and 15: ");
			value = in.nextInt();

			if (value < 4 || value > 15) {
				System.out.println("ERROR: Input must be between 4 and 15.");
			}

		} while (value < 4 || value > 15);

		System.out.println("value entered is: " + value);
	

		


	}
}