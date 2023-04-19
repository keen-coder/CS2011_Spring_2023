public class ShuffleArray {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		printArray(array);
		shuffleArray(array);
		System.out.println();
		printArray(array);
	}

	public static void shuffleArray(int[] data) {

		for (int i = 0 ; i < data.length ; i++) {
			int j = (int)(Math.random() * data.length);

			int temp = data[i];
			data[i] = data[j];
			data[j] = temp;
		}



	}


	public static void printArray(int[] data) {
		for (int i = 0 ; i < data.length ; i++) {
			System.out.print(data[i] + " ");
		}
	}



}