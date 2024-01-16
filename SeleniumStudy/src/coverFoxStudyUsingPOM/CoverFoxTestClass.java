package coverFoxStudyUsingPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverFoxTestClass {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//create object of homepage class
		CoverFoxHomePage home=new CoverFoxHomePage(driver);
//		home.clickOnGender();
//		home.mobile_number_enter();
		home.clickOngetStartedButton();
		
		//create object of CoverFoxHealthPage
		CoverFoxHealthPage healthpage=new CoverFoxHealthPage(driver);
		healthpage.click_next_button();
		
		//create object of CoverFoxHealthPlanMemberDetails class
		CoverFoxHealthPlanMemberDetails member_details=new CoverFoxHealthPlanMemberDetails(driver);
		member_details.select_age("29");
		member_details.click_healthPlanNextButton();
		
		//create object of CoverFoxAddressDetails class
		CoverFoxAddressDetails address_details=new CoverFoxAddressDetails(driver);
		address_details.select_pincode();
		address_details.select_mobile_number();
		address_details.click_on_continue_button();
		
		//create object of coverFoxHealthPlanResult class
		coverFoxHealthPlanResult planResult=new  coverFoxHealthPlanResult(driver);
		planResult.Text_to_check_result();
		
		

	}

}
