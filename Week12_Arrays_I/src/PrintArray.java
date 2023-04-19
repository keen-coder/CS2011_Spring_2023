import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("How many values?: ");
		int size = in.nextInt();

		double[] numbers = new double[size];
		//5.6 2.78 4.59 10.47 89.35821
		System.out.print("Enter the values: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextDouble();
		}

		//Printing the array
		//use a for loop
		for (int i = 0 ; i < numbers.length ; i++) {
			System.out.print(numbers[i] + " ");
		}


	}
}