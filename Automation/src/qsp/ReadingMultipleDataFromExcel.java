package qsp;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/MultipleData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		for(int i=0; i<=rowCount; i++)
		{
			int cellCount = wb.getSheet("Sheet1").getRow(i).getLastCellNum();
			for(int j=0; j<cellCount; j++)
			{
				String data = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + "   ");
			}
			System.out.println(); //to go to next line
		}

	}

}
