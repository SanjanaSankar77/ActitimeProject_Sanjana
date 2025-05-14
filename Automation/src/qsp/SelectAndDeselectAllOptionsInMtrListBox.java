package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectAllOptionsInMtrListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Shankar/OneDrive/Desktop/MultiSelectListBox.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0; i<alloptions.size(); i++)
		{
			s.selectByIndex(i);
		}
		if(s.isMultiple()==true)
		{
			for(int i=alloptions.size()-1; i>=0; i--)
			{
				s.deselectByIndex(i);
			}
		}
	}

}
