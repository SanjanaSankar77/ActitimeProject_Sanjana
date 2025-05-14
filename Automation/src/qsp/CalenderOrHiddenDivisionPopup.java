package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderOrHiddenDivisionPopup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.name("policynumber")).sendKeys("123");
driver.findElement(By.id("dob")).click();
WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
Select s1=new Select(month);
s1.selectByVisibleText("Jun");
WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
Select s2=new Select(year);
	s2.selectByVisibleText("1994");
	driver.findElement(By.linkText("10")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	driver.findElement(By.id("renew_policy_submit")).click();
	boolean errormsg = driver.findElement(By.id("policynumberError")).isDisplayed();
	if(errormsg==true)
		System.out.println("Please enter valid policy number is displayed");
	else
		System.out.println("Please enter valid policy number is not displayed");
	}

}
