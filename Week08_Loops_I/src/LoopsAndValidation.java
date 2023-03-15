import java.util.Scanner;

public class LoopsAndValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a postive integer: ");
		int x = sc.nextInt();
				
		while(x < 0) {
			System.out.println("ERROR: Value cannot be negative!");
			System.out.print("Enter a postive integer: ");
			x = sc.nextInt();
		}
		
		System.out.println("value passed validation");
		
		

	}

}
