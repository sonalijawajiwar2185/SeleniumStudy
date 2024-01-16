package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import POMPackage.CoverFoxHomePage1;
import POMPackage.CoverFoxHealthPage;
import POMPackage.CoverFoxHealthPlanMemberDetails;
import POMPackage.coverFoxHealthPlanResult;
import POMPackage.CoverFoxAddressDetailsInclude;
import commonlyUsedMethods.CommonMethodsUse;

public class BaseClassforCoverFox 
{
	 protected static WebDriver driver;
	
	//open browser
	public void launchcoverFoxBrowser()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notification--");
		  driver=new ChromeDriver(opt);
		  Reporter.log("Launching Browser", true);
		  driver.get("https://www.coverfox.com/");
		  driver.manage().window().maximize();
		  //use commonMethodClass for Implicit Wait
		  CommonMethodsUse.waituse(driver, 5);
	  } 
	
	
	//close browser
	public void closeBrowser1() throws InterruptedException
	{
		driver.close();
		Thread.sleep(1000);
		Reporter.log("closing Browser", true);
	}
	}
	


