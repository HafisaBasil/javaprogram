package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int n, fact = 1;
  
		System.out.println("Print the number");

		n = obj.nextInt();

		while (n > 0) {
			fact = fact * n;
			n = n - 1;
		}
		System.out.println("Print the value " + fact);
	}

}
