package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentDetails {
		@FindBy(name="txtFN")
		WebElement cardHolder;
		@FindBy(name="debit")
		WebElement debit;		
		@FindBy(name="cvv")
		WebElement cvv;		
		@FindBy(name="month")
		WebElement month;		
		@FindBy(name="year")
		WebElement year;		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"btnPayment\"]")
		WebElement makePayment;		
		
		public String getCardHolder() {
			return cardHolder.getAttribute("value");
		}
		public void setCardHolder(String cardHolder) {
			this.cardHolder.sendKeys(cardHolder);
		}
		public String getDebit() {
			return debit.getAttribute("value");
		}
		public void setDebit(String debit) {
			this.debit.sendKeys(debit);
		}
		public String getCvv() {
			return cvv.getAttribute("value");
		}
		public void setCvv(String cvv) {
			this.cvv.sendKeys(cvv);
		}
		public String getMonth() {
			return month.getAttribute("value");
		}
		public void setMonth(String month) {
			this.month.sendKeys(month);
		}
		public String getYear() {
			return year.getAttribute("value");
		}
		public void setYear(String year) {
			this.year.sendKeys(year);
		}		
		public void clickSubmit() {
			makePayment.click();
		}
}