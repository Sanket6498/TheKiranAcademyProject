package com.tka.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tka.base.BaseClass;

public class MyListeners extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targets = new File(System.getProperty("user.dir") + "/target/" + result.getName() + ".png");
		try {
			FileHandler.copy(source, targets);
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
