package PracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class PracticeScroll
{
public static void main(String[] args) throws InterruptedException, IOException
{	

       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       Thread.sleep(1000);
       
       WebElement storescreen = driver.findElement(By.xpath("(//img[@src='images/banner2.png'])[4]"));
       
       JavascriptExecutor js = (JavascriptExecutor)driver;
       Thread.sleep(100);
       js.executeScript("window.scrollBy(0,700)");
       Thread.sleep(100);
       js.executeScript("window.scrollBy(0,2000)");
      Thread.sleep(100);
//       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
      // Thread.sleep(100);
       js1.executeScript("arguments[0].scrollIntoView();", storescreen);
       
       Thread.sleep(1000);
       
       RandomString rs=new RandomString();
       String store = rs.make(10);
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
      File dest=new File("C:\\Users\\sonal\\OneDrive\\Desktop\\ScreenCheck\\"+store+".png");
      
      FileHandler.copy(source, dest);

       
       
       
       



	
}
}
