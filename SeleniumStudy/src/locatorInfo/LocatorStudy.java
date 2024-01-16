package locatorInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"text\" ]")).sendKeys("Mobiles");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@role=\"button\"]")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@jsname=\"Ufn6O\"]")).sendKeys("9860520645");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[@jsname=\"V67aGc\"]")).click();
		
		//Thread.sleep(2000);
		
	}

}
