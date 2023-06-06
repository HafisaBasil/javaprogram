package programs;

public class Reverse_num {

	int a = 1234567890;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse_num obj = new Reverse_num();
		int rev;

		while (obj.a > 0) {
			rev = obj.a % 10;
			System.out.print(rev);
			obj.a = obj.a / 10;
		}

	}

}
