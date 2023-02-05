import java.util.Scanner;

public class ComputeAverageThreePrompts {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the first value: ");
		double num1 = input.nextDouble();

		System.out.print("Enter the second value: ");
		double num2 = input.nextDouble();

		System.out.print("Enter the third value: ");
		double num3 = input.nextDouble();

		double avg = (num1 + num2 + num3) / 3;
		System.out.println("Avg: " + avg);



	}
}