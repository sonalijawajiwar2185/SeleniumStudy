package PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FindelementsUse {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String urlString=driver.get("https://www.google.co.in/");
		System.out.println(urlString+"String in URL");
		driver.findElement(By.name("q")).sendKeys("HONDA");
		Thread.sleep(1000);
		
		List<WebElement> listOfelements = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		//using for each loop
		for(WebElement ele:listOfelements)
		{
			System.out.println(ele.getText());
			//System.out.println("****");
			//if(ele.getText().equals("honda elevate"))	
		}
		
		//******************************************
		Thread.sleep(1000);
		System.out.println("**********************");
		
		for(WebElement ele:listOfelements)
		{
			System.out.println(ele.getText());
			//System.out.println("****");
			if(ele.getText().equals("honda elevate"))	
			{
				driver.findElement(By.xpath("//div[@aria-label='honda elevate']")).click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		
		
		File search = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\sonal\\OneDrive\\Desktop\\SonaliScreenShots\\"+".png");
		FileHandler.copy(search, dest);
		
		
		
		
		
		//using iterator
//		  Iterator<WebElement> eleite = listOfelements.iterator();  
//		  while(eleite.hasNext())
//		  {
//			  System.out.println(eleite.next().getText());
//	      }
//		
	
//	for(WebElement ele:listOfelements)
//	{
//		System.out.println(ele.getText());
//		//System.out.println("****");
//		
//		}
//		
		
	}
		
		
		
		
		

	}


