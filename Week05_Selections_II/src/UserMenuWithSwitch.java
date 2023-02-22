

import java.util.Scanner;

public class UserMenuWithSwitch {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      //You can create the text of the menu and store it in a variable.
      //NOTE: the "\n" is an escape character which inserts a new line
      //  at the end of the string.
      final String USER_MENU = 
         "1. Add two numbers\n" + 
         "2. Area of Rectangle\n" +
         "3. Remainder of two numbers\n" +
         "4. Exit Program\n" +
         "Enter (1-4) for choice: ";

      //Define constants for the menu choices
      final int ADD_CHOICE = 1;
      final int AREA_CHOICE = 2;
      final int REMAINDER_CHOICE = 3;
      final int EXIT_CHOICE = 4;   

      System.out.print(USER_MENU);
      int choice = in.nextInt();

      switch(choice) {
         case ADD_CHOICE:
            System.out.print("Enter two numbers: ");
            int x = in.nextInt();
            int y = in.nextInt();

            //Validate that x and y are not negative.
            if ( (x < 0) || (y < 0) ) {
               System.out.println("ERROR: x or y cannot be negative.");
               System.out.println("Program will now exit!");
               System.exit(1);
            }

            int sum = x + y;

            System.out.println("The sum of " + x + ", " + y + " is " + sum);
            break;
         case AREA_CHOICE: 
            //code for option 2
            break;
         case REMAINDER_CHOICE:
            //code for option 3
            break;
         case EXIT_CHOICE:
            System.out.println("Program will now exit!");
            System.exit(0);
         default: 
            System.out.println("ERROR: Menu choice not correct.");
            System.out.println("Program will now exit!");
            System.exit(1);
      }



   }
}