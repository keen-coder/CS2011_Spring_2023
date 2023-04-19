public class ForEachLoops {
	public static void main(String[] args) {
		byte[] data = {5, 8, 3, 5, 7, 9, 2};

		for (int i = 0 ; i < data.length ; i++) {
			System.out.print(data[i] + " ");
		}

		System.out.println();

		for (byte value : data) {
			System.out.print(value + " ");
		}

		System.out.println();

		double[] moreData = {3.4, 5.6, 12.58, 3.2145, 87.32456};

		for (double x : moreData) {
			System.out.print(x + " ");
		}


	}
}