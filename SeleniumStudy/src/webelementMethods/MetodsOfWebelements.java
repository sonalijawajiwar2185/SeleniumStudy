package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodsOfWebelements {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dribbble.com/");
		
		driver.manage().window().maximize();
		//relative Xpath....for Login
		driver.findElement(By.xpath("(//div/a)[2]")).click();
		
		Thread.sleep(1000);
		//locater type----ID
		driver.findElement(By.id("login")).sendKeys("SonaliJawajiwar@gmail.com");
		
		//Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("******");
		
		Thread.sleep(1000);
		//webelements methods-----Clear()
		driver.findElement(By.id("login")).clear();

		
		driver.findElement(By.id("password")).clear();
		
	    //locater type----NAME
	    
	    driver.findElement(By.name("login")).sendKeys("SonaliJawajiwar@gmail.com");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("password")).sendKeys("*********");
	    
	    Thread.sleep(1000);
	    //locator type------class
	    
	    
	
	
	
	}

}
