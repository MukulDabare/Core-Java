package Operator_if_else;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount ");	
		int rs=sc.nextInt();
		if(rs>=500)
		{
			System.out.println(" Valid Entery ");
		}
		else {
			System.out.println(500-rs+"Rs, are short to make valid entery ");
		}
		
	}

}
