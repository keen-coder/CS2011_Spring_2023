

public class CopyingArrays {

	public static void main(String[] args) {

		int[] list1 = {1, 2, 3, 4, 5, 6, 7};
		int[] list2 = new int[list1.length];
		
		System.arraycopy(list1, 2, list2, 2, 2);
		
		//list2 data = 0 0 0 0 0 0 0
		
		
		//list2 = list1;
		
//		for (int i = 0 ; i < list1.length ; i++) {
//			list2[i] = list1[i];
//		}
	
		printArray(list1);
		printArray(list2);

		list2[0] = 100;
		list2[1] = 327;

		System.out.println();
		System.out.print("List 1: ");
		printArray(list1);
		System.out.print("List 2: ");
		printArray(list2);

		System.out.println();
		System.out.println(list1);
		System.out.println(list2);









		//		
		//		int[] list2 = new int[list1.length];
		//		
		//		System.out.println("Before copy: ");
		//		System.out.print("list1 = ");
		//		printArray(list1);
		//		System.out.print("list2 = ");
		//		printArray(list2);
		//		
		//		System.out.println();
		//
		//		for (int i = 0 ; i < list1.length ; i++) {
		//			list2[i] = list1[i];
		//		}
		//		
		////		list2 = list1;
		//		System.out.println("After \"copy\": ");
		//		System.out.print("list1 = ");
		//		printArray(list1);
		//		System.out.print("list2 = ");
		//		printArray(list2);
		//		
		//		System.out.println();
		//		
		//		list1[3] = 100;
		//		System.out.println("After changing list 1: ");
		//		System.out.print("list1 = ");
		//		printArray(list1);
		//		System.out.print("list2 = ");
		//		printArray(list2);
	}

	public static void printArray(int[] arr) {
		//for-each loop
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
