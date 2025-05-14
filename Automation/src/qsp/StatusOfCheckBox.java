package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfCheckBox {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
boolean status = driver.findElement(By.name("remember")).isSelected();
if(status==true)
{
System.out.println("Checkbox is checked");
	}
else
{
	System.out.println("Checkbox is not checked");
}
driver.quit();
}
}
