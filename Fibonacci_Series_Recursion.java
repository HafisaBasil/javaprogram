package programs;

public class Fibonacci_Series_Recursion {

	static int a=0,b=1,c;
	public static void main(String args[]) {
		
		System.out.println(a);
		System.out.println(b);
		Fibonacci_Series_Recursion obj=new Fibonacci_Series_Recursion();
		obj.printfib(10);
	}
	void printfib(int i) {
		if(i>=1) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			printfib(i-1);
		}
		
		
		
	}
		
	}


/*
 * A recursive function is a technique of making a function call itself. This technique 
 * provides a way to break complicated problems down into simple problems which are easier to solve.
 * 
 * fibonacciRecursion():
 * 
 * The Java Fibonacci recursion function takes an input number. Checks for 0, 1,
 * 2 and returns 0, 1, 1 accordingly because Fibonacci sequence in Java starts
 * with 0, 1, 1. When input n is >=3, The function will call itself recursively.
 * The call is done two times. Let�s see the Fibonacci Series in Java using
 * recursion example for input of 4.
 */
