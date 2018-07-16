package com.cg.paytmwallet.service;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.cg.paytmwallet.bean.Account;
import com.cg.paytmwallet.exception.AccountException;

public class AccountServiceImpTest {

	AccountService accService=new AccountServiceImp();
	
	@Test
	public void testCreateAccountMobileNum()  {
		Account acc=new Account("98765432","summi","summi@gmail.com",500.0);
		
		try {
			accService.createAccount(acc);
		
		} catch (AccountException e) {
			
			assertEquals("Mobile Number should contain 10 digits",e.getMessage());
		}
		
	}
	@Test
	public void testCreateAccountName() {
		Account acc=new Account("9876543210","s1","summi@gmail.com",500.0);
		try {
			accService.createAccount(acc);
		} catch (AccountException e) {
			assertEquals("Name should contain only alphabets",e.getMessage());
		}
	}
	@Test
	public void testCreateAccountMailId() {
		Account acc=new Account("9876543222","summi","summi@gmail",500.0);
		try {
			accService.createAccount(acc);
		} catch (AccountException e) {
			assertEquals("Invalid mailId",e.getMessage());
		}
	}
	@Test
	public void testCreateAccountAmount() {
		Account acc=new Account("9876543222","summi","summi@gmail.com",-1.0);
		try {
			accService.createAccount(acc);
		} catch (AccountException e) {
			assertEquals("Enter Valid Amount should be greater than zero",e.getMessage());
		}
	}
	@Test
	public void testcreateAccountdoesNotExist() {
		Account acc=new Account("9876543210","esha","vineesha@gmail.com",450.0);
		try {
		 accService.createAccount(acc);
			} catch (AccountException e) {
			assertEquals("Account with the mobileNo 9876543210 already exists",e.getMessage());
		}
		
	}
	@Test
	public void testCreateAccount() {
		Account acc=new Account("9876543222","summi","summi@gmail.com",500.0);
		try {
			String mobileNo = accService.createAccount(acc);
			assertNotNull(mobileNo);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Test
	public void testShowBalanceMobileNum()  {
		try {
			accService.showBalance("98765432");
		} catch (AccountException e) {
			assertEquals("Mobile Number should contain 10 digits",e.getMessage());
		}
	}
	@Test
	public void testShowBalanceMobileNumNotExist()  {
		try {
			accService.showBalance("1234567890");
		} catch (AccountException e) {
			assertEquals("Account with mobileno 1234567890 does not exist",e.getMessage());
		}
	}
	@Test
	public void testShowBalance()  {
		Account acc=new Account();
	try {
			double amount=accService.showBalance("1234567890");
			assertEquals(250.0, amount,0.00);
		} catch (AccountException e) {
			assertEquals("Account with mobileno 1234567890 does not exist",e.getMessage());
			}
	
	}
	@Test
	public void testDepositMobileNum()  {
		try {
			accService.deposit("98765432",50.0);
		} catch (AccountException e) {
			assertEquals("Mobile Number should contain 10 digits",e.getMessage());
		}
	}
	@Test
	public void testDepositAmount() {
		try {
			accService.deposit("9876543210",-1.0);
		} catch (AccountException e) {
			assertEquals("Enter Valid Amount should be greater than zero",e.getMessage());
		}
	}
	@Test
	public void testDepositMobileNumDoesNotExist()  {
		try {
			accService.deposit("9876543567",50);
		} catch (AccountException e) {
			assertEquals("Account with mobileno 9876543567 does not exist",e.getMessage());
		}
	}
	@Test
	public void testDeposit() {
		Account acc=new Account();
		acc.setMobileNo("9876543210");
		try {
			Account ac= accService.deposit(acc.getMobileNo(),50);
			assertNotNull(ac);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void testWithdrawMobileNum()  {
		try {
			accService.withdraw("98765432",50.0);
		} catch (AccountException e) {
			assertEquals("Mobile Number should contain 10 digits",e.getMessage());
		}
	}
	@Test
	public void testWithdrawAmount()  {
		try {
			accService.withdraw("9876543210",-1.0);
		} catch (AccountException e) {
			assertEquals("Enter Valid Amount should be greater than zero",e.getMessage());
		}
	}
	@Test
	public void testWithdrawMobileNumDoesNotExist()  {
		try {
			accService.deposit("9876543567",50);
		} catch (AccountException e) {
			assertEquals("Account with mobileno 9876543567 does not exist",e.getMessage());
		}
	}
	
	@Test
	public void testWithdrawMoreAmount() {
		try {
			accService.withdraw("9876543210",1000);
		} catch (AccountException e) {
			assertEquals("Enter Amount it should be less than available amount",e.getMessage());
		}
	}
	@Test
	public void testWithdraw()  {
		Account acc=new Account();
		acc.setMobileNo("9876543210");
		try {
			Account acc1 = accService.withdraw(acc.getMobileNo(),50);
			assertNotNull(acc1);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
			
		}
		}
	@Test
	public void testFundTransferMobileNo1()  {
		try {
			accService.fundTransfer("98765432","9876543210",50.0);
		} catch (AccountException e) {
			assertEquals("Mobile Number should contain 10 digits",e.getMessage());
		}
	}
	@Test
	public void testFundTransferMobileNo2()  {
		try {
			accService.fundTransfer("9876543210","98765432",50.0);
		} catch (AccountException e) {
			assertEquals("Mobile Number should contain 10 digits",e.getMessage());
		}
	}
	@Test
	public void testFundTransferAmount()
	{
		try {
			accService.fundTransfer("9876543210","8765432190",-1);
		} catch (AccountException e) {
			assertEquals("Enter Valid Amount should be greater than zero",e.getMessage());
		}
	}
	@Test
	public void testFundTransferMobileNo1DoesNotExist() {
		try {
			accService.fundTransfer("9876549870","8765432190",50.0);
		} catch (AccountException e) {
			assertEquals("Account with mobileno 9876549870 does not exist",e.getMessage());
		}
	}
	@Test
	public void testFundTransferMobileNo2DoesNotExist() {
		try {
			accService.fundTransfer("9876543210","8765432190",50.0);
		} catch (AccountException e) {
			assertEquals("Account with mobileno 8765432190 does not exist",e.getMessage());
		}
	}
	@Test
	public void testFundTransferMoreAmount() {
		try {
			accService.fundTransfer("9876543210","9876543211",1500);
		} catch (AccountException e) {
			assertEquals("Enter Amount it should be less than available amount",e.getMessage());
		}
	}
	@Test
	public void testFundTransfer()  
	{
		Account acc=new Account();
		Account acc1=new Account();
		try {
			Account account = accService.fundTransfer("9876543210","9876543211",100);
			assertNotNull(account);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		}
	@Test
	public void testPrintTransactionMobileNo()  {
		try {
			accService.printTransactions("98765432");
		} catch (AccountException e) {
			assertEquals("Mobile Number should contain 10 digits",e.getMessage());
		}
	}
	@Test
	public void testPrintTransactionMobileNo1DoesNotExist() {
		try {
			accService.printTransactions("9876549870");
		} catch (AccountException e) {
			assertEquals("Account with mobileno 9876549870 does not exist",e.getMessage());
		}
	}
	@Test
	public void testPrintTransactions()  {
		Account acc=new Account();
		try {
			Account acc1 = accService.printTransactions("9876543210");
			assertNotNull(acc1);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
			
		}
		}
	

}
