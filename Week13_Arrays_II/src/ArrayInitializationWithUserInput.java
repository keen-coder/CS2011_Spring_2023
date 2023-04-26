

import java.util.Scanner;


public class ArrayInitializationWithUserInput {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many values: ");
		int values = in.nextInt();
		
		double[] numbers = new double[values];
		
		System.out.println("Enter " + numbers.length + " values: ");
		
		for (int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = in.nextDouble();
		}
		
		System.out.println(numbers);
		
		printArr(numbers);
			
		
		char[] ch = {'a', 'b', 'c'};
		
		System.out.println(ch);
	}
	
	public static void printArr(double[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
