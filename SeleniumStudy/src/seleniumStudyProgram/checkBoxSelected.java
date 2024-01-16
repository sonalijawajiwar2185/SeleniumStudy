package seleniumStudyProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxSelected {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.findElement(By.name("firstname")).sendKeys("Sonali");
		Thread.sleep(100);
		driver.findElement(By.name("lastname")).sendKeys("Jawajiwar");
		Thread.sleep(100);
		//driver.findElement(By.linkText("Selenium - Automation Practice")).click();
		
		//Thread.sleep(100);
        //driver.findElement(By.partialLinkText("Automation Practice")).click();
        //Thread.sleep(100);
      boolean checkRadio = driver.findElement(By.xpath("//input[@value='Female']")).isSelected();
      System.out.println("Radio button selected "+checkRadio);
      WebElement radioElement = driver.findElement(By.xpath("//input[@value='Female']"));
      radioElement.click();
        
      Thread.sleep(100);

	}

}
