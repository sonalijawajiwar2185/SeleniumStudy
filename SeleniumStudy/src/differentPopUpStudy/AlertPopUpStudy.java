package differentPopUpStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://output.jsbin.com/enifaf");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@onclick='launchConfirm()']")).click();
		 Thread.sleep(1000);
		 
		 Alert AltPopUp = driver.switchTo().alert();
		 
		 Thread.sleep(100);
		 
		AltPopUp.accept();//to press OK
		Thread.sleep(1000);
		 
		// AltPopUp.dismiss();//To press cancel
		 //Thread.sleep(1000);
		 
		System.out.println(AltPopUp.getText());
		 Thread.sleep(1000);
		 
		 
		 

	}

}
