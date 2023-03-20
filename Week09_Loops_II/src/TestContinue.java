

public class TestContinue {
	public static void main(String[] args) {
		int sum = 0;
		
		//Sum of 1 ~ 10 = 55
		for(int number = 1 ; number <= 10 ; number++) {
			
			if (number % 3 == 0) {
				continue;
			}

			System.out.print( (number == 1) ? number : " + " + number);
			sum += number;
			
		}
		System.out.println(" = " + sum);
	}
}
