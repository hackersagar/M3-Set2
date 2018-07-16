package com.cg.paytmwallet.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

import com.cg.paytmwallet.bean.Account;
import com.cg.paytmwallet.dao.AccountDao;
import com.cg.paytmwallet.db.AccountDb;
import com.cg.paytmwallet.exception.AccountException;


public class AccountDaoImp implements AccountDao {
	static HashMap<String,Account> accMap=AccountDb.getAccountDb();
	@Override
	public String createAccount(Account account) throws AccountException {
		if(accMap.containsKey(account.getMobileNo()))
		{
			throw new AccountException
			("Account with the mobileNo "+account.getMobileNo()+" already exists");
			
		}
		accMap.put(account.getMobileNo(), account);
		account.setLocalDateTime(LocalDateTime.now());
			return account.getMobileNo();
	
	}
    @Override
	public double showBalance(String mobileNo) throws AccountException {
    	Account acc=accMap.get(mobileNo);
		if(acc==null){
			throw new AccountException
			("Account with mobileno "+mobileNo+" does not exist");
		}
		return acc.getBalance();
	}

	@Override
	public Account deposit(String mobileNo, double amount)
			throws AccountException {
		Account acc=accMap.get(mobileNo);
		double balance=0;
		if(acc==null){
			throw new AccountException
			("Account with mobileno "+mobileNo+" does not exist");
		}
		else
		{
		balance=amount+acc.getBalance();
		acc.setBalance(balance);
		acc.setLocalDateTime(LocalDateTime.now());
		return acc;
		}
	}

	@Override
	public Account withdraw(String mobileNo, double amount)
			throws AccountException {
		Account acc=accMap.get(mobileNo);
		double balance=0;
		if(acc==null){
			throw new AccountException
			("Account with mobileno "+mobileNo+" does not exist");
		}
		else
		{
			if(amount<acc.getBalance())
			{
		balance=acc.getBalance()-amount;
		acc.setBalance(balance);
		
			}
			else
			{
				throw new AccountException("Enter Amount it should be less than available amount");
				 
			}}
		acc.setLocalDateTime(LocalDateTime.now());
		return acc;
	
	}

	@Override
	public Account fundTransfer(String mobileNo1, String mobileNo2, double amount)
			throws AccountException {
		
		Account acc=accMap.get(mobileNo1);
		Account acc1=accMap.get(mobileNo2);
		double balance=0;
		if(acc==null){
			throw new AccountException
			("Account with mobileno "+mobileNo1+" does not exist");
		}
		else if(acc1==null)
		{
			throw new AccountException
			("Account with mobileno "+mobileNo2+" does not exist");
		}
		else
		{
			if(amount<acc.getBalance())
			{
		balance=acc.getBalance()-amount;
		acc.setBalance(balance);
		acc.setLocalDateTime(LocalDateTime.now());
			}
			else
			{
				throw new AccountException
				("Enter Amount it should be less than available amount");
			}
		}
		return acc;
			}
	@Override
	public Account printTransactions(String mobileNo) throws AccountException {
		Account acc=accMap.get(mobileNo);
		if(acc==null){
			throw new AccountException
			("Account with mobileno "+mobileNo+" does not exist");
		}
		return acc;
	}

}
