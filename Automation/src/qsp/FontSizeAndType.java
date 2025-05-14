package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSizeAndType {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("size of font: " + driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size"));
		System.out.println("type of font: " + driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family"));
		driver.quit();
	}

}
