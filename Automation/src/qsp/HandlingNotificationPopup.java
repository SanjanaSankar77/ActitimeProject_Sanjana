package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopup {

	public static void main(String[] args) {
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(Option);
		driver.get("https://www.easemytrip.com/");
	}

}
