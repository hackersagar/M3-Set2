package com.cg.project.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.ConferenceRegistration;
import com.cg.project.beans.PaymentDetails;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	private WebDriver driver;
	ConferenceRegistration registration;
	PaymentDetails details;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","C:\\testing\\chromedriver.exe");
	 }
	@Given("^User is on Conference Registration Page$")
	public void user_is_on_Conference_Registration_Page() throws Throwable {
		driver = new ChromeDriver();  
		//2.Open the web page "ConferenceRegistartion.html" in the browser
		driver.get("C:\\Users\\mvineesh\\Downloads\\Module3-master\\TestAutomationAndSelenium\\htmlFiles\\ConferenceRegistartion.html");
		registration=PageFactory.initElements(driver, ConferenceRegistration.class);
		//3.Verify the title "Conference Registration" of the page
		String expectedPageTitle="Conference Registartion";
		String actualPageTitle=driver.getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}
	
	//4.When user clicks "Next" button without entering First Name
	@When("^User do not enter first name$")
	public void user_do_not_enter_first_name() throws Throwable {
		registration.setFistName("");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please fill the First Name' message$")
	public void display_Please_fill_the_First_Name_message() throws Throwable {
		 String expectedMessage="Please fill the First Name";
		 String actualMessage=driver.switchTo().alert().getText();
		 Assert.assertEquals(expectedMessage, actualMessage);
		 driver.close();
	}
	//5.When user clicks "Next" button without entering Last Name
	@When("^User do not enter last name$")
	public void user_do_not_enter_last_name() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please fill the Last Name'$")
	public void display_Please_fill_the_Last_Name() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//6.When user clicks "Next" button without entering email id
	@When("^User do not enter email$")
	public void user_do_not_enter_email() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please fill the Email'$")
	public void display_Please_fill_the_Email() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}	
	//When user enters invalid email id
	@When("^User enters invalid email$")
	public void user_enters_invalid_email() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allumail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please enter valid Email Id\\.'$")
	public void display_Please_enter_valid_Email_Id() throws Throwable {
		String expectedMessage="Please enter valid Email Id.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//7.When user clicks "next" button without entering phone number
	@When("^User do not enter contact number$")
	public void user_do_not_enter_contact_number() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}
	@Then("^diplay 'Please fill the Contact No\\.'$")
	public void diplay_Please_fill_the_Contact_No() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//8.When user enters invalid contact number
	@When("^User enters invalid contact number$")
	public void user_enters_invalid_contact_number() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("943210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please enter valid Contact no\\.'$")
	public void display_Please_enter_valid_Contact_no() throws Throwable {
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//9.When user clicks "next" button without selecting number of people
	@When("^User do not enter number of people attending$")
	public void user_do_not_enter_number_of_people_attending() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
//	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^diplay 'Please fill the Number of people attending'$")
	public void diplay_Please_fill_the_Number_of_people_attending() throws Throwable {
		String expectedMessage="Please fill the Number of people attending";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//10. When user clicks "next" button without entering door number in address
	@When("^User do not fill the address$")
	public void user_do_not_fill_the_address() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please fill the Building & Room No'$")
	public void display_Please_fill_the_Building_Room_No() throws Throwable {
		String expectedMessage="Please fill the Building & Room No";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//11. When user clicks "next" button without entering area name in address
	@When("^User do not fill the area name$")
	public void user_do_not_fill_the_area_name() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please fill the Area name'$")
	public void display_Please_fill_the_Area_name() throws Throwable {
		String expectedMessage="Please fill the Area name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//12. When user clicks "next" button without entering city
	@When("^User do not enter the$")
	public void user_do_not_enter_the() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	   // registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^disply 'Please select city'$")
	public void disply_Please_select_city() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//13. When user clicks "next" button without entering state
	@When("^User do not enter state$")
	public void user_do_not_enter_state() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    //registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please select state'$")
	public void display_Please_select_state() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//14. When user clicks "next" button without selecting membership 
	@When("^user do not select membership$")
	public void user_do_not_select_membership() throws Throwable {
		registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    //registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	}	
	@Then("^display 'Please Select MemeberShip status'$")
	public void display_Please_Select_MemeberShip_status() throws Throwable {
		String expectedMessage="Please Select MemeberShip status";
		 String actualMessage=driver.switchTo().alert().getText();
		    Assert.assertEquals(expectedMessage, actualMessage);
		    driver.close();
	} 
	@When("^User fill registration page and goes to payment page$")
	public void user_fill_registration_page_and_goes_to_payment_page() throws Throwable {
		 registration.setFistName("Alekhya");
		    registration.setLastName("Reddy");
		    registration.setEmail("allu@gmail.com");
		    registration.setPhone("9876543210");
		    registration.clickPpl();
		    registration.setAddress("ERC,420");
		    registration.setArea("Hinjewadi");
		    registration.setCity(registration.getCity1());
		    registration.setState(registration.getState1());
		    registration.clickRadio();
		    registration.clickNext();
		    Thread.sleep(2000);
		    //15. Navigated to Personal details.html page
		    Alert jsAlert = driver.switchTo().alert();
			if(jsAlert.getText().equals("Personal details are validated."))
			{
				Thread.sleep(1000);
				jsAlert.accept();
				driver.navigate().to("C:\\Users\\mvineesh\\Downloads\\Module3-master\\TestAutomationAndSelenium\\htmlFiles\\PaymentDetails.html");
				details = PageFactory.initElements(driver, PaymentDetails.class);
				//16. Verify the title "Payment Details" of the page
				String expectedPageTitle1="Payment Details";
				String actualPageTitle1=driver.getTitle();
				Assert.assertEquals(expectedPageTitle1, actualPageTitle1);
			}
	}
	//17. When user clicks "Make Payment" button without entering card holder name
	@When("^do not enter card holder name$")
	public void do_not_enter_card_holder_name() throws Throwable {
		details.setCardHolder("");
		details.setDebit("9876987698769876");
		details.setCvv("333");
		details.setMonth("09");
		details.setYear("2025");
		details.clickSubmit();
		Thread.sleep(2000);
	}
	@Then("^display 'Please fill the Card holder name'$")
	public void display_Please_fill_the_Card_holder_name() throws Throwable {
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//18. When user clicks "Make Payment" button without entering card number
	@When("^do not enter debit card number$")
	public void do_not_enter_debit_card_number() throws Throwable {
		details.setCardHolder("alekhya");
		details.setDebit("");
		details.setCvv("333");
		details.setMonth("09");
		details.setYear("2025");
		details.clickSubmit();
		Thread.sleep(2000);
	}
	@Then("^display 'Please fill the Debit card Number'$")
	public void display_Please_fill_the_Debit_card_Number() throws Throwable {
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	// When user clicks "Make Payment" button without entering CVV
	@When("^do not enter CVV$")
	public void do_not_enter_CVV() throws Throwable {
		details.setCardHolder("alekhya");
		details.setDebit("9876987698769876");
		details.setCvv("");
		details.setMonth("09");
		details.setYear("2025");
		details.clickSubmit();
		Thread.sleep(2000);
	}
	@Then("^display 'Please fill the CVV'$")
	public void display_Please_fill_the_CVV() throws Throwable {
		String expectedMessage="Please fill the CVV";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//19.When user clicks "Make Payment" button without entering expiration month
	@When("^do not enter expiration month$")
	public void do_not_enter_expiration_month() throws Throwable {
		details.setCardHolder("alekhya");
		details.setDebit("9876987698769876");
		details.setCvv("333");
		details.setMonth("");
		details.setYear("2025");
		details.clickSubmit();
		Thread.sleep(2000);
	}
	@Then("^display 'Please fill expiration month'$")
	public void display_Please_fill_expiration_month() throws Throwable {
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	//20. When user clicks "Make Payment" button without entering expiration year
	@When("^do not enter expiration year$")
	public void do_not_enter_expiration_year() throws Throwable {
		details.setCardHolder("alekhya");
		details.setDebit("9876987698769876");
		details.setCvv("333");
		details.setMonth("09");
		details.setYear("");
		details.clickSubmit();
		Thread.sleep(2000);
	}
	@Then("^display 'Please fill the expiration year'$")
	public void display_Please_fill_the_expiration_year() throws Throwable {
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	@When("^User enters valid details$")
	public void user_enters_valid_details() throws Throwable {
	    registration.setFistName("Alekhya");
	    registration.setLastName("Reddy");
	    registration.setEmail("allu@gmail.com");
	    registration.setPhone("9876543210");
	    registration.clickPpl();
	    registration.setAddress("ERC,420");
	    registration.setArea("Hinjewadi");
	    registration.setCity(registration.getCity1());
	    registration.setState(registration.getState1());
	    registration.clickRadio();
	    registration.clickNext();
	    Thread.sleep(2000);
	    
	    Alert jsAlert = driver.switchTo().alert();
		if(jsAlert.getText().equals("Personal details are validated."))
		{
			Thread.sleep(1000);
			jsAlert.accept();
			//Open the Webpage "PaymentDetails.html" in the browser
			driver.navigate().to("C:\\Users\\mvineesh\\Downloads\\Module3-master\\TestAutomationAndSelenium\\htmlFiles\\PaymentDetails.html");
			details = PageFactory.initElements(driver, PaymentDetails.class);
		}
		details.setCardHolder("alekhya");
		details.setDebit("9876987698769876");
		details.setCvv("333");
		details.setMonth("09");
		details.setYear("2025");
		details.clickSubmit();
		Thread.sleep(2000);
	}
	@Then("^display Conference Registration is successful$")
	public void display_Conference_Registration_is_successful() throws Throwable {
		//21. For Successful registration Validation
		 String expectedMessage="Conference Room Booking successfully done!!!";
		 String actualMessage=driver.switchTo().alert().getText();
		 Assert.assertEquals(expectedMessage, actualMessage);
		 driver.close();
	}
}