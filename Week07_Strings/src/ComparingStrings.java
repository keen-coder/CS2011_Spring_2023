
public class ComparingStrings {

	public static void main(String[] args) {
		String s1 = "java, python, c++";
		String s2 = new String("java, python, c++");
		String s3 = "java, python, c++";
		
		//You cannot reliably compare strings using the relational operators.
		//In the example below, even though both Strings are the same, one comparison
		//returns false, and the other returns true.
		//Why this happens, you will not understand until CS2012, but for now
		//all you need to know is NEVER compare Strings using ==, !=, <, <=, >, >=
		//ALWAYS compare Strings with the comparison methods.
		System.out.println("s1 == s2:\n\tis \"" + s1 + "\" == \"" + s2 + "\" ?\t" + (s1 == s2)); //returns false
		System.out.println("s1 == s3:\n\tis \"" + s1 + "\" == \"" + s3 + "\" ?\t" + (s1 == s3)); //returns true
		
		System.out.println();
		
		//To correctly compare Strings for equality, use the .equals() method.
		System.out.println("s1.equals(s2):\n\tis \"" + s1 + "\".equals(\"" + s2 + "\") ?\t" + (s1.equals(s2))); //returns false
		System.out.println("s1.equals(s3):\n\tis \"" + s1 + "\".equals(\"" + s3 + "\") ?\t" + (s1.equals(s3))); //returns true
		
		System.out.println();
		
		//If you need to compare Strings for equality and ignore upper or lowercase letters,
		//you can use the .equalsIgnoreCase() method instead.
		String s4 = "STRING COMPARISON IS EASY WITH METHODS";
		String s5 = "string comparison is easy with methods";
		
		System.out.println(".equals() returns false since the characters are not the same capitalization.");
		System.out.println("\ts4.equals(s5):\t\t\t" + (s4.equals(s5)));
		System.out.println();
		System.out.println(".equalsIgnoreCase() returns true since the method ignores the capitalization of the characters.");
		System.out.println("\ts4.equalsIgnoreCase(s5):\t" + (s4.equalsIgnoreCase(s5)));
		
		
		
		

	}

}
