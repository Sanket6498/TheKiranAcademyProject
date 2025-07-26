package com.tka.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tka.test.registration.Registration;
import com.tka.utilities.ReadConfig;

public class BaseClass {

	public WebDriver driver;
	public Registration registration;

	@BeforeMethod
	public void setup() throws Exception {
		String browserName = ReadConfig.readConfig("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		String url = ReadConfig.readConfig("url");
		driver.get(url);
		registration = new Registration(driver);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
