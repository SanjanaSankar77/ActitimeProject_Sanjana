package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
String title = driver.getTitle();
System.out.println(title);
driver.close();
	}

}
