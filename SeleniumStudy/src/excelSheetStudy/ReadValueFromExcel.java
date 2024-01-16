package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadValueFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\WORKBOOK\\SELENIUMWORKBook1.xlsx");
	        Workbook myWorkBook = WorkbookFactory.create(myFile);
	        String mySheet = myWorkBook.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
//	        Row myRow = mySheet.getRow(0);
//	        Cell myCell = myRow.getCell(0);
//	        String value = myCell.getStringCellValue();
	        System.out.println(mySheet);
	        
	        
	        

	}

}
