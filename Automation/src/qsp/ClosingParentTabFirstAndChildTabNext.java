package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingParentTabFirstAndChildTabNext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		String wh1 = driver.getWindowHandle();
		driver.switchTo().window(wh1);
		driver.findElement(By.linkText("Read License Agreement")).click();
		Thread.sleep(2000);
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			if(wh1.equals(wh))
			{
				driver.close();
			}
		}
		List<WebElement> title = driver.findElements(By.xpath("//h2"));
		for(int i=0;i<title.size();i++)
		{
			System.out.println(title.get(i).getText());
		}
		driver.close(); //or driver.quit();

	}
}


