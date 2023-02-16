public class RandomNumbers {
	public static void main(String[] args) {
		//NOTE: this example uses loops for demo purposes only.  We will
		//start using loops in a few weeks.
		
		System.out.println("Math.random() generates random values from 0.0 up to but not including 1.0");
		System.out.println("The following 30 values are examples of what this method generates.");
		for (int i = 1 ; i <= 10 ; i++) {
			double value1 = Math.random();
			double value2 = Math.random();
			double value3 = Math.random();
			
			System.out.println( value1 + "\t" + value2 + "\t" + value3);
		}
		
		System.out.println();
		
		System.out.println("Notice how only values less than 1 are generated");
		System.out.println("What if we want to generate values greater than 1?");
		System.out.println("Multiply the result by the upper bound you want to generate to.");
		
		System.out.println("The following 30 values are examples of values from 0.0 up to but not including 20.0");
		System.out.println("Normally though, we want to generate random integers");
		System.out.println("You can always cast the result to an int.");
		for (int i = 1 ; i <= 10 ; i++) {
			int value1 = (int)(Math.random() * 20);
			int value2 = (int)(Math.random() * 20);
			int value3 = (int)(Math.random() * 20);
			
			System.out.println( value1 + "\t" + value2 + "\t" + value3);
		}
		
		System.out.println();
		
		System.out.println("If you want to include the upper bound, you need to multiply by 1 more than the maximum.");
		System.out.println("SO to generate random integers from 0 to any max (including the max) we use the formula:");
		System.out.println("(int)(Math.random() * (max + 1))");
		for (int i = 1 ; i <= 10 ; i++) {
			int max = 20;
			int value1 = (int)(Math.random() * (max + 1));
			int value2 = (int)(Math.random() * (max + 1));
			int value3 = (int)(Math.random() * (max + 1));
			
			System.out.println( value1 + "\t" + value2 + "\t" + value3);
		}
		
		System.out.println();
		
		System.out.println("Sometimes we want to generate random values starting from any min up to any max");
		System.out.println("For this we can use the formula: ");
		System.out.println("(int)(Math.random() * (max - min + 1) + min)");
		for (int i = 1 ; i <= 10 ; i++) {
			int min = 15;
			int max = 20;
			int value1 = (int)(Math.random() * (max - min + 1) + min);
			int value2 = (int)(Math.random() * (max - min + 1) + min);
			int value3 = (int)(Math.random() * (max - min + 1) + min);
			
			System.out.println( value1 + "\t" + value2 + "\t" + value3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}