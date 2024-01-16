package actionsStudyForMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickStudyForMouse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.intl=in");
		Thread.sleep(1000);
		//create object of Actions Class
		
		Actions act=new Actions(driver);
		
		//find the locator of login button
		
		WebElement LoginClick = driver.findElement(By.cssSelector("input#login-signin"));
		
		driver.findElement(By.cssSelector("input#login-username")).sendKeys("sonaliJawajiwar@yahoo.com");
		
		Thread.sleep(1000);
		//first way of click
		act.moveToElement(LoginClick).click().build().perform();
		
		//second way of click
		act.click(LoginClick).perform();
		
		//third way of click
		act.moveToElement(LoginClick).perform();
		act.click().perform();

	}

}
