public class FindingLargestValue {
	public static void main(String[] args) {
		int[] randomData = ProcessingArrays.initRandomArray(20);


		int max = randomData[0];
		//processing the array backwards
		for (int i = randomData.length - 1 ; i >= 0 ; i--) {

			if (randomData[i] > max) {
				max = randomData[i];
			}
		}

		for (int nextValue : randomData) {
			System.out.print(nextValue + " ");
		}
		System.out.println();
		System.out.println("max = " + max);

	}
}