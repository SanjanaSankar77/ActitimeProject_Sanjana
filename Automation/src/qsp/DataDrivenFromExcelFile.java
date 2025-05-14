package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		//url driven from PROPERTY FILE
		FileInputStream pfis = new FileInputStream("./data/testdata.property");
		Properties p = new Properties();
		p.load(pfis);
		String url = p.getProperty("url");

		//username and password driven from EXCEL FILE
		FileInputStream efis = new FileInputStream("./data/testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(efis);
		String un = wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String pw = wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();

		//url, username, and password is NOT HARDCODED, INSTEAD DRIVEN FROM PROPERTY FILE AND EXCEL FILE
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("loginButton")).click();
	
	}

}

