package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class AssertionTestClass extends BaseClass {

	@Test
	public void verifyTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "koogle";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		driver.quit();
		s.assertAll();
	}
}
