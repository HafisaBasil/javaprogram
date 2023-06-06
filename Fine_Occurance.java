package programs;

public class Fine_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Sagar ";

		int total = str.length();
		System.out.println(total);

		int remove = str.replaceAll("a", "").length();
		System.out.println(remove);

		int value = total - remove;
		System.out.println(value);

	}

}
