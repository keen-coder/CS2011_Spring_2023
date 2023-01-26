/**
 * In Java we can use the System.out.print() or System.out.println() statements
 * to print data to the console window.  
 * 
 * System.out.print(): Will print whatever data is between the ( ) and will NOT
 * print a new line character after the data has been printed.
 * 
 * System.out.println(): Will print whatever data is between the ( ) and WILL
 * print a new line character after the data has been printed.
 * 
 * NOTE: Strings (sequences of characters) are created in Java using a pair of
 * double quotes " ".
 * 
 * @author Keenan Knaur, California State University, Los Angeles
 */
public class PrintingInJava {

	public static void main(String[] args) {
		
		//The following two lines will appear on the same line.
		System.out.print("This sentence will appear on the first line. ");
		System.out.print("This sentence will also appear on the first line.");
		/* After these two statements have been printed, the console cursor is
		 * sitting at the end of the second sentence.*/
		
		/*If you want to print one or more new line characters to create line
		 * breaks in your output, you can use the System.out.println() command 
		 * by itself without passing anything into the ( ).*/
		System.out.println(); //Moves the curser to the next line.
		System.out.println(); //Moves the curser to the next line again.
		
		//The following two lines will appear on different lines, one after the other.
		System.out.println("This sentence will appear on its own line.");
		System.out.println("This sentence will also appear on its own line.");
	}

}
