package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelValueRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\WORKBOOK\\SELENIUMWORKBook1.xlsx");
        Workbook myWorkBook = WorkbookFactory.create(myFile);
    
        Sheet mySheet = myWorkBook.getSheet("FirstSheet");
        System.out.println(mySheet.getLastRowNum());
        System.out.println(mySheet.getRow(0).getLastCellNum());
        int RowNumber = mySheet.getLastRowNum();
        int totalRows=RowNumber;
        int ColumnsNumber = mySheet.getRow(0).getLastCellNum();
        int totalCells=ColumnsNumber-1;
        System.out.println("***********************");
        
        for(int i=0;i<=totalRows;i++)
        {
        	for(int j=0;j<=totalCells-1;j++)
        	{
        		String Value = mySheet.getRow(i).getCell(j).getStringCellValue();
        		System.out.print(Value+"  ");
        		
        	}
        	System.out.println("  ");
        }
    

	}

}
