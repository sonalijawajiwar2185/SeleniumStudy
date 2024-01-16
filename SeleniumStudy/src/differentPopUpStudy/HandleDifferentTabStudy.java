package differentPopUpStudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDifferentTabStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[text()='Remote']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='HR']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Internship']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@title='Analytics']")).click();
        //Thread.sleep(1000);

		Set<String> allTabIds = driver.getWindowHandles();
		
		ArrayList<String> arrIds=new ArrayList<String>(allTabIds);
		
		for(int i=0;i<arrIds.size();i++)
		{
			Thread.sleep(1000);
            driver.switchTo().window(arrIds.get(i));		  
            Thread.sleep(100);
			System.out.println(driver.getTitle());
		}
		
		

	}

}
