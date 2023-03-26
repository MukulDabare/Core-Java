package for_loop;

import java.util.Scanner;

public class For_loop {
	public static void main(String[] args) {
		
		System.out.println("Enter number to initialize");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter value to end ");
		int y=sc.nextInt();
		
		for(int i=x; i<=y; i++)
		{
			System.out.println(i);
		}
		System.out.println("End");
	}

}
