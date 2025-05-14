package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAutoSuggWithoutInspectingOnAutoSuggs {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iPhone");
Thread.sleep(2000);
List<WebElement> autosugg = driver.findElements(By.xpath("//span[@class='-niSoj']"));
Thread.sleep(2000);
for (int i=0;i<autosugg.size();i++)
{
	System.out.println(autosugg.get(i).getText());
}
	}
}
