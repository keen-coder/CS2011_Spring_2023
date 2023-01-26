/**
 * Logic Errors are the hardest errors to detect and fix because they are not
 * detected by the compiler or by the Exception Handling mechanisms when the program
 * crashes.
 * 
 * Logic Errors happen due to a fault in the way the programmer solved their problem.
 * 
 * Generally Logic Errors result in incorrect output or results that you are not
 * expecting.
 *
 * 
 * @author Keenan Knaur, California State University, Los Angeles
 *
 */
public class LogicErrors {

	public static void main(String[] args) {
		//The program will print the wrong results, this is a logic error.
		System.out.println("2 + 2 = " + (2 + 3));
	}

}
