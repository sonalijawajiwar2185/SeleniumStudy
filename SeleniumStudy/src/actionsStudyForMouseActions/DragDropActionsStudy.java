package actionsStudyForMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropActionsStudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		
		//create the object of Actions Class
		Actions actDragDrop=new Actions(driver);
		
		//fint locaters
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		//first way
		actDragDrop.clickAndHold(source).moveToElement(destination).release().build().perform();
		//second way
		actDragDrop.dragAndDrop(source, destination).perform();
		
		//Thread.sleep(1000);
//		driver.switchTo().activeElement();
//        WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//		
//		WebElement destination1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
//		//first way
//		actDragDrop.clickAndHold(source1).moveToElement(destination1).release().build().perform();
//		//second way
//		actDragDrop.dragAndDrop(source1, destination1).perform();
//		

	}

}
