package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPrintPop {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.dev/downloads/");
Robot r=new Robot();
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_P);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
for(int i=0;i<3;i++)
{
	Thread.sleep(1000);
r.keyPress(KeyEvent.VK_DOWN);
}
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_1);
r.keyPress(KeyEvent.VK_MINUS);
r.keyPress(KeyEvent.VK_2);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_W);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(1000);

	}

}
