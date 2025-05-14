package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingToParticularElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/");
		WebElement particularElement = driver.findElement(By.xpath("//h2[text()='Watch']"));
		particularElement.getLocation().getY();
		Actions a = new Actions(driver);
		a.scrollToElement(particularElement).perform();	

	}

}
