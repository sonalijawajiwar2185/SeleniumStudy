package pomProjectStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPageUse 
{
	//initialization of variables
	@FindBy(id = "add-to-cart-sauce-labs-backpack")  private  WebElement  sauce_lab_backpack;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")  private  WebElement  sauce_lab_bikelight;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")  private  WebElement  sauce_lab_t_shirt;
	@FindBy(className = "shopping_cart_link")  private  WebElement  cart_button;
	
	
	//create constructor
	public SwagLabInventoryPageUse(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//create methods
	public void addSauceLabBackPack()
	{
		sauce_lab_backpack.click();
	}
	
	public void addLabBikeLight()
	{
		sauce_lab_bikelight.click();
	}
	
	public void addSauceLabTShirt()
	{
		sauce_lab_t_shirt.click();
	}	
	
	public void clickOnCartButton()
	{
		cart_button.click();
	}

	
	
	

}
