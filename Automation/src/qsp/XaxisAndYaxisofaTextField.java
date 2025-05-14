package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XaxisAndYaxisofaTextField {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		int xaxis = driver.findElement(By.id("username")).getLocation().getX();
		int yaxis = driver.findElement(By.name("pwd")).getLocation().getY();
		System.out.println("X-axis of username TF:" + xaxis);
		System.out.println("Y-axis of password TF:" + yaxis);
		driver.quit();

	}

}
