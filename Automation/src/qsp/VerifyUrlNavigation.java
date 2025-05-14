package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
		System.out.println("Navigation is pass");
		else
			System.out.println("Navigation is fail");
		driver.quit();
	}

}
