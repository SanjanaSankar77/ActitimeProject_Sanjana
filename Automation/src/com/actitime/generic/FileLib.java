package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String getExcelData(String sheet, int row, int cell ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public void setExcelData(String sheet, int row, int cell, String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream("./data/testscriptdata.xlsx");
		wb.write(fos);
	}
	
}
