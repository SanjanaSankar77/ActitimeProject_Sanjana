package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectListBox {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
WebElement monthListbox = driver.findElement(By.id("month"));
Select s=new Select(monthListbox);
//Select s=new Select(driver.findElement(By.id("month")));
s.selectByIndex(3);
Thread.sleep(2000);
s.selectByValue("6");
Thread.sleep(2000);
s.selectByVisibleText("Feb");
Thread.sleep(2000);
s.selectByContainsVisibleText("De");
Thread.sleep(2000);
	}

}
