import java.util.Scanner;

public class CountLettersInArray {
	/** Main method */
	public static void main(String[] args) {
		System.out.println('a' - 10);
		
		while (true) {
			int choice = menu();
			
			char[] chars = null;
			
			switch(choice) {
			case 1: 
				chars = createArray(readSize());
				break;
			case 2:
				chars = createArray(readString());
				break;
			case 3:
				System.exit(0);
			}
			
			//Compute the letter counts
			int[] counts = countLetters(chars);
			
			//Display the results
			
			displayResults(chars, counts);
			
		}
	}
	
	public static int menu() {
		Scanner in = new Scanner(System.in);
		String menu = "Welcome to the Letter Counter\n" +
					  "How would you like to create your array?\n" +
					  "1. Create array with random characters.\n" +
					  "2. Create array with input string.\n" +
					  "3. Exit\n" + 
					  "Enter choice (1-3): ";
		int choice;
		do {
			System.out.println(menu);
			choice = in.nextInt();
			
			if (choice <= 0 || choice >=4) {
				System.out.println("ERROR: Menu option must be a value 1 - 3.");
			}
			
			
		} while (choice <= 0 || choice >=4);
		
		return choice;
	}
	
	public static int readSize() {
		Scanner in = new Scanner(System.in);
		
		int size;
		do {
			System.out.print("Enter the size for the array: ");
			size = in.nextInt();
			
			if (size <= 0) {
				System.out.println("ERROR: Size must be a positive integer greater than zero.");
			}
			
			
		} while (size <= 0);
		
		return size;
	}
	
	public static String readString() {
		Scanner in = new Scanner(System.in);
		
		boolean isValid = false;
		String str;
		
		do {
			System.out.println("Enter a String of all lowercase letters: ");
			str = in.nextLine();
			
			isValid = isValidString(str);
			
			if (!isValid) {
				System.out.println("ERROR: The user input must be a string of only lowercase letters.");
			}
		} while(!isValid);
		
		return str;
	}
	
	public static boolean isValidString(String str) {
		for (int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (!Character.isLetter(ch) || Character.isUpperCase(ch)) {
				return false;
			}
		}
		return true;
	}
	

	/** Create an array of characters */
	public static char[] createArray(int size) {
		// Declare an array of characters and create it
		char[] chars = new char[size];

		// Create lowercase letters randomly and assign
		// them to the array
		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		
		// Return the array
		return chars;
	}
	
	public static char[] createArray(String str) {
		//Convert the string to an array of characters.
		char[] chars = str.toCharArray();
		
		return chars;
	}
	
	/** Count the occurrences of each letter */
	public static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 int
		int[] counts = new int[26];

		// For each lowercase letter in the array, count it
		for (int i = 0; i < chars.length; i++)
			counts[chars[i] - 'a']++;

		return counts;
	}

	public static void displayResults(char[] chars, int[] counts) {
		
		//display the character array first 20 characters per line
		System.out.println("Original Array of Characters: ");
		
		for (int i = 0 ; i < chars.length ; i++) {
			String output = ((i + 1) % 20 == 0) ? chars[i] + "\n": chars[i] + " ";
			System.out.print(output);
		}
		
		System.out.println();
		System.out.println("Counts Result:");
		//Display the counts result:
		char ch = 'a';
		for (int i = 0 ; i < counts.length ; i++) {
			String output = ((i + 1) % 10 == 0) ? ch + ": " + counts[ch - 'a'] + "\n" : ch + ": " + counts[ch - 'a'] + "\t";
			System.out.print(output);
			ch++;
		}
		
		System.out.println("\n");	
	}	
}