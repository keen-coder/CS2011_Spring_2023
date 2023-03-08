import java.util.Scanner;

public class ReadingCharactersFromTheConsole {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//You can combine the .next() method of Scanner with the .charAt() method
		//of String to read a single character from the console.
		System.out.print("Enter a single character: ");
		char ch = in.next().charAt(0);
		
		System.out.println("The character you entered was: " + ch);
	}
}