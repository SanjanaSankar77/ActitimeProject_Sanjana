package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameAndHref {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		String tagname=driver.findElement(By.id("licenseLink")).getTagName();
		System.out.println(tagname);
		String hrefvalue=driver.findElement(By.id("licenseLink")).getAttribute("href");
		System.out.println(hrefvalue);
		driver.quit();
	}

}
