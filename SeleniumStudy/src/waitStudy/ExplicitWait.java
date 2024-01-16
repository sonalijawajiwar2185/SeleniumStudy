package waitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stoxkart.com/");
		//static wait...java wait
		//Thread.sleep(1000);
		//implicit wait...dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement Search = driver.findElement(By.xpath("//a[text()='Start Investing']"));
		//explicit wait.....dynamic wait
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(500));
		w.until(ExpectedConditions.elementToBeClickable(Search));
		Search.click();
		
		driver.findElement(By.name("mobile_number")).sendKeys("9860520600");
		
		
		
		//SearchItem.sendKeys("A");
        		

	}

}
