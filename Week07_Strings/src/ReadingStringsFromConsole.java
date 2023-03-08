import java.util.Scanner;

public class ReadingStringsFromConsole {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//The nextLine() method of Scanner reads the entire line up to and including the
		//new line character.
		System.out.println("Enter a sentence: ");
		String sentence = in.nextLine();
		System.out.println("The sentence you entered was: " + sentence);

		//The next() method of Scanner only reads up to but not including the next
		//whitespace character.  This could be the next space, or next new line
		//or other whitespace character.
		System.out.println("Enter a word: ");
		String word = in.next();
		System.out.println("The word you entered was: " + word);




	}

}
