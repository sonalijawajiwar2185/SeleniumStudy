package coverFoxStudyUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails
{
	
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pincode;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobile_number;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continue_button;
	

	//constructor
	public CoverFoxAddressDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//create methods
	public void select_pincode()
	{
		pincode.sendKeys("411003");
	}
	public void select_mobile_number()
	{
		mobile_number.sendKeys("8888888888");
	}
	public void click_on_continue_button()
	{
		continue_button.click();
	}


		

	
	
	
	
	
}

