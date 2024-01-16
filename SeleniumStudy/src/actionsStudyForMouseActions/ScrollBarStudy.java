package actionsStudyForMouseActions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollBarStudy {

	public static void main(String[] args) throws  IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");

		//locator of address textbox
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement addressArea = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		addressArea.sendKeys("I am from pune learning selenium");
		
	    JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript("arguments[0].scrollIntoView();",addressArea);
	    
	    File source = addressArea.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\sonal\\OneDrive\\Desktop\\SonaliScreenShots\\.png");
		FileHandler.copy(source, dest);
	    
//	    


	}

}
