package seleniumStudyProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlProgram {

	public static void main(String[] args) throws InterruptedException 
	{
	   
      String expectedURL="https://vctcpune.com/";

	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/");
	  Thread.sleep(2000);
	  
	  String actualURL=driver.getCurrentUrl();
	  System.out.println("ExpectedURL is "+"' "+actualURL +"'"+" matched with actual URL.");
	  
	  if (expectedURL.equals(actualURL)) 
	  {
		System.out.println("URL are mathing with each other.");
	  }
	  else 
	  {
		  System.out.println("URL are not matching with each other.");
      }
	  
	  driver.close();
	}

}
