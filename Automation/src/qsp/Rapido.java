package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rapido {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rapido.bike/Home");
		driver.findElement(By.xpath("//input[@placeholder='Enter Pickup Location']")).sendKeys("kr luxury ladies pg");
		driver.findElement(By.xpath("//input[@placeholder='Enter Drop Location']")).sendKeys("majestic railway station");
		driver.findElement(By.xpath("//button[text()='Book Ride']")).click();
		Thread.sleep(2000);
		System.out.println();
		System.out.println("KR Luxury Pg to Majestic Railway Station Charges:");
		System.out.println();
		String bikerate = driver.findElement(By.xpath("//div[contains(@class,'card-content item')]/../..//div[contains(text(),'₹')]")).getText();
		System.out.println("Bike: "  + bikerate);
		String autorate = driver.findElement(By.xpath("//div[text()=' Auto ']/../..//div[contains(text(),'₹ ')]")).getText();
		System.out.println("Auto: "  + autorate);
		String cabeconomyrate = driver.findElement(By.xpath("//div[text()=' Cab Economy ']/../..//div[contains(text(),'₹')]")).getText();
		System.out.println("Cab Economy: "  + cabeconomyrate);
	}

}
