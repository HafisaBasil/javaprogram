package programs;

public class Reverse_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Software Testing";

		str.length();
		System.out.println(str.length());

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
