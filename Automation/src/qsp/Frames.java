package qsp;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		WebElement login = driver.findElement(By.id("loginspan"));
		Actions a = new Actions(driver);
		a.doubleClick(login).perform();
		Thread.sleep(2000);
	String loginTitle = driver.getTitle();
	if(loginTitle.equals("Login - Vtiger"))
		System.out.println("Login page is displayed");
		else
			System.out.println("Login page is not displayed");
	
	}
	
	}

