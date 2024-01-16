package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlePractise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(100);
		
		String GetUrlCurr = driver.getCurrentUrl();
		System.out.println("Current Url is "+GetUrlCurr);
		
		String TitleGet = driver.getTitle();
		System.out.println("Title Of Browser is "+TitleGet);
		Thread.sleep(100);

	}

}
