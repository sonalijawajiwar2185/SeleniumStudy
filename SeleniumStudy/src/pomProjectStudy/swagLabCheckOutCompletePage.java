package pomProjectStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swagLabCheckOutCompletePage
{
  //variable initialization
	@FindBy(xpath = "//h2[text()='Thank you for your order!']") private WebElement thankuMessage;
	@FindBy(id = "react-burger-menu-btn") private WebElement bergerButtonForLogOut;
     @FindBy(id = "logout_sidebar_link") private WebElement logOutButton;
	//create constructor
	public swagLabCheckOutCompletePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//create methods
	public void printThankuMessage()
	{
		System.out.println(thankuMessage.getText());
	}
	
	public void clickOnBergerButtonForLogOut()
	{
		bergerButtonForLogOut.click();
	}
	public void clickOnLogOutButton()
	{
		logOutButton.click();
		System.out.println("Logged Out SuccessFully");
	}
}
