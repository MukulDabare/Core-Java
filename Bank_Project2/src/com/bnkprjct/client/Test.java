package com.bnkprjct.client;

import java.util.Scanner;

import com.bankprjct.model.Account;
import com.bnkprjct.service.AccountNumberInvalidException;
import com.bnkprjct.service.AgeInvalidException;
import com.bnkprjct.service.InvalidAmountException;
import com.bnkprjct.service.PinInvalidException;
import com.bnkprjct.service.Rbi;
import com.bnkprjct.serviceImpl.Cbi;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rbi rbi = new Cbi();
//		System.out.println("Welcome to the CBI \nEnter no.of Accounts Capacity you can handel "
//				+ "(For Bank use only)");
		Account[] acc = new Account[101];

		while (true) {

			System.out.println(
					"Enter choice:-\n1.Create new Account\n2.Check Account Details\n3.Check Account Balance\n4.Deposite Amount\n5.Withdraw Amount\n6.Exit");
			int choice = sc.nextInt();

			try {
				switch (choice) {
				case 1:

					rbi.creatAccount(acc);
					break;
				case 2:
					System.out.println("Enter your Account Number");
					int a = sc.nextInt();
					int apin;
					System.out.println("Enter your PIN");
					apin = sc.nextInt();
					try {
						if ((acc[a].getAccountNumber() == a)) {
							rbi.displayAccountDetails(acc, a, apin);
						}
					} catch (NullPointerException e) {
						throw new AccountNumberInvalidException("Invalid Account Nummber");
					}

					break;
				case 3:
					System.out.println("Enter your Account Number");
					int b = sc.nextInt();
					System.out.println("Enter your PIN");
					int bpin = sc.nextInt();
					try {
						if ((acc[b].getAccountNumber() == b)) {
							rbi.checkAccountBalance(acc, b, bpin);
						}
					} catch (NullPointerException e) {
						throw new AccountNumberInvalidException("Invalid Account Nummber");
					}

					break;
				case 4:
					System.out.println("Enter your Account Number");
					int c = sc.nextInt();
					System.out.println("Enter your PIN");
					int cpin = sc.nextInt();
					try {
						if ((acc[c].getAccountNumber() == c)) {
							rbi.depositeAmount(acc, c, cpin);
						}
					} catch (NullPointerException e) {
						throw new AccountNumberInvalidException("Invalid Account Nummber");
					}
					
					break;
				case 5:
					System.out.println("Enter your Account Number");
					int d = sc.nextInt();
					System.out.println("Enter your PIN");
					int dpin = sc.nextInt();
					try {
						if ((acc[d].getAccountNumber() == d)) {
							rbi.withdrawAmount(acc, d, dpin);
						}
					} catch (NullPointerException e) {
						throw new AccountNumberInvalidException("Invalid Account Nummber");
					}
					
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");

				}
			} catch (AgeInvalidException e) {
				System.out.println(e.getMessage());
			} catch (InvalidAmountException e1) {
				System.out.println(e1.getMessage());
			} catch (PinInvalidException e2) {
				System.out.println(e2.getMessage());
			} catch (AccountNumberInvalidException e3) {
				System.out.println(e3.getMessage());
			}
			catch(Exception e4)
			{
				System.out.println("Invalid Entry");
			}

		}

	}

}
