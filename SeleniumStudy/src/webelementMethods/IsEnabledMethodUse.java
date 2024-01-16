package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://gostor.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("mobile")).sendKeys("9860520645");
		Thread.sleep(500);
        boolean Result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		 
		System.out.println("checking the button is enabled  "+Result);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
		
		Thread.sleep(600);

	}

}
