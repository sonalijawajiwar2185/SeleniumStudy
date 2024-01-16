package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywordINVOCATIONCount {
  @Test
  public void m()//t-t-m-u-u-u-p-p-p-p
  {
	  Reporter.log("Test Case m is Running", true);
  }
  @Test(priority = 1,invocationCount = 4)
  public void p()
  {
	  Reporter.log("Test Case m is Running", true);
  }
  @Test(invocationCount = 3)
  public void u()
  {
	  Reporter.log("Test Case m is Running", true);
  }
  @Test(priority = -2,invocationCount = 2)
  public void t()
  {
	  Reporter.log("Test Case m is Running", true);
  }

}
