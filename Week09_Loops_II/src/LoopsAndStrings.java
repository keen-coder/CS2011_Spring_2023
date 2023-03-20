

import java.util.Scanner;

public class LoopsAndStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		//print each character with a space in between
		for (int i = 0 ; i < s.length() ; i++ ) {
			char current_ch = s.charAt(i);
			System.out.print(current_ch + " ");
		}

		//Using a string accumulator to get the reverse of the string.
		String reverse = "";
		
		for (int i = s.length() - 1 ; i >= 0 ; i--) {
			char current_ch = s.charAt(i);
			reverse += current_ch;
			System.out.println(reverse);
		}

		System.out.println(reverse);
	}
}