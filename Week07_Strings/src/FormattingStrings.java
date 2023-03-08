
public class FormattingStrings {

	public static void main(String[] args) {
		//Format a floating point value to two decimal places
		System.out.printf("%.2f", 76.3475678);
		System.out.println();
		
		//Keep in mind, the formatted string and the values to format
		//  do not have to be literal values.
		double a = 4243.876543456;
		int b = 5643;
		String output = "value 1: %.4f value 2:%10d";
		System.out.printf(output, a, b);

		
		
		
	}

}





