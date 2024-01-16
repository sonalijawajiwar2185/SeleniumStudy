package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutKeywordStudy {
  @Test(timeOut = 2500)
  public void timeOutStudy() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("Testcase is passed", true);
  }
  @Test(timeOut = 1000)
  public void timeOutStudy1() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("Testcase1 is Failed", true);
  }
}
