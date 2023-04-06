import java.util.Scanner;

public class HW07P03WithMethods {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inStr = in.nextLine();

		System.out.println("Uppercase Letters:\t" + upperLetters(inStr));
		System.out.println("Vowel Replaced:\t\t" + vowelsReplace(inStr));
		System.out.println("Number of Vowels:\t" + vowelCount(inStr));
		System.out.println("Number of Consonants:\t" + consCount(inStr));
		System.out.println("Positions of Vowels:\t" + vowelPos(inStr));
	}

	public static String vowelPos(String str) {
		String result = "";

		for(int i = 0 ; i < str.length() ; i++) {
			char nextCh = str.charAt(i);
			if (isVowel(nextCh)) {
				result += i + " ";
			}
		}

		return result;
	}

	public static int consCount(String str) {
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			char nextCh = str.charAt(i);

			if (isSpace(nextCh)) {
				continue;
			}

			if (isCons(nextCh)) {
				++count;
			}
		}

		return count;
	}

	public static int vowelCount(String str) {
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			char nextCh = str.charAt(i);



			if (isVowel(nextCh)) {
				++count;
			}
		}

		return count;
	}

	public static String vowelsReplace(String str) {
		String result = "";

		for(int i = 0 ; i < str.length() ; i++) {
			char nextCh = str.charAt(i);

			if (isVowel(nextCh)) {
				result += "_";
			}
			else {
				result += nextCh;
			}


		}

		return result;
	}

	public static boolean isVowel(char ch) {
		String vowels = "aeiou";
		String lower = Character.toLowerCase(ch) + "";
		return vowels.contains(lower);
	}

	public static boolean isCons(char ch) {
		return !isVowel(ch);
	}

	public static boolean isSpace(char ch) {
		return ch == ' ';
	}

	public static String upperLetters(String str) {
		String result = "";

		for(int i = 0 ; i < str.length() ; i++) {
			char nextCh = str.charAt(i);

			if (Character.isUpperCase(nextCh)) {
				result += nextCh + " ";
			}
		}

		return result;
	}


	
}

/*
Enter a String: And miLes tO gO bEfoRe I sleeP

Uppercase Letters:       A L O O E R I P
Vowels Replaced:         _nd m_L_s t_ g_ b_f_R_ _ sl__P
Number of Vowels:        11
Number of Consonants:    13
Positions of Vowels:     0 5 7 11 14 17 19 21 23 27 28
*/