/*
You can use Input / Output Redirection in the console to "redirect" where
the input comes from or where the output is going.

EXAMPLES:

java IORedirection < inputFileName.txt
	-will automatically read the data from the file one number at a time.
	-displays the results in the console.

java IORedirection > outputFileName.txt
	-will ask you to enter the values into the console yourself.
	-will print the results in the file and NOT the console.

java IORedirection < inputeFileName.txt > outputFileName.txt
	-will automatically read the data from the input file
	-will automatically print the results in the output file.
*/
import java.util.Scanner;

public class IORedirection {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter values, e to end: ");

		int count = 0;
		double sum = 0;
		double max = Double.MIN_VALUE;

		while (in.hasNextDouble()) {
			double nextValue = in.nextDouble();
			System.out.println("The next value is: " + nextValue);
			count++;
			sum += nextValue;

			if (nextValue > max) {
				max = nextValue;
			}
		}

		double average = sum / count;

		System.out.println("There are " + count + " values.");
		System.out.println("The average is: " + average);
		System.out.println("The maximum value is: " + max);

		System.out.println("PROGRAM WILL NOW EXIT!");
	}
}