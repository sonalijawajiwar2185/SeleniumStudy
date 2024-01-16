package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void AmazonBrowser()
  {
	  Reporter.log("Amazon Test case is Running", true);
	  
  }
  @Test
  public void FbBrowser()
  {
	  Reporter.log("Fb Test case is Running", true);
	  
  }
  @Test
  public void MyntraBrowser()
  {
	  Reporter.log("Myntra Test case is Running", true);
	  
  }

  
  @BeforeClass
  public void case1()
  {
	  Reporter.log("Before Class is Running", true);
  }
  
  @BeforeMethod
  public void case2()
  {
	  Reporter.log("Before Method is Running", true);
  }
  
  @AfterMethod
  public void case3()
  {
	  Reporter.log("After Method is Running", true);
  }

  @AfterClass
  public void case4()
  {
	  Reporter.log("After class is Running", true);
  }

  
}
