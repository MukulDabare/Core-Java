package December;

import java.util.Scanner;

public class Dec_03_02 {
	public static void main(String[] args) {
	
	for (int a=1; a<=5; a++)
	{
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m= 1+n;
		int count=0;
		
		for (int i=1; i<=m; i++ )
		{
			if(n%i==0)
			{
				count ++;
			}
		}
		if(count ==2)
		{
			System.out.println(" Number entered is Prime.");
		}
		else
		{
			System.out.println(" Number is Non-Prime ");
		}
		
	 }
	}
}
