package pomProjectStudy;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCartPage
{
	//variable initiallization
	@FindBy(xpath = "//div[@class='inventory_item_name']") private List<WebElement>  numberOfItemsInCart;
	@FindBy(id = "checkout")   private  WebElement check_out_button;
	
	
	//create constructor
	public SwagLabCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//create methods
	public void countNumberOfItemsInCart()
	{
		System.out.println("number of Items in Cart is :"+numberOfItemsInCart.size());
		for(WebElement nItems:numberOfItemsInCart)
		{
			System.out.println("Names of Items In Cart :"+nItems.getText());
		}
		
	}
	public void clickOnCheckOutButton()
	{
		check_out_button.click();
	}
}
