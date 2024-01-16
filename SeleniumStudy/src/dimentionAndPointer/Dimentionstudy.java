package dimentionAndPointer;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimentionstudy 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(1000);
	Dimension actualSize = driver.manage().window().getSize();
	
	System.out.println(actualSize);
	//set size 
	Dimension dim=new Dimension(900, 500);
	
	driver.manage().window().setSize(dim);
    Thread.sleep(100);
	Dimension dim1=new Dimension(500,900);
	driver.manage().window().setSize(dim1);

	}

}
