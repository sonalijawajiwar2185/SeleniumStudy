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

public class ReadTablesFromExcel {

	
		public class TableFromExcel {

			public static void main(String[] args) throws EncryptedDocumentException, IOException {
				// TODO Auto-generated method stub
				FileInputStream in = new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\WORKBOOK\\SELENIUMWORKBook1.xlsx");
				Sheet mySheet = (Sheet) WorkbookFactory.create(in).getSheet("TablesOfNumbers");
				int lastRow = mySheet.getLastRowNum();
				short lastCell = (short) (mySheet.getRow(0).getLastCellNum()-1);
				for(int i =0;i<lastRow;i++)
				{
					for(int j=0;j<=lastCell;j++)
					{
						double data = mySheet.getRow(i).getCell(j).getNumericCellValue();
						System.out.printf("%5.0f",data);
					}
					System.out.println();
				}

			}

		}

	}


