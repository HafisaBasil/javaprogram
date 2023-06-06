package programs;

public class Fibonacci_Series_For_loop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxNumber = 10;
		int priouvsNumber = 0;
		int nextNumber = 1;
		System.out.println("Print the number " + maxNumber + " Number :");

		for (int i = 1; i <= maxNumber; i++) {
			System.out.println(priouvsNumber);	
		
		int sum = priouvsNumber + nextNumber;
		priouvsNumber = nextNumber;
		nextNumber = sum;
		

	}
		 }

}
