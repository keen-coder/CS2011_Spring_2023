import java.util.Scanner;

public class MathFunctions {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double degrees = 90;
		
		//double radians = Math.toRadians(degrees);

		double result = Math.sin(Math.toRadians(degrees));

		System.out.println(result);

	    Math.ceil(3.0); //4.0
		Math.ceil(5.9); //6.0

		Math.floor(4.9); //4.0
		Math.floor(7.1); //7.0

		Math.rint(2.1); //3.0
		Math.rint(3.7); //4.0
		Math.rint(3.5); //4.0	
		Math.rint(8.5); //8.0

		Math.round(6.2); //6
		Math.round(7.8); //8

	}
}