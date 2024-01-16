package differentPopUpStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--headless");
		//opt.addArguments("Incognito");
		//System.out.println(opt.addArguments("version"));
		//opt.addArguments("start maximized");
		
		
		Thread.sleep(1000);
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://www.w3schools.com/");
		
		System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
