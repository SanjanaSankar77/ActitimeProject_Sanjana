package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingPopupsBySendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
driver.switchTo().alert().sendKeys("Sanjana R Sankar");
driver.switchTo().alert().accept();
String result = driver.findElement(By.id("demo1")).getText();
if(result.contains("Sanjana"))
		System.out.println("Displayed");
else
	System.out.println("Not Displayed");
	}

}
