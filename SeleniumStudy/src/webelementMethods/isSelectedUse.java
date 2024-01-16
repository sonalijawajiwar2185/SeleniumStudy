package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedUse {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.gadgets360.com/");

		
		
		Thread.sleep(500);
		
	  driver.findElement(By.xpath("//a[text()='Product Finder']")).click();
		
		Thread.sleep(1000);
		WebElement resultCheckBox = driver.findElement(By.id("brand_Samsung"));
		boolean result = driver.findElement(By.id("brand_Samsung")).isSelected();
		System.out.println("Check Box is selected "+result);
		
	    Thread.sleep(100);
		
	    resultCheckBox.click();
	    
	    boolean resultCheckBox1 = resultCheckBox.isSelected();
	    
	    System.out.println("check box is selected "+resultCheckBox1);
	    
	    
	}


}
