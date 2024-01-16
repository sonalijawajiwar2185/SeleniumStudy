package pomProjectStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPomClassUse
{
	//number of webelements =number of variables
	//variable initialization
	@FindBy(id = "user-name") private WebElement user_name;
	@FindBy(id = "password") private WebElement password;
	@FindBy(id = "login-button") private WebElement login_button;
	
	//create constructor passing "driver" as a argument
    public SwagLabLoginPomClassUse(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
    //creating Methods for each variable
    public void enter_user_name(String userName)
    {
    	
    	user_name.sendKeys(userName);
    }
    
    public void enter_password(String passname)
    {
    	password.sendKeys(passname);
    }
    
    public void click_on_login_button()
    {
    	login_button.click();
    }

    //create another calss to call this methods ...called testClass
}
