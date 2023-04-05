

public class PrimeNumberNoMethods {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int currentNumber = 2; // A number to be tested for primeness

		System.out.println("The first 50 prime numbers are \n");

		boolean isPrime = false;

		// Repeatedly find prime numbers
		while (count < 50) {
			//loop to check whether or not a number is prime.
			for (int divisor = 2; divisor <= currentNumber / 2; divisor++) {
				if (currentNumber % divisor == 0) {
					isPrime = false;
					break; // break because we found a number evenly divisible
						   // so this number cannot be prime
				}
				else {
					isPrime = true;
				}
			}
			if (isPrime) {
				isPrime = false; //reset isPrime
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.printf("%-5s\n", currentNumber);
				}
				else {
					System.out.printf("%-5s", currentNumber);
				}
			}

			// Check if the next number is prime
			currentNumber++;
		}
	}
}
