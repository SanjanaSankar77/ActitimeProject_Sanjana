package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildWindowPopupsOnly {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		String pwh = driver.getWindowHandle(); //getWindowHandle() will give the address of parent window only
		Set<String> allWh = driver.getWindowHandles();//getWindowHandles() will give address of all the windows
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			if(!(pwh.equals(wh)))
			{
				driver.close();	
			}
		}
	}
}
