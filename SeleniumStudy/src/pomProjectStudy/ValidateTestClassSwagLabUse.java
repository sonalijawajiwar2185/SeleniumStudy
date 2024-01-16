package pomProjectStudy;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonlyUsedMethods.CommonMethodsUse;

public class ValidateTestClassSwagLabUse {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		
		//create the object of class in which variables,contructor and methods are created(PomClassUse)
         SwagLabLoginPomClassUse pcu=new SwagLabLoginPomClassUse(driver);
		//call the methods using "pcu" object from PomClassUse
		pcu.enter_user_name(CommonMethodsUse.excelUse("SwagAppData", 0, 0));
		pcu.enter_password(CommonMethodsUse.excelUse("SwagAppData", 0, 1));
		pcu.click_on_login_button();
		
		
		//create object SwagLabInventoryPageUse class
		
		SwagLabInventoryPageUse sip=new SwagLabInventoryPageUse(driver);
		sip.addSauceLabBackPack();
		sip.addLabBikeLight();
		sip.addSauceLabTShirt();
		sip.clickOnCartButton();
		
		
		//create the object of SwagLabCartPage
		
		SwagLabCartPage slcp=new SwagLabCartPage(driver);
		slcp.countNumberOfItemsInCart();
		slcp.clickOnCheckOutButton();
		
		//create object of Class SwagLabCheckOutOneStepPage
		SwagLabCheckOutOneStepPage sop=new SwagLabCheckOutOneStepPage(driver);
		sop.enterFirstName(CommonMethodsUse.excelUse("SwagAppData",4, 0));
		sop.enterLastname(CommonMethodsUse.excelUse("SwagAppData", 4, 1));
		sop.enterPostalCode(CommonMethodsUse.excelUse("SwagAppData", 4, 2));
		sop.clickOnContinueButton();
	
		
		
		//create object of class SwagLabCheckOutStepTwo
		SwagLabCheckOutStepTwo sop2=new SwagLabCheckOutStepTwo(driver);
		sop2.clickOnFinishButton();
		
		//create object of class swagLabCheckOutCompletePage
		swagLabCheckOutCompletePage com=new swagLabCheckOutCompletePage(driver);
		com.printThankuMessage();
		com.clickOnBergerButtonForLogOut();
		Thread.sleep(100);
		com.clickOnLogOutButton();
		
		
		//calling ScreenshotMethod from Class CommonMethodUse 
		CommonMethodsUse.getScreenShot(driver, "POM CLASS ");
		
		
		
		
	}

}
