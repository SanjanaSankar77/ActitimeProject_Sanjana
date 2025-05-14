package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchForSpecificOptionInListBox {
	public static void main(String[] args) {
		System.out.println("Enter the specific element");
		Scanner sc=new Scanner(System.in);
		String dish = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shankar/OneDrive/Desktop/MultiSelectListBox.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		boolean res=false;
		List<WebElement> allOptions = s.getOptions();
		for(int i=0;i<allOptions.size();i++) 
		{
			String menu = allOptions.get(i).getText();
			if(dish.equalsIgnoreCase(menu))
			{
				res=true;
				break;
				}
		}
		if(res==true)
		{
				System.out.println("dish is present");
		}
					else
			{
				System.out.println("dish is not present");
			}

		}
	}
