package seleniumStudyProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassForSelenium {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://javagoal.com/");
	
	Thread.sleep(2000);//TO WAIT 
	driver.navigate().to("https://youtube.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.navigate().back();//for Backward navigation
	
	Thread.sleep(2000);
	
	driver.navigate().forward();//for forward navigation
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();//for refreshing 
	
	//driver.close();
	
	//driver.quit();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().minimize();
	Thread.sleep(5000);
	
	
	

	}

}
