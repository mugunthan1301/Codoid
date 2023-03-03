package java;

import java.util.*;
public class Fibonaci
	{
	static Scanner s=new Scanner (System.in);
	static int n1=0,n2=1,n3=0,count=0;
	public static void main(String[]args)
		{ 
			System.out.println("ENTER THE NUMBER");
			int count=s.nextInt();
			System.out.println(n1+" " +n2+" ");
			fibonacci(n1,n2);
		}
		public static void fibonacci(int a,int b)
		{
			if (count>=1)
			{
				n3=n1+n2;
				System.out.println(n3+" ");
				n1=n2;
				n2=n3;
				count--;
				fibonacci(n1,n2);
			}
			else
				return;
		}
		
	}