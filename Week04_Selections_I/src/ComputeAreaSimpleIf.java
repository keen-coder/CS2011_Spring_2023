import java.util.Scanner;

/**
 * Name:        <Your_Name_Here>
 * CIN:         <Your_CIN_Number_Here>
 * Course:      <Your_Course_Name_Here>
 * Section:     <Section_Numbers_Here>
 * Description: <Give a description of this class>
 */

public class ComputeAreaSimpleIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();

		if (radius + 10 > 0) {
			double area = Math.pow(radius, 2) * Math.PI;
			System.out.println("Area of circle with radius, " + 
				radius + " is: " + area);
		}

	
		


		

		
	}

	
}
