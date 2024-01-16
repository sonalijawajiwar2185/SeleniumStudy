package commonlyUsedMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethodsUse {

	
	public static void getScreenShot(WebDriver driver,String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\sonal\\OneDrive\\Desktop\\SonaliScreenShots\\"+name+".png");
		FileHandler.copy(src, desc);
	}
	
	public static void scrollintoview(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void waituse(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public static String excelUse(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\WORKBOOK\\SELENIUMWORKBook1.xlsx");
        Workbook myWorkBook = WorkbookFactory.create(myFile);
        
        String value = myWorkBook.getSheet("SecondSheet").getRow(row).getCell(cell).getStringCellValue();
        System.out.println("Data from Excel Sheet Name SecondSheet :"+value);
		return value;	
	}
	public static String excelUse(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\WORKBOOK\\SELENIUMWORKBook1.xlsx");
        Workbook myWorkBook = WorkbookFactory.create(myFile);
        
        String value = myWorkBook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
        System.out.println("Data from Excel Sheet Name:" + sheetName +" "+value);
		return value;	
	}
	
	public static void explicitwaituse(WebDriver driver,int time,WebElement element)
	{
		//used in ClickOnButton Class
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofMillis(time));
		wt.until(ExpectedConditions.elementToBeClickable(element));
		
    }
	
	
	
	
	
	
}
	

