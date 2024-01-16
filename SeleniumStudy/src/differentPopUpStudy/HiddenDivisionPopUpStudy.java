package differentPopUpStudy;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class HiddenDivisionPopUpStudy {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("HeadPhones");
		
		Thread.sleep(1000);
		RandomString rss=new RandomString();
		String store = rss.make(5);

		File SearchScrn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\sonal\\OneDrive\\Desktop\\SonaliScreenShots\\"+rss+".png");
		FileHandler.copy(SearchScrn, dest);
		
		Thread.sleep(1000);
		
		
		

	}

}
