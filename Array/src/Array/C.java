package Array;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		System.out.println("Enter the size of Array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String a[]=new String[size];
		System.out.println("Enter names of "+size+" Student ");
		
		for(int j=0; j<a.length; j++)
		{
			
				System.out.println("Enter Name ");
			    a[j]=sc.next();
		}
		for (int j=0;j<a.length; j++)
		{
			
			
				System.out.println(" Student Name is "+a[j]);
			
			
		}
	}

}
