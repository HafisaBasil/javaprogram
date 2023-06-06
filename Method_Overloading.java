package programs;

public class Method_Overloading {

	public static void add() {
		System.out.println("Blank");
	}

	public static void add(int x) {
		System.out.println(x);
	}

	public static void add(int x, int y) {
		int d = x + y;
		System.out.println(d);
	}

	public static void add(int x, float b) {
		float c = x + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading obj = new Method_Overloading();

		obj.add();
		obj.add(2);
		obj.add(23, 32);
		obj.add(12, 21f);

		

	}

}
