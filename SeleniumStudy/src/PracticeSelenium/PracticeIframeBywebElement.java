package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import seleniumStudyProgram.checkBoxSelected;

public class PracticeIframeBywebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(100);
		
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(100);
		
		WebDriver Frame11 = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='frames1.html']")));
		System.out.println("Enter into Frame 1");
        Thread.sleep(100);
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Studies");
        Thread.sleep(100);
        
        WebDriver Frame33 = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='checkbox.html']")));
        System.out.println("Enter into Frame 3");
        Thread.sleep(100);
         boolean CheckBoxChecked = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println("Is check box selected "+CheckBoxChecked);
        
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(100);
        
        driver.switchTo().defaultContent();
        WebDriver Frame22 = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='dropdown-frame.html']")));
       
       System.out.println("Enter into Frame 2 ");
        Thread.sleep(100);
        WebElement DropDownAnimals = driver.findElement(By.id("animals"));
        Select dropanimal=new Select(DropDownAnimals);
        
        dropanimal.selectByVisibleText("Big Baby Cat");
        Thread.sleep(100);
        
        driver.switchTo().defaultContent();
        WebElement TextMainFrame = driver.findElement(By.xpath("//h1[text()='Frames Examples']"));
         System.out.println(TextMainFrame.getText());
         Thread.sleep(100);
         
         WebElement AnotherText = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(AnotherText.getText());
        Thread.sleep(100);
        
	}

}
