package dimentionAndPointer;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewpositionStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		 Point actualPosition = driver.manage().window().getPosition();
		
		System.out.println(actualPosition);
		//set size 
		Point po=new Point(300, 10);
		
		driver.manage().window().setPosition(po);
	    Thread.sleep(100);
         Point po1=new Point(400, 20);
		
		driver.manage().window().setPosition(po1);
	    

	}

}
