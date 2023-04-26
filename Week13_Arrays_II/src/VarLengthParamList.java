

public class VarLengthParamList {

	public static void main(String[] args) {
		sum(100, 248);
		sum(2, 6, 10);
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
	}

	public static int sum(int ... values) {
		int sum = 0 ;
		
		for (int i = 0 ; i < values.length ; i++) {
			sum += values[i];
		}
		
		
		return sum;
	}
	
	
	
	
	
}