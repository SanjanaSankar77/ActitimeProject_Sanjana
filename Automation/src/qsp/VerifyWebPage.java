package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
String actualTitle=driver.getTitle();
String expectedTitle="GOOGLE";
String actualUrl=driver.getCurrentUrl();
String expectedUrl="google.com";
//String expectedUrl="https://www.google.com/";
//if(actualTitle.equals(expectedTitle) || actualUrl.equals(expectedUrl))
if(actualTitle.equalsIgnoreCase(expectedTitle) && actualUrl.contains(expectedUrl))
	System.out.println("Pass");
else
	System.out.println("Fail");
driver.quit();

	}

}
