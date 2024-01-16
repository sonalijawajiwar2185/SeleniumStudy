package TestNgTestClassPackage;

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
import org.testng.asserts.SoftAssert;

import BasePackage.BaseClassforCoverFox;
import POMPackage.CoverFoxAddressDetailsInclude;
import POMPackage.CoverFoxHealthPage;
import POMPackage.CoverFoxHomePage1;
import POMPackage.coverFoxHealthPlanResult;
import UtilityPackage.UtilityClassCommonMethodsUse;
import POMPackage.CoverFoxHealthPlanMemberDetails;
//@Listeners(ListenersStudy.listnerPincodeofaddressDetailsofCoverFox.class)
public class Validate_testcases_CoverFox2_for_PincodeField extends BaseClassforCoverFox
{
	CoverFoxHomePage1 home;
	CoverFoxHealthPage healthPage;
	CoverFoxHealthPlanMemberDetails memberDetails;
	CoverFoxAddressDetailsInclude addressDetailsInclude;    
	coverFoxHealthPlanResult result;	
	
  @BeforeClass
  public void launchBrowser()
  {
	  launchcoverFoxBrowser();
	  driver=new ChromeDriver();
	  home=new CoverFoxHomePage1(driver);
	  healthPage=new CoverFoxHealthPage(driver);
	  memberDetails=new CoverFoxHealthPlanMemberDetails(driver);
	  addressDetailsInclude=new CoverFoxAddressDetailsInclude(driver);
       result=new coverFoxHealthPlanResult(driver);	  
	  
	  Reporter.log("Launching Browser", true);
	  driver.get("https://www.coverfox.com/");
	  driver.manage().window().maximize();
	  //use commonMethodClass for Implicit Wait
	  UtilityClassCommonMethodsUse.waituse(driver, 5);
  }  
  @BeforeMethod
  public void callingMethodsOfClass() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  Reporter.log("On home Page", true);
	  home.clickOngetStartedButton1();
	  
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
  
//  @Test
//  public void ValidateSortPlan()
//  {
//	  SoftAssert so=new SoftAssert();
//	  so.assertTrue(result., null);
//  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
       closeBrowser1();
   }
}  
  
  

  

  

