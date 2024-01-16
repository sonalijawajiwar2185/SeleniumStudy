package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class practiceDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.navigate().to("https://www.facebook.com/");

		 Thread.sleep(1000);
		 
		 driver.findElement(By.linkText("Create new account")).click();
		 Thread.sleep(1000);
		 
		 WebElement DropDay = driver.findElement(By.id("day"));
		 
		 Select DayFace=new Select(DropDay);
		 DayFace.selectByIndex(20);
		 
		 Thread.sleep(100);
		 
		 WebElement monthSelect = driver.findElement(By.id("month"));
		 
		 Select MonthFace=new Select(monthSelect);
		 
		 MonthFace.selectByValue("5");
		 
		 WebElement YearDrop = driver.findElement(By.id("year"));
		 
		 Select yearSelect=new Select(YearDrop);
		 yearSelect.selectByVisibleText("1988");
		 
		 
		// List<WebElement> ListSelect = DayFace.getOptions();
		 List<WebElement> listyear = yearSelect.getOptions();
		 for(WebElement amonth:listyear)
		 {
			 System.out.println(amonth.getText());
		 }
		 
		 List<WebElement> listday = DayFace.getOptions();
		 for(WebElement aday:listday)
		 {
			 System.out.println(aday.getText());
		 }
		 
		 System.out.println(MonthFace.getFirstSelectedOption().getText());
		 
		 System.out.println("********************************");
		 
		 List<WebElement> AllOptionsOfmonth = MonthFace.getAllSelectedOptions();
		 for(WebElement amonths:AllOptionsOfmonth)
		 {
			 System.out.println(amonths.getText());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
			}

}
