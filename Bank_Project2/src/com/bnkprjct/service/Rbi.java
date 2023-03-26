package com.bnkprjct.service;

import com.bankprjct.model.Account;

public interface Rbi {
	
	public void creatAccount(Account[] accNo) throws AgeInvalidException;
	public void displayAccountDetails(Account[] acc1, int Accno, int apin) throws PinInvalidException, AccountNumberInvalidException;
	public void checkAccountBalance(Account[] acc1, int Accno, int bpin) throws PinInvalidException;
	public void depositeAmount(Account[] acc1, int Accno, int cpin)throws PinInvalidException;
	public void withdrawAmount(Account[] acc1, int Accno, int dpin) throws PinInvalidException, InvalidAmountException;
	
	
	

}
