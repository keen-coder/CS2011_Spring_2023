public class Formula {
	public static void main(String[] args) {
		int x, y, a, b, c;

		x = y = a = b = c = 1;


		double term1 = (3 + 4 * x) / 5;
		double term2 = (10 * (y - 5) * (a + b + c)) / x;
		double term3 = 9 * ( (4 / x) + ((9 + x ) / y) );
		
		double result = term1 - term2  + term3;



	}
}