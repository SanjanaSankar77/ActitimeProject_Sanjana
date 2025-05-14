package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseDragMultipleAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.linkText("Drag Multiple")).click();
		Actions a = new Actions(driver);
		//mobilecover src
		WebElement mobilecover = driver.findElement(By.id("dragElement2"));
		mobilecover.click();

		//mobilecharger src
		WebElement mobilecharger = driver.findElement(By.id("dragElement4"));
		mobilecharger.click();

		//mobile destination
		WebElement mobileaccessories = driver.findElement(By.id("dropZone1"));

		a.clickAndHold(mobilecover).pause(Duration.ofSeconds(2)).dragAndDrop(mobilecover, mobileaccessories).perform();
		a.clickAndHold(mobilecharger).pause(Duration.ofSeconds(2)).dragAndDrop(mobilecharger,mobileaccessories).perform();

		//laptopcover src
		WebElement laptopcover = driver.findElement(By.id("dragElement3"));
		laptopcover.click();

		//laptopcharger src
		WebElement laptopcharger = driver.findElement(By.id("dragElement1"));
		laptopcharger.click();

		//laptop destination
		WebElement laptopaccessories = driver.findElement(By.id("dropZone2"));

		a.clickAndHold(laptopcover).pause(Duration.ofSeconds(2)).dragAndDrop(laptopcharger, laptopaccessories).perform();
		a.clickAndHold(laptopcharger).pause(Duration.ofSeconds(2)).dragAndDrop(laptopcharger, laptopaccessories).perform();

	}

}
