import java.util.Random; //<-- Don't forget to import

public class RandomNumberGeneration2 {
	public static void main(String[] args) {
		Random r = new Random(); //<-- create your random object.

		//You can generate any random integer from [0, max] inclusive
		//using the formula: r.nextInt(max + 1)

		//Example: Generate a random number from 0 to 100
		int randomFrom0 = r.nextInt(100 + 1);

		// You can generate any range of random numbers [min, max] using the following
		// formula:
		// r.nextInt((max – min) + 1) + min;

		//Example: Generate a random number between 2 and 10 including the 10;
		int randomBetween2And10 = r.nextInt((10 - 2) + 1) + 2;
		
		//Example: Generate a random number between 72 and 107
		int randomBewteen72And107 = r.nextInt((107 - 72) + 1) + 72;
	}
}
