import java.util.Random;
import java.util.Scanner;

public class Examples {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //2D Array Initializer List
        int[][] table1 = { {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9} };

        //Initializer list on one line.
        //int[][] table1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        //2D with no initial values
        double[][] table2 = new double[4][6];

        //Initialize 2D array with random values;
        int[][] table3 = initRandomInts(3, 5);
        printTable(table3);

        System.out.println();

        sumPerRow(table3);
        System.out.println();
        sumPerCol(table3);

        //Initialize 2D array with user input;
//        System.out.print("Enter the number of rows and cols: ");
//        int rows = in.nextInt();
//        int cols = in.nextInt();
//
//        System.out.println("Enter the values for the table: ");
//        int[][] table4 = initUserInput(rows, cols);
//        printTable(table4);
    }
    public static void sumPerCol(int[][] table) {
        for (int col = 0 ; col < table[0].length ; col++) {
            int sum = 0;
            System.out.print("Sum for col " + col + ": ");
            for (int row = 0 ; row < table.length ; row++) {
                sum += table[row][col];
            }
            System.out.println(sum);
        }
    }

    public static void sumPerRow(int[][] table) {

        for (int row = 0 ; row < table.length ; row++) {
            int sum = 0;
            System.out.print("Sum for row " + row + ": ");
            for (int col = 0 ; col < table[row].length ; col++) {
                sum += table[row][col];
            }
            System.out.println(sum);
        }
    }

    public static int[][] initRandomInts(int numRows, int numCols) {
        int[][] table = new int[numRows][numCols];

        Random r = new Random();

        for (int row = 0 ; row < table.length ; row++) {
            for (int col = 0 ; col < table[row].length ; col++) {
               table[row][col] = r.nextInt(10);
            }
        }

        return table;
    }

    public static int[][] initUserInput(int numRows, int numCols) {
        int[][] table = new int[numRows][numCols];

        for (int row = 0 ; row < table.length ; row++) {
            for (int col = 0 ; col < table[row].length ; col++) {
                table[row][col] = in.nextInt();
            }
        }

        return table;
    }

    public static void printTable(int[][] table) {
        for (int row = 0 ; row < table.length ; row++) {
            for (int col = 0 ; col < table[row].length ; col++) {
                System.out.printf("%-4d" , table[row][col]);
            }
            System.out.println();
        }
    }




}
