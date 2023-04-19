import java.util.Scanner;
public class PopulatingArraysWithData {
	public static void main(String[] args) {
		//Create the Array
		int[] numbers1 = new int[5];

		//Assign each value one at a time
		//arrayName[index] <--- indexed variable
		numbers1[0] = 56;
		numbers1[1] = 107;
		numbers1[2] = 34;
		numbers1[3] = 115;
		numbers1[4] = 1045;

		//Using an array initializer list
		int[] numbers2 = {56, 107, 34, 115, 1045};

		//Init using user input
		Scanner in = new Scanner(System.in);
		System.out.print("How many values?: ");
		int size = in.nextInt();
		double[] numbers3 = new double[size];
		
		System.out.print("Enter the values: ");

		for (int i = 0; i < numbers3.length; i++) {
			numbers3[i] = in.nextDouble();
		}
	}
}