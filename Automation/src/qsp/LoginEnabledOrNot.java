package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnabledOrNot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean result = driver.findElement(By.name("login")).isEnabled();
		if(result==true)
		{
			System.out.println("Login button is enabled and pass");
		}
		else
		{
			System.out.println("Login button is disabled and fail");
	}
driver.quit();
}
}