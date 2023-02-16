import java.util.Scanner;

public class ComputeAreaIfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();

		if (radius > 0) {
			double area = Math.pow(radius, 2) * Math.PI;
			System.out.println("Area of circle with radius, " + 
				radius + " is: " + area);
		}
		else {
			System.out.println("ERROR: Radius cannot be negative");
		}
	
		


		

		
	}

	
}
