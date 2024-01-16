package waitStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Thread.sleep(1000);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("A");
		List<WebElement> cityNames = driver.findElements(By.xpath("//td[@class='mapbg']//ul/li"));
		//System.out.println(cityNames);
		//String option="Mumbai";
		for(WebElement cn:cityNames)
		{
			System.out.println(cn.getText()+"   ");
			
			if(cn.getText().contains("Mumbai"))
			{
				cn.click();
				break;
			}
		}
       System.out.println();
       
       
        List<WebElement> toCityNames = driver.findElements(By.xpath("(//table[@id='citydropdown'])[2]//ul/li"));
		for( WebElement clickTo:toCityNames)  
        {
           System.out.println(clickTo.getText());
           if(clickTo.getText().contains("Delhi (DEL)"))
           {
           clickTo.click();
           break;
           }
        }
		
		System.out.println();
       WebElement dateSelect = driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']"));
       //create object of Actions Class
       Actions actDate=new Actions(driver);
       
       
       actDate.click(dateSelect).perform();
       for(int i=1;i<=10;i++)
       {
    	  actDate.sendKeys(Keys.ARROW_RIGHT).perform();
    	  
       }
 	  actDate.sendKeys(Keys.ENTER).perform();

       
       
       
       
	}

}
