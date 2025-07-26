package com.tka.test.registration.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tka.base.BaseClass;

public class RegistrationTestCases extends BaseClass {

	@Test
	public void validCreadiential() {
		registration.enterTitle("Mr");
		registration.enterFirstName("Sanket");
		registration.enterLastName("Gaikwad");
		registration.enterEmailId("sanket236@gmail.com");
		registration.enterPhoneNo("9209185055");
		registration.enterMobileNo("9209185055");
		registration.enterPassword("Sanket@5055");
		registration.enterConfirmPassword("Sanket@5055");
		registration.clickTermsAgree();
		registration.clickMailingList();
		registration.clickRegisterButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://javabykiran.in/other/CC/index.php?_a=account");
	}

	@Test
	public void invalidCrediential() {
		registration.clickRegisterButton();
	}
}
