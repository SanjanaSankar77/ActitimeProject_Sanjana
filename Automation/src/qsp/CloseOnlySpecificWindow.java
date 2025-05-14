package qsp;

import java.util.Scanner;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlySpecificWindow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a title to close:");
		String userTitle = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			if(userTitle.equals(actualTitle))
			{
				driver.close();
			}
		}

	}

}
