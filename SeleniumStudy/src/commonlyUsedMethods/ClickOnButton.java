package commonlyUsedMethods;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		CommonMethodsUse.waituse(driver, 5);
		WebElement clickButton = driver.findElement(By.xpath("//span[text()='Login']"));
		CommonMethodsUse.explicitwaituse(driver, 2, clickButton);
		WebElement enterMobileNo = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//enterMobileNo.sendKeys("7656875665");
		//use common Methods from CommonMethodsUse Class
		enterMobileNo.sendKeys(CommonMethodsUse.excelUse(0,3));

	}

}
