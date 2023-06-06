package programs;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " SAGAR NANA";

		str.length();
		System.out.println(str.length());

		StringBuilder obj = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			int index = str.indexOf(ch, i + 1);

			if (index == -1) {
				obj.append(ch);
			}

		}
		System.out.println("Print the number" + obj);
	}

}
