package java;
public class Reverse {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		for (int index = a.length-1; index>=0; index--) {

			System.out.println("a["+index+"]---> "+a[index]);
		}
	}

}
