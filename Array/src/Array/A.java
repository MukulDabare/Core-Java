package Array;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int x=sc.nextInt();
		int a[]=new int[x];
		System.out.println(a.length);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter the value ");
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Value at index "+i+ " is "+a[i]);
		}
		
	}

}
