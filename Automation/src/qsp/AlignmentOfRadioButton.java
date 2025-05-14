package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignmentOfRadioButton {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(2000);
int female = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
int male = driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
int custom = driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
if(female==male&&female==custom&&male==female&&male==custom&&custom==female&&custom==custom)
{
	System.out.println("Gender radio button is aligned properly and pass");
}
else
{
	System.out.println("Gender radio button is not properly aligned and fail");
}
		
driver.close();
	}

}
