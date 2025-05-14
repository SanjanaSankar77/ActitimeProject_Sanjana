package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingAllNewsUnderMoreNews {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");	
List<WebElement> MoreNews = driver.findElements(By.xpath("//h2[@data-testid='ohio-title']/../../../../..//h2"));
for(int i=0;i<MoreNews.size();i++)
{
	System.out.println(MoreNews.get(i).getText());
}
}
}