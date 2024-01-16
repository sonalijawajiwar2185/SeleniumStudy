package TestNGStudyCoverFox;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonlyUsedMethods.CommonMethodsUse;
import coverFoxStudyUsingPOM.CoverFoxHealthPlanMemberDetails;

public class Validate_testcases_CoverFox 
{
	ChromeOptions opt;
	WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPage healthPage;
	CoverFoxHealthPlanMemberDetails memberDetails;
	CoverFoxAddressDetails addressDetails;
	coverFoxHealthPlanResult result;	
	
  @BeforeClass
  public void launchBrowser()
  {
	   opt=new ChromeOptions();
	   opt.addArguments("--disable-notifications--");
	  driver=new ChromeDriver(opt);
	  home=new CoverFoxHomePage(driver);
	  healthPage=new CoverFoxHealthPage(driver);
	  memberDetails=new CoverFoxHealthPlanMemberDetails(driver);
       addressDetails=new CoverFoxAddressDetails(driver);
      result=new coverFoxHealthPlanResult(driver);
	  
	  
	  Reporter.log("Launching Browser", true);
	  driver.get("https://www.coverfox.com/");
	  driver.manage().window().maximize();
	  //use commonMethodClass for Implicit Wait
	  CommonMethodsUse.waituse(driver, 5);
  }  
  @BeforeMethod
  public void callingMethodsOfClass() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  Reporter.log("On home Page", true);
	  home.clickOngetStartedButton();
	  
	  Reporter.log("On Health Page", true);
	  healthPage.click_next_button();
	  
	  Reporter.log("On members details Page", true);
	  memberDetails.select_age(CommonMethodsUse.excelUse("coverFox", 0, 0));
	  memberDetails.click_healthPlanNextButton();
	  
       addressDetails.select_pincode1(CommonMethodsUse.excelUse("coverFox", 3, 0));
       addressDetails.select_mobile_number1(CommonMethodsUse.excelUse("coverFox", 3, 1));
       addressDetails.click_on_continue_button();
       }
  @Test
  public void validateResultNumber() throws InterruptedException 
  {
	  Reporter.log("On Result Page", true);
	  int textResult = result.Text_to_check_result();
	  Thread.sleep(1000);

	  Reporter.log("text Result :"+textResult, true);

	  int bannerResult = result.banners_to_check_result();
	  Thread.sleep(1000);

	  Reporter.log("text Result :"+bannerResult, true);

	  Assert.assertEquals(textResult, bannerResult,"Text result are not mathching with Banner Result,Test case failed ");
	  Reporter.log("Test case passed", true);
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
     Thread.sleep(7000);
      Reporter.log("Closing the Browser", true);
      driver.close();
  }
}  
  
  

  

  

