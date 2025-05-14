package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.linkText("Alert with OK & Cancel")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.switchTo().alert().dismiss();
	boolean result = driver.findElement(By.id("demo")).isDisplayed();
	if(result==true)
		System.out.println("You Pressed Cancel is Displayed");
	else
		System.out.println("You Pressed Cancel is Not Displayed");
		
	}

}
