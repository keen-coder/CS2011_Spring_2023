

import java.util.Scanner;


public class ArrayInitializationWithRandomValues {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int SIZE = 5;
		
		int[] userInput = new int[SIZE];
		
		
		System.out.print("Enter " + SIZE + " values: ");
		
		for (int i = 0 ; i < userInput.length ; i++) {
			userInput[i] = in.nextInt();
		}
		
		System.out.println("Values entered: ");
		printArr(userInput);
			
	}
	
	public static void printArr(int[] arr) {
//		for (int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
	}

}
