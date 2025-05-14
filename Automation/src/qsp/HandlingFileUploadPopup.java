package qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.naukri.com/mnjuser/homepage");
Thread.sleep(2000);
driver.findElement(By.id("usernameField")).sendKeys("sanjana77rajashankar@gmail.com");
driver.findElement(By.id("passwordField")).sendKeys("Sanju14344!");
driver.findElement(By.xpath("//button[text()='Login']")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Complete profile")).click();
Thread.sleep(2000);
File f=new File("./Data/SanjanaResume.docx");
Thread.sleep(2000);
String absolutepath = f.getAbsolutePath();
Thread.sleep(2000);
driver.findElement(By.id("attachCV")).sendKeys(absolutepath);
	}
}
