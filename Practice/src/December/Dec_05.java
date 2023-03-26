package December;

import java.util.Scanner;

public class Dec_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int x=sc.nextInt();
		int a[]=new int[x];
		
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println("Enter the "+i+ " value");
			a[i]=sc.nextInt();
			
		}
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println("Value at index "+i+" is "+a[i]);
		}
	}
	

}
