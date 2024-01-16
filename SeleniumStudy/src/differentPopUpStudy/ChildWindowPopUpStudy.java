package differentPopUpStudy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ChildWindowPopUpStudy {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
    driver.get("https://skpatro.github.io/demo/links/ ");
    Thread.sleep(1000);
    
    WebElement textOfMainPage = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
    System.out.println("Text FRom Main Page :"+textOfMainPage.getText());
    
    Thread.sleep(1000);
    
    driver.findElement(By.name("NewWindow")).click();
    Thread.sleep(1000);
    
    String MainPageId1 = driver.getWindowHandle();
    System.out.println(MainPageId1);
    
    Thread.sleep(1000);
    Set<String> childId1 = driver.getWindowHandles();//for all windows
   
//    ArrayList< String> ar=new ArrayList<String>(childId1);
//     for(int i=0;i<ar.size();i++)
//     {
//    	 driver.switchTo().window(ar.get(i));
//    	 System.out.println(driver);
//     }
    Iterator<String> ite = childId1.iterator();
    
   String mainIdPage = ite.next();
    String childId = ite.next();
    
    System.out.println("Id of Main Page :"+MainPageId1);
    System.out.println("Id of ChildWindow "+childId1);
    Thread.sleep(1000);
    driver.switchTo().window(childId);
    driver.manage().window().maximize();
    Thread.sleep(1000);
    
    driver.findElement(By.id("the7-search")).sendKeys("Working on Selenium");
    Thread.sleep(1000);
    
   System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
    Thread.sleep(1000);
    
    //driver.close();
    driver.switchTo().window(MainPageId1);
    Thread.sleep(500);
    System.out.println(driver.findElement(By.xpath("//p[contains(text(),'browser window')]")).getText());
    Thread.sleep(1000);
    
    File Search = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\Users\\sonal\\OneDrive\\Desktop\\SonaliScreenShots\\"+".png");
    FileHandler.copy(Search, dest);
    
    
    
    
    
    
    
	}

}
