package programs;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the first Number");

		int p = obj.nextInt();
		System.out.println("Enter second Number");
		
		int q=obj.nextInt();
		int r=p+q;
		System.out.println(" sum = " + r);
	}

}
