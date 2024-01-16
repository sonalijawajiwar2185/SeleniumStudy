package actionsStudyForMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickActionStudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		//find the locater
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		//crete object of Actions Class
		
		Actions actDoubleClick=new Actions(driver);
		
		//double click actions
		//first way
		
		actDoubleClick.moveToElement(doubleClickButton).perform();
		actDoubleClick.click().perform();
		
		//second way
		actDoubleClick.moveToElement(doubleClickButton).doubleClick().build().perform();
		
		//third wat
		actDoubleClick.doubleClick(doubleClickButton).perform();
		
		

	}

}
