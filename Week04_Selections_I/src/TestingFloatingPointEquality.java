
public class TestingFloatingPointEquality {

	public static void main(String[] args) {
		final double EPSILON = 1E-14; //1E-14 = 0.00000000000001
		
		double x = 0.5;
		double y = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		
		System.out.println("You cannot reliably test equality for floating-point values");
		System.out.println("(x == y) would return false since y contains round-off errors, even though"
				+ " mathematically y should be 0.5");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Therefore: (x == y) is " + (x == y) );
		
		System.out.println();
		
		System.out.println("To approximate if x and y are very very very close to eachother to almost be equal.");
		System.out.println("We can use the formula |x - y| < EPSILON where EPSILON is 10^-14 (0.00000000000001)");
		System.out.println("Bascially this says if the difference between x and y is soooooo small to be insiginificant, ");
		System.out.println("We can say x and y are approximately equal.");
		
		System.out.println("|x - y| < EPSILON = " + (Math.abs(x - y) < EPSILON));
		
		
		
		
		

	}

}
