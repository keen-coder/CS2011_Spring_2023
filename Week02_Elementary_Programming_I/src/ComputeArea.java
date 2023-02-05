import java.util.Scanner;

/**
 * Name:        <Your_Name_Here>
 * CIN:         <Your_CIN_Number_Here>
 * Course:      <Your_Course_Name_Here>
 * Section:     <Section_Numbers_Here>
 * Description: <Give a description of this class>
 */

public class ComputeArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();

		double area = Math.pow(radius, 2) * Math.PI;

		System.out.println("Area of circle with radius, " + 
			radius + " is: " + area);

		/* Read circle radius
			scanner in = new scanner();
			radius = in.nextDouble();

			compute area:
				area = radius * radius * PI;

		/*
		1. Read in the circle’s radius.
		2. Compute the area using the following formula:
		area = radius * radius * pI
		3. Display the result.
		*/
	}

	
}
