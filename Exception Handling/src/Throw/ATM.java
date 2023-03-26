package Throw;

import java.util.Scanner;

public class ATM {

	public void m1(int amt) throws InvalidAmount {
		int rem = amt % 500;
		if (rem != 0)
			throw new InvalidAmount("Enter amount in multiple of 500");
		System.out.println("Your entered amount is Rs." + amt + ".\nCollect your Cash.");
	}

	public static void main(String[] args) {

		ATM a = new ATM();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw.(X500)");
		int atm=sc.nextInt();
		try {
			a.m1(atm);
		} catch (InvalidAmount e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
