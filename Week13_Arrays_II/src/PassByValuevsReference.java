

public class PassByValuevsReference {

    public static void main(String[] args) {

        int a = 3;

        System.out.println("a before: " + a);
        changeInteger(a);
        System.out.println("a after: " + a);

        System.out.println();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("arr before: ");
        printArray(arr);
        System.out.println();
        changeArray(arr);
        System.out.print("arr after: ");
        printArray(arr);

    }

    public static void changeInteger(int x) {
        x = 100;
    }

    public static void changeArray(int[] myList) {
        myList[2] = 100;
        myList[5] = 700;
    }

    public static void printArray(int[] arr) {

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
