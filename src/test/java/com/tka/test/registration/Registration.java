package com.tka.test.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	@FindBy(name = "title")
	WebElement title;

	@FindBy(name = "first_name")
	WebElement fName;

	@FindBy(name = "last_name")
	WebElement lName;

	@FindBy(name = "email")
	WebElement emailId;

	@FindBy(name = "phone")
	WebElement phoneNo;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "passconf")
	WebElement confirmPassword;

	@FindBy(name = "terms_agree")
	WebElement termsAgree;

	@FindBy(name = "mailing_list")
	WebElement mailingList;

	@FindBy(name = "register")
	WebElement registerButton;

	public Registration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterTitle(String input) {
		title.sendKeys(input);
	}
	
	public void enterFirstName(String input) {
		fName.sendKeys(input);
	}
	
	public void enterLastName(String input) {
		lName.sendKeys(input);
	}
	
	public void enterEmailId(String input) {
		emailId.sendKeys(input);
	}
	
	public void enterPhoneNo(String input) {
		phoneNo.sendKeys(input);
	}
	
	public void enterPassword(String input) {
		password.sendKeys(input);
	}
	
	public void enterConfirmPassword(String input) {
		confirmPassword.sendKeys(input);
	}
	
	public void clickTermsAgree() {
		termsAgree.click();
	}
	
	public void clickMailingList() {
		mailingList.click();
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}
}
