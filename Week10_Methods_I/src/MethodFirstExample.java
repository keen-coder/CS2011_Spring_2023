

public class MethodFirstExample {

	public static void main(String[] args) {
		//Value returning methods can be assigned to variables.
		int result1 = sum(1, 10); 
		
		//Or they can be printed in a print statement
		System.out.println("The result is: " + sum(4, 98));
		
		//Or can be part of a longer expressions
		int result2 = 5 * 100 / sum(4, 8);
		
		//Void methods on the other hand can ONLY be a statement by themselves.
		sum2(23, 45);

	}
	
	/*Method that returns the sum of the integers between lower
	 * and upper.
	 */
	public static int sum(int lower, int upper) {
		int result = 0;
		for (int i = lower ; i <= upper ; ++i) {
			result += i;
		}
		return result;
	}
	
	/*Void version of the previous method, prints the sum instead of
	 * returning it.
	 */
	public static void sum2(int lower, int upper) {
		int result = 0;
		for (int i = lower ; i <= upper ; ++i) {
			result += i;
		}
		System.out.println("The sum is: " + result);
	}

}
