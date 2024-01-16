package pomProjectStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckOutOneStepPage
{
	//variable initialization
	
	@FindBy(id = "first-name") private WebElement first_name;
	@FindBy(id = "last-name") private WebElement last_name;
	@FindBy(id = "postal-code") private WebElement postal_code;
	@FindBy(id = "continue") private WebElement continueButton;
	
	//create constructor
	public SwagLabCheckOutOneStepPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//create methods
	public void enterFirstName(String name) 
	{
     first_name.sendKeys(name);		
    }
	
	public void enterLastname(String surName)
	{
     	last_name.sendKeys(surName);	
	}

	public void enterPostalCode(String pinCode)
	{
		postal_code.sendKeys(pinCode);
		
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	
	

	

	
		
	}



