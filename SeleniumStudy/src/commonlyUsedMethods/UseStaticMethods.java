package commonlyUsedMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseStaticMethods {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		CommonMethodsUse.waituse(driver, 20);
		//WebElement textBoxUse = driver.findElement(By.xpath("//input[@name='q']"));
		//CommonMethodsUse.scrollintoview(driver, textBoxUse);
		 WebElement textPrint = driver.findElement(By.xpath("//h1[text()='Find a job & grow your career']"));
		 System.out.println(textPrint.getText());
		WebElement fullname = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement mobileNum = driver.findElement(By.id("mobile"));
		//scrollintoview method use from Commonmethodsuse class
		CommonMethodsUse.scrollintoview(driver, password);

		
		fullname.sendKeys(CommonMethodsUse.excelUse(0, 0));
		email.sendKeys(CommonMethodsUse.excelUse(0, 1));
		password.sendKeys(CommonMethodsUse.excelUse(0, 2));
		mobileNum.sendKeys(CommonMethodsUse.excelUse(0, 3));

         CommonMethodsUse.excelUse(1, 1);

		  CommonMethodsUse.getScreenShot(driver, "Naukri1");
	}

}
