package PracticeSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MUltipliationInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\WORKBOOK\\SELENIUMWORKBook1.xlsx");
         Workbook myBook = WorkbookFactory.create(myFile);
         Sheet mySheet = myBook.getSheet("TablesOfNumbers");
         System.out.println(mySheet.getLastRowNum());
         System.out.println(mySheet.getRow(0).getLastCellNum());
         int rowNumber = mySheet.getLastRowNum();
         int coloumnNumber = mySheet.getRow(0).getLastCellNum();
         System.out.println("**************");
         int totalRow = rowNumber;
         int totalColoumn=coloumnNumber-1;
         CellType dataType = mySheet.getRow(0).getCell(0).getCellType();
         System.out.println(dataType);
         for(int i=0;i<=totalRow;i++)
         {
        	 for(int j=0;j<=totalColoumn;j++)
        	 {
        		CellType dataType1 = mySheet.getRow(i).getCell(j).getCellType(); 
        		//System.out.print(dataType);
        		 if(dataType1==CellType.NUMERIC)
        		{
        			double numericValue = mySheet.getRow(i).getCell(j).getNumericCellValue();
        			System.out.printf("%5.0f",numericValue);
        		}	
        		 System.out.print(""); 
        	 }
        	 
        	
         }
        
		//Cell myCell = myRow.getCell(0);
         
	}

}
