package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedDisplayedEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gclid=Cj0KCQjw4vKpBhCZARIsAOKHoWTdV7TfNQQq-FuGRP68ixOCUlHJoxqyeDwp3GY8Ct_NNtZCJD1_D3saAovnEALw_wcB#");

       Thread.sleep(100);
      boolean EnabledCheck = driver.findElement(By.id("reg_email")).isEnabled();
      System.out.println("textBox is enabled "+EnabledCheck);
      driver.findElement(By.id("reg_email")).sendKeys("sonalij@Gmail.com");
      
      Thread.sleep(100);
      boolean result = driver.findElement(By.id("reg_havechild")).isDisplayed();
		
		System.out.println("element is present "+result);
		driver.findElement(By.id("reg_mstatus")).sendKeys("Married");
		
		Thread.sleep(500);
		
		WebElement checkSelect = driver.findElement(By.id("chk_outside_india"));
		boolean SelectedCheck = driver.findElement(By.id("chk_outside_india")).isSelected();
		System.out.println("heck box is selected "+SelectedCheck);
		Thread.sleep(100);
		
		checkSelect.click();
		
		Thread.sleep(100);
		
      
      
      


	}

}
