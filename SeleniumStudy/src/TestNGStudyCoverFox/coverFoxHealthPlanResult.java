package TestNGStudyCoverFox;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverFoxHealthPlanResult 
{
	//variable initialization
	@FindBy(xpath = "//div[contains(text(),'49 matching')]") private WebElement check_result;
	@FindBy(xpath = "//div[@id='plans-list']") private List<WebElement> size_of_planlist;

	//create constructor 
	public coverFoxHealthPlanResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public int Text_to_check_result() throws InterruptedException
	{
		String result = check_result.getText();
		String[] res = result.split(" ");
		String get_number_of_result = res[0];
        int get_result_in_int = Integer.parseInt(get_number_of_result);	
      //  System.out.println(get_result_in_int);    
        return get_result_in_int;
	}
	
	public int banners_to_check_result() throws InterruptedException
	{
        
   	 int number_of_plan = size_of_planlist.size();
	// System.out.println(number_of_plan);
	 return number_of_plan;
    
	}

}
