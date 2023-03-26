package com.cjc.client;

import java.util.Scanner;

import com.cjc.model.Account;
import com.cjc.service.AgeInvalidException;
import com.cjc.service.InvalidAmountException;
import com.cjc.service.RBI;
import com.cjc.serviceImplementation.SBI;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		RBI rbi = new SBI();
		Account acc = null;
		while (true) {
			System.out.println(
					"Enter choice:-\n1.Create new Account\n2.Check Account Details\n3.Check Account Balance\n4.Deposite Amount\n5.Withdraw Amount\n 6.Exit");
			int choice = sc.nextInt();

			try {
				switch (choice) {
				case 1:
					acc = rbi.creatAccount();
					break;
				case 2:
					rbi.displayAccountDetails(acc);
					break;
				case 3:
					rbi.checkAccountBalance(acc);
					break;
				case 4:
					rbi.depositeAmount(acc);
					break;
				case 5:
					rbi.withdrawAmount(acc);
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");

				}
			} catch (AgeInvalidException e) {
				System.out.println(e.getMessage());
			}catch(InvalidAmountException e1)
			{
			    System.out.println(e1.getMessage());
			}

		}

	}

}
