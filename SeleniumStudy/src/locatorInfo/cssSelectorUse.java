package locatorInfo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cssSelectorUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Naksh");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("JAWAJIWAR");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[contains(@id,'u_2_g_')]")).sendKeys("9860520645");
		Thread.sleep(100);
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("********");
         Thread.sleep(100);		
         
         WebElement dayDropDown = driver.findElement(By.id("day"));
         Select sDropDay=new Select(dayDropDown);                           
         sDropDay.selectByIndex(24);
         
        // WebElement sDrop=driver.findElement(By.className("_9407"));
         WebElement sDropDate = driver.findElement(By.id("month"));
         Select sDate=new Select(sDropDate);
         sDate.selectByValue("12");
         Thread.sleep(100);
         
         //WebElement sYear1=driver.findElement(By.xpath("//select[@name='birthday_year']"));
         WebElement sDropYear = driver.findElement(By.id("year"));
         Select sYear=new Select(sDropYear);
         sYear.selectByVisibleText("2017");
         Thread.sleep(100);
         driver.findElement(By.cssSelector("input._8esa[value='2']")).click();
         Thread.sleep(100);
         
         driver.findElement(By.xpath("//button[contains(@id,'u_2_s')]")).click();
         Thread.sleep(100);

	}

}
