package programs;

import java.util.Arrays;
import java.util.Collections;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 99, 0 };

		int max = Collections.max(Arrays.asList(a));
		System.out.println(max);

		int min = Collections.min(Arrays.asList(a));
		System.out.println(min);

	}

}
