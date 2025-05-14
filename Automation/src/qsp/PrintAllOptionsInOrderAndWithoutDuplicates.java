package qsp;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsInOrderAndWithoutDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shankar/OneDrive/Desktop/MultiSelectListBox.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allOptions = s.getOptions();
		TreeSet<String> ts=new TreeSet<String>();
		for(int i=0;i<allOptions.size();i++)
		{
			ts.add(allOptions.get(i).getText());
		}
		for(String dish:ts)
		{
			System.out.println(dish);
		}
		driver.quit();
	}

}
