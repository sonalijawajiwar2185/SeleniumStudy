package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multipleValuesAccessExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\WORKBOOK\\SELENIUMWORKBook1.xlsx");
        Workbook myWorkBook = WorkbookFactory.create(myFile);
    
        Sheet mySheet = myWorkBook.getSheet("FirstSheet");
        for(int i=0;i<=4;i++)
        {
        	for(int j=0;j<=3;j++)
        	{
        		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
        		System.out.println(value);
        	}
        }

	}

}
