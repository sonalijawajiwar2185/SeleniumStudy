package webTableStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableUseToPrintTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		 List<WebElement> tableContent = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr"));
		 System.out.println("Rows in Table is "+tableContent.size());
		for(WebElement tc:tableContent)
		{
			System.out.println(" | "+tc.getText()+"     ");
		}
		 
		System.out.println("                           ");
			
		System.out.println("==============================");
		List<WebElement> NumberOfColoumns = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr/th"));
		System.out.println("Number of Coloumns are "+NumberOfColoumns.size());
		 for(WebElement c:NumberOfColoumns)
		 {
			 System.out.print(c.getText()+"  ");
		 }
		 System.out.println();
		
		

	}

}
