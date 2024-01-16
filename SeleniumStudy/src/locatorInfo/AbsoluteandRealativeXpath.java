package locatorInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteandRealativeXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dribbble.com/");
		driver.manage().window().maximize();
		//login by Abosolute path
driver.findElement(By.xpath("(/html/body/div/div/div/div/a)[1]")).click();
		
		//login by Relative path
		
driver.findElement(By.xpath("(//div/a)[2]")).click();
		Thread.sleep(2000);
		

	}

}
