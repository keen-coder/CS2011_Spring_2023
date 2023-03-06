import java.util.Scanner;
import java.util.Random;

public class RandomClassExample {
	public static void main(String[] args) {

		Random rand = new Random();
		
		final int MAX = 15;
		final int MIN = 5;

		//General Formula: [0, MAX]
		//rand.nextInt(MAX + 1);

		//General Formula: [MIN, MAX]
		//rand.nextInt(MAX - MIN + 1) + MIN;

		System.out.println(rand.nextInt(MAX + 1));
		System.out.println(rand.nextInt(MAX + 1));
		System.out.println(rand.nextInt(MAX + 1));
		System.out.println(rand.nextInt(MAX + 1));
		System.out.println(rand.nextInt(MAX + 1));
		System.out.println(rand.nextInt(MAX + 1));
		System.out.println();
		
		System.out.println(rand.nextInt(MAX - MIN + 1) + MIN);
		System.out.println(rand.nextInt(MAX - MIN + 1) + MIN);
		System.out.println(rand.nextInt(MAX - MIN + 1) + MIN);
		System.out.println(rand.nextInt(MAX - MIN + 1) + MIN);
		System.out.println(rand.nextInt(MAX - MIN + 1) + MIN);
		System.out.println(rand.nextInt(MAX - MIN + 1) + MIN);
		System.out.println(rand.nextInt(MAX - MIN + 1) + MIN);

	}
}