package com.cjc.service;

import com.cjc.model.Account;


public interface RBI {
	
		
	
	public Account creatAccount() throws AgeInvalidException;
	public void displayAccountDetails(Account acc);
	public void checkAccountBalance(Account acc);
	public void depositeAmount(Account acc);
	public void withdrawAmount(Account acc) throws InvalidAmountException;
	

}
