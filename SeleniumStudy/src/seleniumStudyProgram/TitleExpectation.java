package seleniumStudyProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleExpectation {

	public static void main(String[] args) throws InterruptedException
	{
		String expected="Bing";
		//String expectedTitle="";
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bing.com/");
	Thread.sleep(2000);
	String actual=driver.getTitle();
	System.out.println("actual Title of browser "+actual);
	 
	driver.manage().window().maximize();
    Thread.sleep(2000);
    
    if(expected.equals(actual) )
    {
    	System.out.println("Titles are exactly same i.e."+expected);
    }
    else
    	System.out.println("titles are not matching with each other");
	driver.close();
	
	
	}

}
