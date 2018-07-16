package com.cg.paytmwallet.dao;

import com.cg.paytmwallet.bean.Account;
import com.cg.paytmwallet.exception.AccountException;

public interface AccountDao {
	String createAccount(Account account) throws AccountException;
	double showBalance(String mobileNo) throws AccountException;
	Account deposit(String mobileNo,double amount) throws AccountException;
	Account withdraw(String mobileNo,double amount) throws AccountException;
	Account fundTransfer(String mobileNo1,String mobileNo2,double amount) throws AccountException;
	Account printTransactions(String mobileNo) throws AccountException;
}
