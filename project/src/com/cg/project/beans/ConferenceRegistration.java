package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConferenceRegistration {
	@FindBy(name="txtFN")
	WebElement fistName;	
	@FindBy(name="txtLN")
	WebElement lastName;	
	@FindBy(name="Email")
	WebElement email;	
	@FindBy(name="Phone")
	WebElement phone;	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[5]/td[2]/select/option[2]")
	WebElement ppl;	
	@FindBy(name="Address")
	WebElement address;	
	@FindBy(name="Address2")
	WebElement area;	
	@FindBy(name="city")
	WebElement city;	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[9]/td[2]/select/option[2]")
	WebElement city1;	
	@FindBy(name="state")
	WebElement state;	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[10]/td[2]/select/option[2]")
	WebElement state1;	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[12]/td[2]/input")
	WebElement member;	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[14]/td/a")
	WebElement next;
	//Getters and Setters
	public String getFistName() {
		return fistName.getAttribute("value");
	}
	public void setFistName(String fistName) {
		this.fistName.sendKeys(fistName);
	}
	public String getLastName() {
		return lastName.getAttribute("value");
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public String getEmail() {
		return email.getAttribute("value");
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public String getPhone() {
		return phone.getAttribute("value");
	}
	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}
	public String getPpl() {
		return ppl.getAttribute("value");
	}
	public void setPpl(String ppl) {
		this.ppl.sendKeys(ppl);
	}
	public String getAddress() {
		return address.getAttribute("value");
	}
	public void setAddress(String address) {
		this.address.sendKeys(address);
	}
	public String getArea() {
		return area.getAttribute("value");
	}
	public void setArea(String area) {
		this.area.sendKeys(area);
	}
	public String getCity() {
		return city.getAttribute("value");
	}
	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	public String getCity1() {
		return city1.getAttribute("value");
	}
	public void setCity1(String city1) {
		this.city1.sendKeys(city1);
	}
	public String getState() {
		return state.getAttribute("value");
	}
	public void setState(String state) {
		this.state.sendKeys(state);
	}
	public String getState1() {
		return state1.getAttribute("value");
	}
	public void setState1(String state1) {
		this.state1.sendKeys(state1);
	}
	public void clickNext() {
		next.click();
	}
	public void clickPpl() {
		ppl.click();
	}	
	public void clickRadio() {
		member.click();
	}	
}