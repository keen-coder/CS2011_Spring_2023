import java.util.Scanner;
public class ConstantExamples {
	public static void main(String[] args) {
		final int X = 10;
		final double PI = 3.14159265;

		final int DO_THIS_CHOICE = 1;
		final int DO_THAT_CHOICE = 2;
		final int EXIT = 3;


		System.out.println("1. Do This");
		System.out.println("2. Do That");
		System.out.println("3. Exit");

		//use scanner to read the option

		Scanner input = new Scanner(System.in);
		int menuChoice = input.nextInt();

		if (menuChoice == DO_THIS_CHOICE) {

		}
		else if(menuChoice == DO_THAT_CHOICE) {

		}
		else if(menuChoice == EXIT) {

		}





	}
}