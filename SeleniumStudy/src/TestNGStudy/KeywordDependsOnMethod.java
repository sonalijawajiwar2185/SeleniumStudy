package TestNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordDependsOnMethod {
  @Test
  public void dependsOnMethodsStudyS() 
  {
	  Reporter.log("A is running", true);
  }
  @Test
  public void Case3() 
  {
	  Reporter.log("B is running", true);
  }

  @Test
  public void Case1() 
  {
	  Reporter.log("C is running", true);
  }

  @Test(dependsOnMethods = {"Case2"})
  public void Case4() 
  {
	  Reporter.log("D is running", true);
  }

  @Test
  public void Case2() 
  {
	  Assert.fail();
	  Reporter.log("T is running", true);
  }

}
