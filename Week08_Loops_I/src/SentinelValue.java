import java.util.Scanner;

public class SentinelValue {
	public static void main(String[] args) {
		//Create the Scanner
		Scanner input = new Scanner(System.in);

		//Read in the initial data
		System.out.print("Enter an integer (the input ends if it is 0): ");
		int data = input.nextInt();

		//Keep reading data until the input is 0
		int sum = 0;
		while (data != 0) {
			sum += data;

			//Read the next data
			//System.out.print("Enter an integer (the input ends of it is 0): ");
			data = input.nextInt();
		}

		System.out.println("The sum is: " + sum);
	}
}
