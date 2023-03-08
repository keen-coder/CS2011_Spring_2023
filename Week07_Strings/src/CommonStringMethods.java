public class CommonStringMethods {
	public static void main(String[] args) {
		String s1 = "The quick brown fox jumped over the lazy dog.";
		
		//You can get the length of a String using the length() method.
		int s1Length = s1.length();
		System.out.println("The length of s1 is" + s1Length);
		
		//You can get a character from a string using the charAt() method.
		//Remember, the index for String starts at 0 not 1.
		//charAt() returns a char type, not a String type.
		char ch1 = s1.charAt(4); //returns the character q
		char ch2 = s1.charAt(0); //returns the character T
		
		//Two strings can be concatenated using the + or the concat() method.
		String s2 = "hello";
		String s3 = "world";
		String combine1 = s2 + " " + s3;
		String combine2 = s2.concat(" ").concat(s3);
		
		//Strings can be converted to upper or lower case.
		String upper = s1.toUpperCase();
		System.out.println("s1 uppercase = " + upper);
		
		String allCaps = "JAVA IS GREAT!";
		String lower = allCaps.toLowerCase();
		System.out.println("allCaps lowercase = " + lower);
		
		//You can use the trim() method to remove any whitespace characters in
		//from the beginning and end of the string.
		String strWithWhiteSpaceChars = "    \t\t    This String has whitespace characters in the beginning and end        \t";
		String trimmedString = strWithWhiteSpaceChars.trim();
		System.out.println("Original String: "  + strWithWhiteSpaceChars);
		System.out.println("Trimmed String: " + trimmedString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}