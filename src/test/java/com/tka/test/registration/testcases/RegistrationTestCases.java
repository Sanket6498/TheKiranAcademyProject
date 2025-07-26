package com.tka.test.registration.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tka.test.registration.Registration;

public class RegistrationTestCases {

	WebDriver driver;
	Registration registration;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/register");
		registration = new Registration(driver);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
