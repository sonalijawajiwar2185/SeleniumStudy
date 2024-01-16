package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNGclass2 {
  @Test
  public void MyFlipLaunch()
  {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Flipcart Test Case Passed", true);
		
	  
  }
  @Test
  public void MyAmazonLaunch()
  {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon Test Case Passed", true);
  
  }
  @Test
  public void MyMyntraClass()
  {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Reporter.log("Myntra Test Case Passed", true);

		
	  
  }


  
}
