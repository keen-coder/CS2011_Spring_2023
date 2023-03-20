import java.util.Scanner;

public class UserConfirmationContinue {
	public static void main(String[] args) {
		//Create the Scanner
		Scanner input = new Scanner(System.in);

		//Read in the initial data
		
		int data = 0;
		int sum = 0;
		char yes = 'y';
		
		while (yes == 'y') {
			System.out.print("Enter an integer: ");
			data = input.nextInt();
			sum += data;

			System.out.print("Do you want to continue? (y or n): ");
			yes = input.next().toLowerCase().charAt(0);
		}

		System.out.println("The sum is: " + sum);
	}
}
