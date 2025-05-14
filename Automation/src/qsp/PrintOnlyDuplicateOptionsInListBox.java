package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicateOptionsInListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shankar/OneDrive/Desktop/MultiSelectListBox.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allOptions = s.getOptions();
		Set<String> allOptionsInSet = new TreeSet<String>();
		for(int i=0;i<allOptions.size();i++)
		{
			String dish = allOptions.get(i).getText();
			if(!allOptionsInSet.add(dish))
			{
			System.out.println(dish);	
			}
		}

}}
