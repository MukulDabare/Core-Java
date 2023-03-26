package for_loop;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of which table you want ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			int s=(n*i);
			System.out.println(s);
		}
	}

}
