package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopupParentWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		Thread.sleep(2000);
		String pWh = driver.getWindowHandle();//getWindowHandle() will give only the address of parent window or parent browser
		System.out.println(pWh);
	}

}
