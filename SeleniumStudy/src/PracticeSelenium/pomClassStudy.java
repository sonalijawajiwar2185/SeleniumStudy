package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomClassStudy 
{

	@FindBy(xpath = "//input[@name='q']") private WebElement searchText;
	
	public pomClassStudy(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entersearchText ()
	{
		searchText.sendKeys("mobile");
	}
}
