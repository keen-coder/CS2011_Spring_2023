public class CharOperands {
	public static void main(String[] args) {
		int i = '2' + '3'; //(int)'2' is unicode 50 and (int)'3' is unicode 51
		System.out.println("i is " + i); //i is unicode 101
		
		int j = 2 + 'a'; //(int)'a' is 97
		System.out.println("j is " + j); // j is unicode 99
		
		System.out.println(j + " is the Unicode for character " + (char)j);
		
		char a = 'a';
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
	}
}