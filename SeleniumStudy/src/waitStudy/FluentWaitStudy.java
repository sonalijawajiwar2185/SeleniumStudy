package waitStudy;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitStudy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stoxkart.com/");
		//static wait...java wait
		//Thread.sleep(1000);
		//implicit wait...dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement Search = driver.findElement(By.xpath("//a[text()='Start Investing']"));
		
		Wait<WebDriver> w1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		w1.until(ExpectedConditions.elementToBeClickable(Search));
		Search.click();
		driver.findElement(By.name("mobile_number")).sendKeys("9860520600");

			
			
	

	}

}
