package locatorInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBytext {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//xpath by using  
		//normal attribute using = attribute=attribute value 
		//attribute by using "contains" by using "," between attribute and attribute value
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sonalijawajiwar");//xpath by attribute
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("traj05042010");//xpath by using attribute
		
		//driver.findElement(By.xpath("//button[contains(@id,\"u_0_5\")]")).click();//xpath by using "contain attribute"
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();

		Thread.sleep(1000);
	}

}
