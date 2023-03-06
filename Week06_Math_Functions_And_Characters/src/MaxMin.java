import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two values: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();


		int min = Math.min(x, y);
		int max = Math.max(x, y);

		int maxThree = Math.max(Math.max(x, y), z);

		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}