//Demonstrates that anything done to values that are passed to a method does
//not affect the values of the variables in the calling method
public class Increment {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the call, x is " + x);
		increment(x);
		System.out.println("after the call, x is " + x);
	}

	public static void increment(int x) {
		x++;
		System.out.println("n inside the function is " + x);
	}
}
