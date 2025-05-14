package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelReadingMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./Data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count = wb.getSheet("Login").getLastRowNum();
		//System.out.println(count);
		for(int i=0;i<=count;i++)
		{
			String un = wb.getSheet("Login").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("Login").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un +"    "+ pw);
		}
	}
}