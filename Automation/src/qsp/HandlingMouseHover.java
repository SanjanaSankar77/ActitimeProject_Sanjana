package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.vtiger.com/");
 WebElement company = driver.findElement(By.partialLinkText("Company"));
Actions a = new Actions(driver);
Thread.sleep(1000);
a.moveToElement(company).perform();
Thread.sleep(1000);
driver.findElement(By.partialLinkText("Contact Us")).click();
 String phNo = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
System.out.println("Bengaluru:" + phNo);
	}

}
