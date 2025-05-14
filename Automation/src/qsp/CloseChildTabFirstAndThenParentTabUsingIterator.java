package qsp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildTabFirstAndThenParentTabUsingIterator {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("http://localhost/login.do");
driver.findElement(By.linkText("actiTIME Inc.")).click();
Set<String> allWh = driver.getWindowHandles();
Iterator<String> i= allWh.iterator();
String parentWindow = i.next();
String childWindow = i.next();
driver.switchTo().window(childWindow);
Thread.sleep(2000);
driver.close();
Thread.sleep(2000);
driver.switchTo().window(parentWindow);
Thread.sleep(2000);
driver.close();
Thread.sleep(2000);
	}
}
