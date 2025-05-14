package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingAllWindowsWithoutUsingQuit {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/");
driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
 Set<String> allWh = driver.getWindowHandles();
 for(String wh:allWh)
 {
	 driver.switchTo().window(wh);
	 driver.close();
 }
 
	}

}
