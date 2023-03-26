package com.cjc.serviceImplementation;

import java.util.Scanner;

import com.cjc.model.Account;
import com.cjc.service.RBI;
import com.cjc.service.AgeInvalidException;
import com.cjc.service.InvalidAmountException;

public class SBI extends Account implements RBI {
	

   Scanner sc =new Scanner(System.in);
	@Override
	public Account creatAccount() throws AgeInvalidException {
		System.out.println("Creating New Account");
		Account acc1=new Account();
		acc1.setAccountNumber(1);
		System.out.println("Enter your name");
		acc1.setAccountHolderName(sc.next());
		System.out.println("Enter your Mobile Number");
		acc1.setMobileNumber(sc.nextLong());
		System.out.println("Enter your Adhar Number");
		acc1.setAdharNumber(sc.nextLong());
		System.out.println("Enter your Gender");
		acc1.setGender(sc.next());
		System.out.println("Enter your age");
		acc1.setAge(sc.nextInt());
		 if(acc1.getAge()<17)
			 throw new AgeInvalidException("Invalid age for creating account in bank");
		 
		System.out.println("Enter city name/branch name to create Account");
		acc1.setCityName(sc.next());
		System.out.println("Your Zero Balance Account is created.");
		acc1.setAccountBalance(0);
		return acc1;
		
	}

	@Override
	public void displayAccountDetails(Account acc1) {
		
		System.out.println("Account Details");
		System.out.println("AccountHolder Name:- "+acc1.getAccountHolderName());
		System.out.println("Account Number:- "+acc1.getAccountNumber());
		System.out.println("AccountHolder Adhar Number:- "+acc1.getAdharNumber());
		System.out.println("Bank city/branch Name:- "+acc1.getCityName());
		System.out.println("AccountHolder Gender:- "+acc1.getGender());
		System.out.println("AccountHolder Mobile Number:- "+acc1.getMobileNumber());
		System.out.println("AccountHolder Age:- "+acc1.getAge());
		System.out.println("Account Balance:- "+acc1.getAccountBalance());
		
	}

	@Override
	public void checkAccountBalance(Account acc1) {
		System.out.println("Account Balance:- Rs. "+acc1.getAccountBalance());
		
	}

	@Override
	public void depositeAmount(Account acc1) {
		System.out.println("Enter amount to Deposite in Amount");
		acc1.setAccountBalance(acc1.getAccountBalance()+sc.nextDouble());
		System.out.println("Clear Account Balance = Rs."+ acc1.getAccountBalance());
		
		
	}

	@Override
	public void withdrawAmount(Account acc1) throws InvalidAmountException {
		
		System.out.println("Clear Account Balance Rs."+ acc1.getAccountBalance());
		System.out.println("Enter amount to Withdraw from your Amount upto Rs."+(acc1.getAccountBalance()-500));
		double temp=sc.nextDouble();
		if(temp>acc1.getAccountBalance()-500)
		{
			throw new InvalidAmountException("Insufficient Balance");
		}
			
		acc1.setAccountBalance(acc1.getAccountBalance()-temp);
		System.out.println("Clear Amount Balance = Rs. "+ acc1.getAccountBalance());
		
	}

}
