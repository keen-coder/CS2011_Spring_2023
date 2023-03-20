

public class NestedLoops {

	public static void main(String[] args) {

		//Example 1 shows the iteration progression of a pair of nested loops

		System.out.println("Example 1: ");
		for (int a = 1 ; a <= 3 ; a++) {
			System.out.println("a = " + a);
			for (int b = 1 ; b <= 3 ; b++) {
				System.out.println("  b = " + b);
			}
		}
		System.out.println();
		System.out.println();

		//Example 2 shows the iteration progression of 3 nested loops.
		System.out.println("Example 2: ");
		for (int a = 1 ; a <= 3 ; a++) {
			System.out.println("a = " + a);
			for (int b = 1 ; b <= 3 ; b++) {
				System.out.println("  b = " + b);
				for (int c = 1 ; c <= 3 ; c++) {
					System.out.println("    c = " + c);
				}
			}
		}

		System.out.println();
		System.out.println();

		//Example 3 shows the iteration progression of nested loops, but
		//  where two of the loops are nested at the same level.
		System.out.println("Example 3: ");
		for (int a = 1 ; a <= 3 ; a++) {
			System.out.println("a = " + a);

			for (int b = 1 ; b <= 3 ; b++) {
				System.out.println("  b = " + b);
			}

			for (int c = 1 ; c <= 3 ; c++) {
				System.out.println("  c = " + c);
			}
		}

	}

}
