/**
 * Runtime Errors (Also known as 'Exceptions') are errors that occur while the
 * program is running, and usually cause the program to crash.
 * 
 * When the program crashes Exception messages will be shown in the console
 * to try to help you figure out what went wrong so you can fix it.
 * 
 * Runtime Errors are the second hardest to deal with.
 * 
 * @author Keenan Knaur, California State University, Los Angeles
 */
public class RuntimeErrors {

	public static void main(String[] args) {
		System.out.println("The program will print this line.");
		
		//Division by zero is undefined and the program will crash at this point.
		System.out.println(10/0);
		
		System.out.println("The program will not reach this line.");

	}

}
