package ScreenShotsStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class takeScreenShotStudy {

	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		
		//RandomString rs=new RandomString();
		String Store = RandomString.make(6);
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				     
		File dest=new File("C:\\Users\\sonal\\OneDrive\\Documents\\Screenshot1\\"+Store+".png");
		
		FileHandler.copy(source, dest);
		
		//Thread.sleep(100);

	}

	

}
