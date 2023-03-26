package com.bnkprjct.serviceImpl;

import java.util.Random;
import java.util.Scanner;
import com.bankprjct.model.Account;
import com.bnkprjct.service.AccountNumberInvalidException;
import com.bnkprjct.service.AgeInvalidException;
import com.bnkprjct.service.InvalidAmountException;
import com.bnkprjct.service.PinInvalidException;
import com.bnkprjct.service.Rbi;

public class Cbi implements Rbi {

	Scanner sc = new Scanner(System.in);

	@Override
	public void creatAccount(Account[] accNo) throws AgeInvalidException {
		Random ran = new Random();
		int accno = ran.nextInt(100);
		int i = accno;
		do {
			Account acc = new Account();
			acc.setAccountNumber(accno);
			System.out.println("Enter your name");
			acc.setAccountHolderName(sc.next());
			System.out.println("Enter your Mobile Number");
			acc.setMobileNumber(sc.nextLong());
			System.out.println("Enter your Adhar Number");
			acc.setAdharNumber(sc.nextLong());
			System.out.println("Enter your Gender");
			acc.setGender(sc.next());
			System.out.println("Enter your age");
			acc.setAge(sc.nextInt());
			System.out.println("Enter city name/branch name to create Account");
			acc.setCityName(sc.next());
			System.out.println("Your Zero Balance Account is created Successfully. ");
			System.out.println("Enter your choice of PIN and Remember for future transactions");
			acc.setPin(sc.nextInt());
			System.out.println("Your Account Number is " + acc.getAccountNumber()
					+ ". Remember your Account Number and PIN for further details");
			acc.setAccountBalance(0);
			accNo[i] = acc;
			i++;
		} while (false);

		// return accNo;

	}

	@Override
	public void displayAccountDetails(Account[] acc, int Accno, int pin)
			throws PinInvalidException, AccountNumberInvalidException {

		if (acc[Accno].getAccountNumber() == Accno) {
			{
				if (acc[Accno].getPin() == pin) {
					System.out.println("Account Details");
					System.out.println("AccountHolder Name:- " + acc[Accno].getAccountHolderName());
					System.out.println("Account Number:- " + acc[Accno].getAccountNumber());
					System.out.println("AccountHolder Adhar Number:- " + acc[Accno].getAdharNumber());
					System.out.println("Bank city/branch Name:- " + acc[Accno].getCityName());
					System.out.println("AccountHolder Gender:- " + acc[Accno].getGender());
					System.out.println("AccountHolder Mobile Number:- " + acc[Accno].getMobileNumber());
					System.out.println("AccountHolder Age:- " + acc[Accno].getAge());
					System.out.println("Account Balance:- " + acc[Accno].getAccountBalance());
				} else {
					throw new PinInvalidException("Invalid PIN");
				}
			}
		} else {
			throw new AccountNumberInvalidException("Invalid Account Number");
		}

	}

	@Override
	public void checkAccountBalance(Account[] acc, int Accn, int pin) throws PinInvalidException {
		if (acc[Accn].getPin() == pin) {
			System.out.println("Account Balance:- Rs. " + acc[Accn].getAccountBalance());
		} else {
			throw new PinInvalidException("Invalid PIN");
		}

	}

	@Override
	public void depositeAmount(Account[] acc, int Accn, int pin) throws PinInvalidException {

		if (acc[Accn].getPin() == pin) {
			System.out.println("Enter amount to Deposite in Amount");
			acc[Accn].setAccountBalance(acc[Accn].getAccountBalance() + sc.nextDouble());
			System.out.println("Clear Account Balance Rs." + acc[Accn].getAccountBalance());
		} else {
			throw new PinInvalidException("Invalid PIN");
		}
	}

	@Override
	public void withdrawAmount(Account[] acc, int Accn, int pin) throws InvalidAmountException, PinInvalidException {
		if (acc[Accn].getPin() == pin) {
			System.out.println("Clear Account Balance Rs." + acc[Accn].getAccountBalance());
			System.out.println(
					"Enter amount to Withdraw from your Amount upto Rs." + (acc[Accn].getAccountBalance() - 500));
			double temp = sc.nextDouble();
			if (temp > acc[Accn].getAccountBalance() - 500) {
				throw new InvalidAmountException("Insufficient Balance");
			}
			acc[Accn].setAccountBalance(acc[Accn].getAccountBalance() - temp);
			System.out.println("Clear Amount Balance  Rs. " + acc[Accn].getAccountBalance());
		} else {
			throw new PinInvalidException("Invalid PIN");
		}

	}

}
