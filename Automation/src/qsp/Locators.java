package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Shankar/OneDrive/Desktop/Demo.html");
driver.findElement(By.tagName("a")).click();
System.out.println(driver.getTitle());
driver.navigate().back();
driver.findElement(By.id("d1")).click();
driver.navigate().back();
driver.findElement(By.name("n1")).click();
driver.navigate().back();
driver.findElement(By.className("c1")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[id='d1']")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[name='n1'")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[className='c1']")).click();
driver.navigate().back();
//Thread.sleep(5000);
//driver.findElement(By.cssSelector("a[href='https://www.jspiders.com/']")).click();
//Thread.sleep(5000);
//driver.navigate().back();
Thread.sleep(5000);
driver.findElement(By.linkText("GOOGLE")).click();
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.findElement(By.partialLinkText("OOG")).click();
driver.navigate().back();
	}

}
