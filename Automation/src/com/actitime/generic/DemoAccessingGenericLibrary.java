package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoAccessingGenericLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f= new FileLib();

		WebDriver driver = new ChromeDriver();
		driver.get(f.getPropertyData("url"));
		driver.findElement(By.id("username")).sendKeys(f.getExcelData("Login", 1, 0));
		driver.findElement(By.name("pwd")).sendKeys(f.getExcelData("Login", 1, 1));
		driver.findElement(By.id("loginButton")).click();
		boolean loggedin = driver.getTitle().contains("Enter Time-Track");
		boolean notloggedin = driver.findElements(By.xpath("//span[contains(text(),'invalid')]")).size()>0;
		if(loggedin)
		{
			f.setExcelData("Login", 1, 2, "Pass");
		}
		else if(notloggedin)
		{
			f.setExcelData("Login", 1, 2, "Fail");
		}
	}

}
