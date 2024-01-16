package seleniumStudyProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeByIndexStudy {

	public static void main(String[] args) throws InterruptedException
	{
		
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("https://chercher.tech/practice/frames");
     Thread.sleep(1000);
     //driver.findElement(By.linkText("Topic : ")).getText();
    String TextMainPage = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples')]")).getText();
     System.out.println("Text on Main Page is "+TextMainPage);
     driver.switchTo().defaultContent();
     Thread.sleep(100);
     String AnotherTextOnMainPage = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
     System.out.println("Another Text On Main Page is "+AnotherTextOnMainPage);
     driver.switchTo().frame("frame1");
     Thread.sleep(100);
     
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Study");
     
     Thread.sleep(100);
     driver.switchTo().frame("frame3");
     
     Thread.sleep(100);
     driver.findElement(By.id("a")).click();
     Thread.sleep(100);
     
     driver.switchTo().defaultContent();
     Thread.sleep(100);
       driver.switchTo().frame("frame2");
       
       Thread.sleep(100);
       
       WebElement AnimalsDropDown = driver.findElement(By.id("animals"));
       Select AnimalSingle=new Select(AnimalsDropDown);
       
       AnimalSingle.selectByValue("babycat");
       
       Thread.sleep(100);
       
       driver.switchTo().defaultContent();
       
       Thread.sleep(100);
       driver.findElement(By.className("breadcrumb-item")).getText();
       
       Thread.sleep(100);
       
       
       
       
       
       
       
       
	}

}
