public class InitializerList {
	public static void main (String[] args) {
		//Declare, create, and initialize the array using an initializer list
		int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};

		//Print the length of the array
		System.out.println ("Array length: " + primeNums.length);

		//Print the array
		System.out.println ("The first " + primeNums.length + " prime numbers are:");
		
		for(int i = 0; i < primeNums.length; i++) {
			System.out.print (primeNums[i] + "  ");
		}
	}
}
