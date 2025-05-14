package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintBatsmannameAndRuns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/115032/mi-vs-kkr-12th-match-indian-premier-league-2025");
		List<WebElement> batsman = driver.findElements(By.xpath("//span[text()='Kolkata Knight Riders Innings']/../../div/div[1]/a"));
		List<WebElement> runs = driver.findElements(By.xpath("//span[text()='Kolkata Knight Riders Innings']/../../div/div[1]/a/../../div[3]"));
for(int i=0; i<batsman.size() && i<runs.size(); i++)
{
	System.out.println(batsman.get(i).getText()+"-----------"+runs.get(i).getText());
}


	}

}
