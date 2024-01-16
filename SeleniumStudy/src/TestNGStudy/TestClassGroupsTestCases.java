package TestNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClassGroupsTestCases {
  @Test
  public void Tc1() 
  {
	  Reporter.log("TestClass 1 is running", true);
  }
  @Test(groups = "sanity")
  public void Tc3() 
  {
	  Reporter.log("TestClass 3 is running", true);
  }
  @Test(groups = "sanity")
  public void Tc4() 
  {
	  Reporter.log("TestClass 4 is running", true);
  }
  @Test(groups = "Regression")
  public void Tc5() 
  {
	  //Assert.fail();
	  Reporter.log("TestClass 5 is running", true);
  }
  
  @Test(groups = "Regression")
  public void Tc2() 
  {
	  //Assert.fail();
	  Reporter.log("TestClass 2 is running", true);
  }
  
//  @BeforeMethod
//  public void beforeMethod() 
//  {
//	  Reporter.log("Before Method  is running", true);
//  }
//
//  @AfterMethod
//  public void afterMethod() 
//  {
//	  Reporter.log("After Method  is running", true);
//  }
//
//  @BeforeClass
//  public void beforeClass() 
//  {
//	  Reporter.log("Before class  is running", true);
//  }
//  @AfterClass
//  public void afterClass() 
//  {
//	  Reporter.log("After Class  is running", true);
//  }
//
//  @BeforeSuite
//  public void beforeSuite()
//  {
//	  Reporter.log("Before suite is Running", true);
//  }
//  
//  @AfterSuite
//  public void afterSuite()
//  {
//	  Reporter.log("After suite is Running", true);
//  }
}
