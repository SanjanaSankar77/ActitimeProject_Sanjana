package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNavigate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://mail.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();

	}

}
