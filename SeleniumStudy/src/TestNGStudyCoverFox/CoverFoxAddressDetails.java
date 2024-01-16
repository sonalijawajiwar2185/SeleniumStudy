package TestNGStudyCoverFox;

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
	public void select_pincode1(String addpincode)
	{
		pincode.sendKeys(addpincode);
	}
	public void select_mobile_number1(String Addmob)
	{
		mobile_number.sendKeys(Addmob);
	}
	public void click_on_continue_button()
	{
		continue_button.click();
	}

	public void select_pincode(String excelUse) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}

