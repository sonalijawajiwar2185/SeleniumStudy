package locatorInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[contains(@id,\"u_0_0\")]")).click();
		
		//driver.findElement(By.xpath("//input[contains(@id,\"u_q_b\")]")).sendKeys("Sonali");
		//driver.findElement(By.xpath("//input[contains(@id,\"u_q_d\")]")).sendKeys("Jawajiwar");
		
		//driver.findElement(By.xpath("//input[contains(@id,\"u_q_g\")]")).sendKeys("9860520645");
		//by index
		driver.findElement(By.xpath("(//input[@class=\"sc-bxivhb hrsLPT\"])[2]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//button[text()=\"SEARCH BUSES\"]")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),'Create a new account')]")).click();
		
		Thread.sleep(2000)
;		
		
		
	}

}
