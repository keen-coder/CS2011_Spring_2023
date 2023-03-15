import java.util.Scanner;

public class ScannerHasNextMethods {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        System.out.print("Enter integers, enter x to stop: ");
//
//        int sum = 0;
//
//        while(in.hasNextInt()) {
//            sum += in.nextInt();
//        }
//
//        System.out.println(sum);

        System.out.print("Enter floating-point values, enter x to stop: ");

        double nextValue = 0;
        double sum = 0;

        while(in.hasNextDouble()) {
            nextValue = in.nextDouble();
            sum += nextValue;
        }

        System.out.println(sum);


    }
}
