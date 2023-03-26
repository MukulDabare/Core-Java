package com.bnkprjct.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.bankprjct.model.Account;
import com.bnkprjct.service.AccountNumberInvalidException;
import com.bnkprjct.service.AgeInvalidException;
import com.bnkprjct.service.InvalidAmountException;
import com.bnkprjct.service.PinInvalidException;
import com.bnkprjct.service.Rbi;

public class Mbi implements Rbi
{

	@Override
	public void creatAccount(Account[] accNo) throws AgeInvalidException {
	     List<Account> Acc=new ArrayList<Account>();
	     
	     
		
	}

	@Override
	public void displayAccountDetails(Account[] acc1, int Accno, int apin)
			throws PinInvalidException, AccountNumberInvalidException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkAccountBalance(Account[] acc1, int Accno, int bpin) throws PinInvalidException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositeAmount(Account[] acc1, int Accno, int cpin) throws PinInvalidException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawAmount(Account[] acc1, int Accno, int dpin) throws PinInvalidException, InvalidAmountException {
		// TODO Auto-generated method stub
		
	}

}
