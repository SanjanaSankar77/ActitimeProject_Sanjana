package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeJavaWithoutUsingFindElement {

	public static void main(String[] args) throws AWTException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.switchTo().activeElement().sendKeys("java");
Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
	}

}
