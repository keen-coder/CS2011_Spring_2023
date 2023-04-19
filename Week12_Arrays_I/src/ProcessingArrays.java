import java.util.Random;
import java.util.Scanner;

public class ProcessingArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] randomArray = initRandomArray(20);
		
	}
	
	public static void shuffleArray(int[] arr) {
		Random r = new Random();
		
		for (int i = 0 ; i < arr.length ; i++) {
			int ri = r.nextInt(arr.length);
			
			int temp = arr[i];
			arr[i] = arr[ri];
			arr[ri] = temp;
		}
	}
	
	public static int maxElement(int[] arr) {
		int max = arr[0];
		
		for (int i = 1 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int sumArray(int[] arr) {
		int sum = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static int[] initUserInput(int size) {
		Scanner in = new Scanner(System.in);
	
		int[] result = new int[size];
	
		for (int i = 0 ; i < result.length ; i++) {
			result[i] = in.nextInt();
		}
		
		return result;
	}
	
	public static int[] initRandomArray(int size) {
		Random r = new Random();
		
		int[] result = new int[size];
		
		for (int i = 0 ; i < result.length ; i++) {
			result[i] = r.nextInt(100000);
		}
		
		return result;
	}

	public static int[] initRandomArray(int size, int min, int max) {
		Random r = new Random();
		
		int[] result = new int[size];
		
		for (int i = 0 ; i < result.length ; i++) {
			result[i] = r.nextInt(max - min + 1) + min;
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//	public static void shuffleArray(int[] arr) {
	//		Random r = new Random();
	//		
	//		for(int i = 0 ; i < arr.length ; ++i) {
	//			//Generate a random index.
	//			int rIndex = r.nextInt(arr.length);
	//			
	//			int temp = arr[i];
	//			arr[i] = arr[rIndex];
	//			arr[rIndex] = temp;
	//		}
	//	}
	//	
	//	
	//	public static int findMax(int[] arr) {
	//		
	//		int max = arr[0];
	//		
	//		for(int i = 1 ; i < arr.length ; ++i) {
	//			if (arr[i] > max) {
	//				max = arr[i];
	//			}
	//		}
	//		
	//		
	//		return max;
	//	}
	//	
	//
	//	public static double[] initUserInput(int size) {
	//		Scanner in = new Scanner(System.in);
	//
	//		double[] arr = new double[size];
	//
	//		for (int i = 0 ; i < arr.length ; i++) {
	//			arr[i] = in.nextDouble();
	//		}
	//
	//		return arr;
	//	}
	//	
	//	public static int[] initRandom(int size) {
	//		Random r = new Random();
	//		
	//		int[] arr = new int[size];
	//
	//		for (int i = 0 ; i < arr.length ; i++) {
	//			arr[i] = r.nextInt(101);
	//		}
	//
	//		return arr;
	//	}
	//
	//	public static int sumArray(int[] arr) {
	//		int sum = 0;
	//		
	//		for (int i = 0 ; i < arr.length ; i++) {
	//			sum += arr[i];
	//		}
	//		
	//		return sum;	
	//	}
	//	
	//	
		public static void printArray(int[] myList) {
			for (int a: myList){
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		
		
		public static void printArray(double[] myList) {
			for (double a: myList){
				System.out.print(a + " ");
			}
			System.out.println();
		}
	//	

	//




}
