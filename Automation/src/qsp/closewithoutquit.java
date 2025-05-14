package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.beust.ah.A;

public class closewithoutquit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> allwh = driver.getWindowHandles();
		for(String wh :allwh)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
	}

}
