/**
 * 
 * In Java, you can pass a mathematical expression to the print(ln) statement 
 * and if the expression is not in double quotes, the expression will be computed
 * and the result will be displayed to the console.
 * 
 * Notice how the expression in quotes is printed out literally as it is written,
 * and the expression not in quotes is calculated to its solution.
 * 
 * Next week we will see how to store expression like this in variables which 
 * is a much better way of handling them.
 * 
 * @author Keenan Knaur, California State University, Los Angeles
 *
 */
public class ComputingExpressionsWithPrintStatements {

	public static void main(String[] args) {
		System.out.print("(87 - 42 / 7) / (2 * (34 + 52.231)) = ");
		System.out.print((87 - 42 / 7) / (2 * (34 + 52.231)));

	}

}
