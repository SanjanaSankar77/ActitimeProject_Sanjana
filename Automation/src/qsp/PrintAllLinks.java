package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
for(int i=0;i<allLinks.size();i++)
{
System.out.println(allLinks.get(i).getText());
}
}
}