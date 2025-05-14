package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlNavigationVerification {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String url = driver.getCurrentUrl();
		if(url.contains("google.com"))
		System.out.println("Navigation is pass");
		else
			System.out.println("Navigation is fail");
		driver.quit();
	}

}
