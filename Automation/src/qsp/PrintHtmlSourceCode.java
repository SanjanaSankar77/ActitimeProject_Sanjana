package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlSourceCode {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}
