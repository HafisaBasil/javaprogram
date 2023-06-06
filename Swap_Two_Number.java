package programs;

public class Swap_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 9;
		int y = 10;
		System.out.println("Before swap ");
		System.out.println(x);
		System.out.println(y);
		

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swap ");
		System.out.println(x);
		System.out.println(y);
	}

}
