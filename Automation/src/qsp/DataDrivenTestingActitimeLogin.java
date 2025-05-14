package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestingActitimeLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream pfis = new FileInputStream("./data/testdata.property");
		Properties p = new Properties();
		p.load(pfis);
		String url = p.getProperty("url");


		FileInputStream efis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(efis);


		int rowCount = wb.getSheet("Login").getLastRowNum();

		for(int i=1; i<=rowCount; i++)
		{
			String un = wb.getSheet("Login").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("Login").getRow(i).getCell(1).getStringCellValue();

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.id("loginButton")).click();
		
			boolean loggedin = driver.getTitle().contains("Enter Time-Track");
			boolean notloggedin = driver.findElements(By.xpath("//span[contains(text(),'invalid')]")).size()>0;

			FileOutputStream fos = new FileOutputStream("./data/TestScriptData.xlsx");
			
			if(loggedin)
			{
				wb.getSheet("Login").getRow(i).getCell(2).setCellValue("Pass");
				wb.write(fos);
				driver.findElement(By.linkText("Logout")).click();
			}
			else if(notloggedin)
			{
				wb.getSheet("Login").getRow(i).getCell(2).setCellValue("Fail");
				wb.write(fos);
			}
			driver.quit();

		}
	}




}


