package TestNgTestClassPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClassforCoverFox;
import POMPackage.CoverFoxAddressDetailsInclude;
import TestNGStudyCoverFox.CoverFoxHealthPage;
import TestNGStudyCoverFox.CoverFoxHomePage;
import TestNGStudyCoverFox.coverFoxHealthPlanResult;
import UtilityPackage.UtilityClassCommonMethodsUse;
import commonlyUsedMethods.CommonMethodsUse;
import coverFoxStudyUsingPOM.CoverFoxHealthPlanMemberDetails;

public class TestForSortPlan extends BaseClassforCoverFox
{
	CoverFoxHomePage home;
	CoverFoxHealthPage healthPage;
	CoverFoxHealthPlanMemberDetails memberDetails;
	CoverFoxAddressDetailsInclude addressDetailsInclude;    
	coverFoxHealthPlanResult result;	
	
  @BeforeClass
  public void launchBrowser()
  {
	  launchcoverFoxBrowser();
	  driver=new ChromeDriver();
	  home=new CoverFoxHomePage(driver);
	  healthPage=new CoverFoxHealthPage(driver);
	  memberDetails=new CoverFoxHealthPlanMemberDetails(driver);
	  addressDetailsInclude=new CoverFoxAddressDetailsInclude(driver);
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
	 // memberDetails.select_age(CommonMethodsUse.excelUse("coverFox", 0, 0));
	  memberDetails.select_age(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("age"));
	  memberDetails.click_healthPlanNextButton();
	  
       //addressDetailsInclude.select_pincode1(CommonMethodsUse.excelUse("coverFox", 3, 0));
      addressDetailsInclude.select_pincode1(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("pincode"));
      // addressDetailsInclude.select_mobile_number1(CommonMethodsUse.excelUse("coverFox", 3, 1));
	  addressDetailsInclude.select_mobile_number1(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("mobileNumber"));
       addressDetailsInclude.click_on_continue_button();
       
       }
 
  @Test
  public void callSortPlanMethod()
  {
    
  }
  
  
   @AfterClass
  public void closeBrowser() throws InterruptedException
  {
       closeBrowser1();
   }
}  


}
