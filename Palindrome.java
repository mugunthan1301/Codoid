package java;
import java.util.Scanner;
public class Palindrome {
	static Scanner s=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = s.nextInt();  //141
		int copy = num;         //141
		int rev = 0 ;
		while (num>0) {
			rev = rev*10+(num%10);
			num = num /10;
			}
		if (rev == copy) {
			System.out.println("The number is Palindrome");
			
		}
		else {
			System.out.println("The number is not a Palindrome");
		}

	}

}
