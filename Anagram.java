package programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "BRUSH";
		String y = "SHRUB";

		char a[] = x.toCharArray();
		char b[] = y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean result = Arrays.equals(a, b);

		if (result== true) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram ");
		}

	}

}
