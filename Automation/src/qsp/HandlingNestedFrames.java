package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String email = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.switchTo().parentFrame();
		String password = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);	
		
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		String confirmPassword = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		Thread.sleep(2000);  
		driver.switchTo().frame(0);
		driver.findElement(By.id("confirm-password")).sendKeys(confirmPassword);
		driver.findElement(By.id("submitButton")).click();
	}

}
