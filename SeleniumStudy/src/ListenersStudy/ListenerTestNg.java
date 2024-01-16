package ListenersStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersStudy.Listener.class)
public class ListenerTestNg {
  @Test
  public void a() 
  {
	  Reporter.log("testcase A is running", true);
  }
  @Test
  public void e() 
  {
	  Reporter.log("testcase A is running", true);
  }
  @Test
  public void c() 
  {
	  Assert.fail();
	  Reporter.log("testcase A is running", true);
  }
  @Test(dependsOnMethods = {"c"})
  public void b() 
  {
	  Reporter.log("testcase A is running", true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("testcase A is running", true);
  }

}
