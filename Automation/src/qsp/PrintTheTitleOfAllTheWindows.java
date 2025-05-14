package qsp;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheTitleOfAllTheWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		 Set<String> allWh = driver.getWindowHandles();//getWindowHandles() will give address of all the windows
		 for(String wh:allWh)
		 {
			 driver.switchTo().window(wh);
			String title = driver.getTitle(); //getTitle() will give the title of the current window.
			 System.out.println(title);
		 }

	}

}
