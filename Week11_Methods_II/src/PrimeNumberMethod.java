
import java.util.Random;

public class PrimeNumberMethod {
	public static void main(String[] args) {

		testIsPrime(100);


		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}

	public static void testIsPrime(int n) {
		Random r = new Random();

		for (int i = 1 ; i <= n ; i++) {
			int rand = r.nextInt(100);
			System.out.println("Is " + rand + " prime? " + isPrime(rand));
		}
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		// Repeatedly find prime numbers
		while (count < numberOfPrimes) {
			// Print the prime number and increase the count
			if (isPrime(number)) {
				count++; // Increase the count

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.printf("%-5s\n", number);
				}
				else
					System.out.printf("%-5s", number);
			}

			// Check if the next number is prime
			number++;
		}
	}

	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor < number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}
}