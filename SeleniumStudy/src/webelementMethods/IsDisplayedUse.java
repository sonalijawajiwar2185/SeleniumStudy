package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gclid=CjwKCAjwp8OpBhAFEiwAG7NaEvt802F1Vppn7gzJDrejl7OwCLO2RwGti46RRR5sVhjYUShzGrJ8WRoC-E8QAvD_BwE");
		
		Thread.sleep(1000);
		
		boolean result = driver.findElement(By.id("reg_havechild")).isDisplayed();
		
		System.out.println("element is present "+result);
		driver.findElement(By.id("reg_mstatus")).sendKeys("Married");
		
		Thread.sleep(500);
		
         WebElement mariatalStatus = driver.findElement(By.id("reg_mstatus"));
         
         Select smariatal=new Select(mariatalStatus);
         
         smariatal.selectByValue("M");
        // Thread.sleep(1000);
         boolean result1 = driver.findElement(By.id("reg_havechild")).isDisplayed();
         
        System.out.println("result having child element present "+result1);
        
        WebElement storeChild = driver.findElement(By.id("reg_havechild"));
        
        Select sChild=new Select(storeChild);
        
        sChild.selectByVisibleText("No");
        
        Thread.sleep(1000);
        
        boolean check = sChild.isMultiple();
        
        System.out.println("multiple selection possible "+check);
        
        sChild.selectByVisibleText("Yes, living separately");
        Thread.sleep(100);
        
        sChild.selectByValue("YT");
        Thread.sleep(100);
        
        sChild.selectByIndex(3);
        Thread.sleep(100);
        
       // sChild.deselectByIndex(3);
        
        //Thread.sleep(100);
        
        //sChild.deselectByValue("YT");
        
        //Thread.sleep(100);
        
        //sChild.deselectByVisibleText("Yes, living separately");
        
        //Thread.sleep(100);
       //  sChild.deselectAll();
        
         
         
	}

}
