package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class KeywordPriorityStudy {
  @Test(priority = -1) //E-A-C-D-B
  public void testCaseA()
  {
	  Reporter.log("testCaseA is Running", true);
  }
  @Test(priority = 2)
  public void testCaseB()
  {
	  Reporter.log("testCaseB is Running", true);

  }
  @Test(priority = -1)
  public void testCaseC()
  {
	  Reporter.log("testCaseC is Running", true);

  }
  @Test(priority = 1)
  public void testCaseD()
  {
	  Reporter.log("testCaseD is Running", true);

  }
  @Test(priority = -4)
  public void testCaseE() 
  {
	  Reporter.log("testCaseE is Running", true);

  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Before Method is Running", true);

  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("After Method is Running", true);

  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Before Class is Running", true);

  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("After Class is Running", true);

  }

}
