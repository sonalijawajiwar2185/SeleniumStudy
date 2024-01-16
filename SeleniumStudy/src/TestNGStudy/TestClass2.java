package TestNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void Tc6() 
  {
	  //Assert.fail();
	  Reporter.log("TestClass 3 is running", true);
  }
  
  @Test
  public void Tc4() 
  {
	  Reporter.log("TestClass 4 is running", true);
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
//@BeforeTest
//public void beforeTest()
//{
//	Reporter.log("Before Test is running ", true);
//}
//@AfterTest
//public void afterTest()
//{
//	Reporter.log("After Test is running ", true);
//}

}
