package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfTextField {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		int height1=username.getSize().getHeight();
		System.out.println(height1);
		int width1=username.getSize().getWidth();
		System.out.println(width1);
		WebElement password=driver.findElement(By.id("pass"));
		int height2=password.getSize().getHeight();
		System.out.println(height2);
		int width2=password.getSize().getWidth();
		System.out.println(width2);
		if(height1==height2 && width1==width2)
		{
			System.out.println("Height and width are equal");
		}
		else
		{
			System.out.println("Height and width are not equal");
		}
		driver.quit();
	}

}
