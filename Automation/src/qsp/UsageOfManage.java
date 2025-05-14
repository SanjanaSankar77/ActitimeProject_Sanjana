package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bcci.tv/");
driver.manage().deleteAllCookies();
System.out.println(driver.manage().window().getSize());
System.out.println(driver.manage().window().getPosition());
driver.manage().window().fullscreen();
driver.manage().window().setSize(new Dimension(252,500));
driver.manage().window().setPosition(new Point(360,255));
String pgSrc=driver.getPageSource();
//System.out.println(pgSrc);
driver.manage().window().minimize();
driver.quit();

	}

}
