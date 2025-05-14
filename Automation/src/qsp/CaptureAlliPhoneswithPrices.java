package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAlliPhoneswithPrices {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iPhone 16 Pro Max");
driver.findElement(By.xpath("//button[@type='submit']")).submit();
List<WebElement> ProductName = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 16 Pro Max')]"));
List<WebElement> ProductPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
for(int i=0; i<ProductName.size() && i<ProductPrice.size() ;i++)
{
	System.out.println(ProductName.get(i).getText()  +"------------" + ProductPrice.get(i).getText() );
}
	}

}
