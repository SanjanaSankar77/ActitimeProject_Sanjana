package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("selenium");
Thread.sleep(2000);
List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
System.out.println(allSuggestions.size());
for(int i=0;i<allSuggestions.size();i++)
{
	System.out.println(allSuggestions.get(i).getText());
	}
allSuggestions.get(allSuggestions.size()-1).click();
	
	}

}
