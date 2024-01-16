package PracticeSelenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonlyUsedMethods.CommonMethodsUse;

public class SendKeysUsingJawascriptExecutor {

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		
		WebElement enterText = driver.findElement(By.id("email"));
		
		WebElement enterpassword = driver.findElement(By.id("pass"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
		js.executeScript("arguments[0].value='sonalij@gmail.com'", enterText);
		js.executeScript("arguments[0].value='netra'", enterpassword);
		
		CommonMethodsUse.getScreenShot(driver, "FaceBook123");
		
		
		
	}

}
