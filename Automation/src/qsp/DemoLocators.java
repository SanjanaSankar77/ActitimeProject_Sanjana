package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shankar/OneDrive/Desktop/Demo.html");
		driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.name("n2")).click();
		//driver.findElement(By.id("d2")).click();
		//driver.findElement(By.className("c2")).click();

	}

}
