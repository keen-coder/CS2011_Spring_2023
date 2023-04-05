import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		//123-45-6789
		String ssn = ssnInput();

		if (!isValidLength(ssn)) {
			System.out.println("Length is not valid.");
			System.out.println("Must be 11 characters.");
			System.exit(1);
		}

		if (isValidNumber(ssn)) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}

	}

	public static String ssnInput() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a ssn: ");
		String ssn = in.nextLine();
		return ssn;
	}

	public static boolean isValidLength(String ssn) {
		return (ssn.length() == 11);
	}

	public static boolean isHyphen(char ch) {
		return ch == '-';
	}

	public static boolean isValidNumber(String ssn) {

		for (int i = 0 ; i < ssn.length() ; i++) {
			char nextChar = ssn.charAt(i);
			if ( (i == 3 || i == 6) ) {
				if(!isHyphen(nextChar)) {
					return false;
				}
			}  
			else if (!Character.isDigit(nextChar)) {
				return false;
			}
		}


		return true;
	}

	
}