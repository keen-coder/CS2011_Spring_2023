public class OverloadedMethods {
	public static void main(String[] args) {
		max(1, 3.4);
		max(4.5, 10);

		max(3, 7);
	}

	public static double max(int a, double b) {
		return (a > b) ? a : b;
	}

	public static double max(double a, int b) {
		return (a > b) ? a : b;
	}

	 public static int max(int a, int b) {
	 	return (a > b) ? a : b;
	 }

	 public static double max(double a, double b) {
	 	return (a > b) ? a : b;
	 }
	
	 public static int max(int a, int b, int c) {
	 	return max(max(a, b), c);
	 }

}


















	// public static int max(int x, int y) {
	// 	if (x > y) {
	// 		return x;
	// 	}
	// 	else {
	// 		return y;
	// 	}
	// }

	// public static int max(int x, int y, int z) {
	// 	return max(max(x, y), z);
	// }

	// public static double max(double x, double y) {
	// 	if (x > y) {
	// 		return x;
	// 	}
	// 	else {
	// 		return y;
	// 	}
	// }

	// public static char max(char x, char y) {
	// 	if (x > y) {
	// 		return x;
	// 	}
	// 	else {
	// 		return y;
	// 	}
	// }