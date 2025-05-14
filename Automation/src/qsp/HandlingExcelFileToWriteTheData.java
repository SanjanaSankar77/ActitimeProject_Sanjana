package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFileToWriteTheData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("Skipped");
		FileOutputStream fos = new FileOutputStream("./data/Testscriptdata.xlsx");
		wb.write(fos);
	}

}
