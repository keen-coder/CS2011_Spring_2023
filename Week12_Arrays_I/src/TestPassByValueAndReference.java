public class TestPassByValueAndReference {
  public static void main(String[] args) {
    int x = 1; // x represents an int value
    int[] y = new int[5]; // y represents an array of int values

    System.out.println("x before method invocation is " + x);
    //System.out.println("y[0] before method invocation is " + y[0]);
    printArray(y);
    System.out.println();
    m(x, y); // Invoke m with arguments x and y

    System.out.println("x after method invocation is " + x);
    //System.out.println("y[0] after method invocation is " + y[0]);
    printArray(y);
  }

  public static void m(int number, int[] numbers) {
    number = 1001; // Assign a new value to number
    numbers[0] = 5555; // Assign a new value to numbers[0]
    System.out.println("inside method: ");
    System.out.println("\t number: " + number);
    System.out.println("\t numbers[0]: " + numbers[0]);
    
  }
  
  public static void printArray(int[] myList) {
		for (int a: myList){
			System.out.print(a + " ");
		}
	}
}
