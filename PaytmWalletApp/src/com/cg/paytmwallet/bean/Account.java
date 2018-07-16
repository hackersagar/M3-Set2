package com.cg.paytmwallet.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Account {
private String mobileNo;
private String name;
private String emailid;
private double balance;
LocalDateTime localdate;

public Account() {
	super();
}
public Account(String mobileNo, String name, String emailid, double balance) {
	super();
	this.mobileNo = mobileNo;
	this.name = name;
	this.emailid = emailid;
	this.balance = balance;
	
}

public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public LocalDateTime getLocaldate() {
	return localdate;
}

public void setLocalDateTime(LocalDateTime localdate) {
	this.localdate = localdate;
}


}
