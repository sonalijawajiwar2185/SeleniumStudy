package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetTextMethod {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dribbble.com/");
		
		driver.manage().window().maximize();
		 
		String expectResult="Hire the world’s top creative talent.";
		
		String actualResult=driver.findElement(By.className("hero__heading")).getText();
		
		System.out.println("Actual Result Is "+"**"+actualResult+"**");
		
		if(expectResult.equals(actualResult))
		{
			System.out.println("Text executed is True ");
		}
		else
		{
			System.out.println("Text executed is False");
		}
			
	}

}
