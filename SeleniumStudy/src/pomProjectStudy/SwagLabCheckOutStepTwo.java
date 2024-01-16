package pomProjectStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckOutStepTwo
{
	//variable initialization
	@FindBy(id = "finish") private WebElement finishButton;
	
	public SwagLabCheckOutStepTwo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFinishButton()
	{
		finishButton.click();
	}
	
	

}
