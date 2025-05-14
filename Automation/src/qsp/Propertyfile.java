package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.property");
		Properties p= new Properties();
		p.load(fis);
		WebDriver driver = new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
	}

}
