package com.cg.paytmwallet.db;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;

import com.cg.paytmwallet.bean.Account;

public class AccountDb {

	private static HashMap<String,Account> accDb=
            new HashMap<String,Account>();
public static HashMap<String,Account> getAccountDb(){
return accDb;
}
static{
	accDb.put("9876543210", new Account("9876543210","Vineesha","vineesha@gmail.com",450.0));
	accDb.put("9876543211", new Account("9876543211","Anusha","anusha@gmail.com",100));
	accDb.put("9876543212", new Account("9876543212","Rehana","rehana@gmail.com",50));
	accDb.put("9876543213", new Account("9876543213","Vidya","vidya@gmail.com",250));

}
}
