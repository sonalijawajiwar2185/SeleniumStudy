package actionsStudyForMouseActions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardUseActions {

	public static void main(String[] args) throws  IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://testautomationpractice.blogspot.com/");

		//create object of Actions Class
		Actions act=new Actions(driver);
		
		//enter text in textbox
		WebElement enterText = driver.findElement(By.xpath("//input[@id='name']"));
		
		act.sendKeys(enterText,"SONALI JAWAJIWAR").perform();
		WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email']"));
		
		act.keyDown(enterEmail,Keys.SHIFT ).sendKeys("sonalij@gmail").keyUp(Keys.SHIFT).sendKeys(".").keyDown(Keys.SHIFT).sendKeys("com").build().perform();
		//enter mobile number in textbox
		WebElement sendMobile = driver.findElement(By.xpath("//input[@id='phone']"));
		act.sendKeys(sendMobile, Keys.SHIFT).sendKeys("8765987657");
        
		//locator of address textbox
		WebElement addressArea = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		addressArea.sendKeys("I am from pune learning selenium");
		//WebDriverWait wt=new WebDriverWait(driver, Duration.ofMillis(50));
		//wt.until(ExpectedConditions.elementToBeClickable(addressArea));
		
		//code for ScrollBar using JavaScriptExicutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		js.executeScript("window.scrollBy(0,2000)");
		      	
	    WebElement radioCondition = driver.findElement(By.xpath("//input[@id='female']"));			
		System.out.println(radioCondition.isSelected());
		radioCondition.click();
		
		//selected checkboxes
		WebElement checkMon= driver.findElement(By.xpath("//input[@id='monday']"));
	    
		
		checkMon.click();
		WebElement check2 = driver.findElement(By.xpath("//input[@id='tuesday']"));
		check2.click();

		WebElement check3 = driver.findElement(By.xpath("//input[@id='wednesday']"));
		check3.click();

		WebElement check4 = driver.findElement(By.xpath("//input[@id='thursday']"));
		check4.click();
		WebElement check5 = driver.findElement(By.xpath("//input[@id='friday']"));
		check5.click();
		
		//search date with for loop
		WebElement searchCountry = driver.findElement(By.xpath("//select[@id='country']"));

				act.click(searchCountry).perform();
				for(int i=0;i<=3;i++)
				{
					act.sendKeys(Keys.ARROW_RIGHT).perform();
				}
				act.sendKeys(Keys.ENTER).perform();
				
		//dropDown for colours
		WebElement selectColours = driver.findElement(By.xpath("//select[@id='colors']"));
		Select sColours=new Select(selectColours);
		sColours.deselectByIndex(0);
		
		sColours.selectByValue("blue");
		
		sColours.selectByVisibleText("Yellow");
		
		System.out.println(sColours.isMultiple());
	   // List<WebElement> allColours = driver.findElements(By.xpath("//select[@id='colors']"));
	      List<WebElement> allColours = sColours.getOptions();
	      for(WebElement allCol:allColours)
	      {
	    	  System.out.println(allCol.getText());
	      }
	      sColours.deselectAll();
	      
	    //JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    
	   // js1.executeScript("arguments[0],scrollIntoView();",addressArea);
		//lacator of Country 
		
//		act.click(searchCountry).sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(100);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(100);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(100);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(100);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(100);
//		act.sendKeys(Keys.ENTER).perform();
		
		
		
		WebElement searchDate = driver.findElement(By.xpath("//input[@id='datepicker']"));
		System.out.println(searchDate.isEnabled());
		act.click(searchDate).perform();
         for(int j=0;j<=3;j++)
         {
        	 act.sendKeys(Keys.ARROW_RIGHT).perform();
        	 
         }
         act.sendKeys(Keys.ENTER).perform();
		
         
         //web table 
         
         WebElement textofTable = driver.findElement(By.xpath("//h2[text()='Web Table']"));
         System.out.println(textofTable.getText());
         
         //printing WEB Table
         List<WebElement> numbersOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr"));
         System.out.println(numbersOfRows.size());
         List<WebElement> numberOfColoumns = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr[1]/th"));

         List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr[1]/th"));

         Iterator<WebElement> ith = tableHeader.iterator();
         
         System.out.println("===========================");

         while(ith.hasNext())
         {
        	 System.out.print(ith.next().getText()+"  ");
         }
         System.out.println();
         System.out.println("==========================================");
        // List<WebElement> dataFromTable = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr/td"));
         for(int i=1;i<=numbersOfRows.size();i++)
         {
        	 for(int j=1;j<=numberOfColoumns.size();j++)
        	 {
        		 if(i==1)
        		 {
                 WebElement printdataheader = driver.findElement(By.xpath("//table[@name='BookTable']//tbody/tr["+i+"]/th["+j+"]"));
                 System.out.print(printdataheader.getText()+"  ");
        		 }
        		 else
        		 {
                     WebElement printdata1 = driver.findElement(By.xpath("//table[@name='BookTable']//tbody/tr["+i+"]/td["+j+"]"));
                     System.out.print(printdata1.getText()+"  ");

        		 }
        	 }
        	 System.out.println();
        	 System.out.println("=================================================");
         }
         
         //linked text Open Cart Orange HRM
	      WebElement openClick = driver.findElement(By.xpath("//a[text()='orange HRM']"));
	      openClick.click();
	      
		
	}

}
