package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMethodClass {

	@Test
	public void verifyLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPage l = new LoginPage();
		PageFactory.initElements(driver, l);
		l.setLogin("admin1", "manager1");
		l.setLogin("admin","manager");
	}

}
