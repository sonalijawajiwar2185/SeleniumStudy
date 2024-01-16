package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeywordStudy {
  @Test
  public void enabledkeyword() 
  {
	  Reporter.log("test case is running", false);
  }
  
  @Test(priority = -2,invocationCount = 3)
  public void search() 
  {
	  Reporter.log("test case search is running", false);
  }
  @Test(enabled = false)
  public void delete() 
  {
	  Reporter.log("test case delete is running", false);
  }
  @Test(timeOut = 1000)
  public void update() throws InterruptedException 
  {
	  Thread.sleep(500);
	  Reporter.log("test case update is running", false);
  }
  @Test
  public void insert() 
  {
	  Reporter.log("test case insert is running", false);
  }
}
