package actionsStudyForMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class SliderWIthActionClass {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(1000);
		
		Actions actSlider=new Actions(driver);
		
		WebElement dragSource = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dragDest = driver.findElement(By.xpath("//div[@id='droppable']"));

		actSlider.clickAndHold(dragSource).moveToElement(dragDest).release().build().perform();
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.xpath("//span[@tabindex='0']"));
		//WebElement dest = driver.findElement(By.xpath("//span[@style='left: 60%;']"));

		actSlider.scrollToElement(source).perform();
		actSlider.scrollByAmount(0, 100).perform();
		Thread.sleep(100);
		actSlider.dragAndDropBy(source,100, 0).build().perform();
		Thread.sleep(100);
		actSlider.dragAndDropBy(source,20, 0).build().perform();

		Thread.sleep(100);
		actSlider.dragAndDropBy(source,0, 0).build().perform();

		Thread.sleep(100);
		actSlider.dragAndDropBy(source,80, 0).build().perform();
		Thread.sleep(100);
		actSlider.dragAndDropBy(source,0, 0).build().perform();



						
				
	}

		
		
		
}





