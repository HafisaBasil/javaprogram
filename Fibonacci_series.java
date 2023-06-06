package programs;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 0;
		int k2 = 1;
		int k3 = 2;

		for (int i = 0; i <= 5; i++) {
			System.out.println("Print the value" + k);

			k = k2;
			k2 = k3;
			k3 = k + k3;

		}

	}
}
