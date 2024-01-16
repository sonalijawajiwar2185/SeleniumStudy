package ListenersStudy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BasePackage.BaseClassforCoverFox;
import UtilityPackage.UtilityClassCommonMethodsUse;

public class Listener extends BaseClassforCoverFox implements ITestListener
{
	
@Override
public void onTestSuccess(ITestResult result)
{
	String CaseName = result.getName();
Reporter.log("test case"+" "+ CaseName+" "+ "passed Successfully", true);	
}


@Override
	public void onTestSkipped(ITestResult result) 
   {
	String CaseName = result.getName();

	Reporter.log("test case"+" "+CaseName+" "+" is depends on another test case ,verify it", true);
	}

@Override
	public void onTestStart(ITestResult result)
{
	String CaseName = result.getName();

	Reporter.log("test case"+" "+CaseName+ " "+ " is running ", true);
	
}

@Override
	public void onTestFailure(ITestResult result)

      {
//	try {
//		//UtilityClassCommonMethodsUse.getScreenShot(driver, result.getName());
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
	//	e.printStackTrace();
	}

	//String CaseName = result.getName();

	//Reporter.log("TestCase "+ " "+CaseName+" "+"is failed", true);
		}


	


