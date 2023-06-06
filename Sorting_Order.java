package programs;

import java.util.Arrays;

public class Sorting_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,8,7,6,5,4,3,2,1,0};
		
		System.out.println("Before sorting order" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting order" + Arrays.toString(a));
	}
 
}
