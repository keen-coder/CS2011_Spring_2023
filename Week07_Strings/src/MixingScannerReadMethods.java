/**
   This class shows what happens when you mix nextLine with any other method
   from Scanner.
*/
import java.util.Scanner;

public class MixingScannerReadMethods {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int x = in.nextInt();

      System.out.print("Enter a String: ");
      String s = in.nextLine(); //<--Here s will be empty no matter what you do.

      System.out.println("x is: " + x);
      System.out.println("s is: " + s);

      //Here is the same code but with the correct fix.

      System.out.print("Enter an integer: ");
      x = in.nextInt();

      in.skip(System.lineSeparator()); //Clears the new line character from the buffer.

      //NOTE 1: If this does not work, replace line 27 with in.nextLine(); (an extra
      //call to the nextLine() method of Scanner.)

      //NOTE 2: Remember that if you called your Scanner something else, then you
      //need to call nextLine() using the name of YOUR Scanner object.

      System.out.print("Enter a String: ");
      s = in.nextLine();

      System.out.println("x is: " + x);
      System.out.println("s is: " + s);
   }
}
