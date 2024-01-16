package PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class practiceScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(100);

		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is "+CurrentURL);
		 String Title = driver.getTitle();
		 System.out.println("Title of Web "+Title);
		// RandomString rss=new RandomString();
		//String Store = rss.make(3);
		Date dt=new Date();
		long Store = dt.getTime();
		File SearchPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		File destinationFile=new File("C:\\Users\\sonal\\OneDrive\\Desktop\\ScreenShotsSelenium\\"+Store+".jpg");
		Thread.sleep(100);
		FileHandler.copy(SearchPath, destinationFile);
		
		
		
		
	}

}
