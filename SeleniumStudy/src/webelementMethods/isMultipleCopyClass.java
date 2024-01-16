package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class isMultipleCopyClass

{		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
			Thread.sleep(100);
			 boolean ExperCheck = driver.findElement(By.cssSelector("input[value='3']")).isSelected();
		       System.out.println("Check Experience radio button "+ExperCheck);
		     
		     WebElement experienceClick =driver.findElement(By.cssSelector("input[value='3']"));       
		       experienceClick.click();
		       Thread.sleep(1000);
		        
		       // boolean result = driver.findElement(By.xpath("//input[@name='profession']")).isSelected();
		        
		       //System.out.println("cleck box is selected "+result);
		       //WebElement storePathCheckBox = driver.findElement(By.xpath("//input[@name='profession']"));
		        
		       //storePathCheckBox.click();                                      
		       //Thread.sleep(100);
		        
		        WebElement StorePath = driver.findElement(By.name("selenium_commands"));
		        
		        Select s1=new Select(StorePath);
		        boolean checkMultiple = s1.isMultiple();
		        
		        System.out.println("Multiple option in drop down "+checkMultiple);
		        s1.selectByVisibleText("Browser Commands");
		        
		        Thread.sleep(100);
		        
		        s1.selectByIndex(1);
		        
		        Thread.sleep(100);
		        s1.selectByIndex(2);
		        
		        Thread.sleep(100);
		        
		        s1.selectByIndex(3);
		        Thread.sleep(100);
		        
		        
		        s1.deselectByVisibleText("Browser Commands");
		        Thread.sleep(100);
		         
		        s1.deselectByIndex(1);
		        Thread.sleep(100);

		        s1.deselectByIndex(2);
		        Thread.sleep(100);

		        s1.deselectByIndex(3);
		        Thread.sleep(100);
		        
		        driver.findElement(By.name("submit")).click();
		        
	        
		}
	}


