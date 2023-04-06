public class ReturnVsVoid {
	public static void main(String[] args) {
		double sum = sum3(10, 20, 30);
		double avg = avg(sum, 3);

		//The following line will not compile because sum3Void
		//is a void method and does not return anything, therefore,
		//the method invocation cannot be assigned to a variable.
		double sum2 = sum3Void(10, 20, 30);
	}

	public static double avg(double sum, int n) {
		return sum / n;
	}

	public static double sum3(double a, double b, double c) {
		return a + b + c;
	}

	//
	public static void sum3Void(double a, double b, double c) {
		System.out.println(a + b + c);
	}
		
}