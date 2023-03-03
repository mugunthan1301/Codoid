package java;

public class SwapingWithoutTemp {

	static int a = 10;
	static int b = 5;
	public static void main(String[] args) {
		a = a + b; //15
		b = a - b; //5
		a = a-b;//10

		System.out.println(a);
		System.out.println(b);
	}

}