package actionsStudyForMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActionsProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		WebElement contextClickUse = driver.findElement(By.xpath("//span[text()='right click me']"));
		//create object of Actions Class
		
		Actions actContext=new Actions(driver);
		
		//first way
		actContext.contextClick(contextClickUse).perform();
		
		//second way
		actContext.moveToElement(contextClickUse).contextClick().build().perform();
		

	}

}
