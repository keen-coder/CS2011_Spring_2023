public class ArraySum {
	
	public static void main(String[] args) {
		//Using the initRandomArray method from the ProcessingArrays class.
		int[] randomData = ProcessingArrays.initRandomArray(50, 10, 30);

		int sum = 0;

		for (int i = 0 ; i < randomData.length ; i++) {
			sum += randomData[i];
		}

		//Example of for-each loop
		//print the array
	 // for (int i = 0 ; i < randomData.length ; i++)
		for (int nextValue : randomData) {
			System.out.print(nextValue + " ");
		} 
		System.out.println();
		System.out.println("sum = " + sum);

	}



}