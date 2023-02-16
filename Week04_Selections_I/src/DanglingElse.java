public class DanglingElse {
	public static void main(String[] args) {
		int i = 1, j = 2, k = 3;

		/*If you omit the curly braces, then the else in this example will
		 * belong to the inner if, not the out if even though the indendation
		 * may suggest otherwise.
		 */
		if (i > j)
			if (i > k)
				System.out.println("A");
		else
			System.out.println("B");

	}


}