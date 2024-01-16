package ScreenShotsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
		//WebElement ButtonClickCheck = driver.findElement(By.partialLinkText("Iframe with in an Iframe"));
		
		//ButtonClickCheck.click();
		//Thread.sleep(1000);
		//WebElement saveframe =driver.findElement(By.xpath("//iframe[@id='hfcr']"));
		//
		//System.out.println(saveframe);
		//Thread.sleep(100);
		driver.switchTo().frame("singleframe");
		
        WebElement singleText = driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]"));
        System.out.println(singleText.getText());
//         
        Thread.sleep(1000);
//         
         WebElement innerFrametext =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
         boolean checktext = driver.findElement(By.xpath("(//input[@type='text'])[1]")).isEnabled();
         System.out.println(checktext);   
         innerFrametext.click();
         Thread.sleep(100);
         innerFrametext.click();
         driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Checking InnerFrames");
         
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
         
         
//         //driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).clear();
          driver.switchTo().defaultContent();
          WebElement MainButton = driver.findElement(By.linkText("Iframe with in an Iframe"));
         System.out.println( MainButton.isDisplayed());
          MainButton.click();
          System.out.println(MainButton.getText());
          Thread.sleep(1000);
          driver.switchTo().frame(13);
          Thread.sleep(1000);
        // driver.findElement(By.className("iframe-container")).isDisplayed();
         // driver.switchTo().frame(driver.findElement(By.xpath("//h5[text='Nested iFrames']")));
         // WebElement MainFrame = driver.findElement(By.xpath("//h5[text='Nested iFrames']"));
        // boolean chkMainFrame = driver.findElement(By.xpath("//h5[text='Nested iFrames']")).isDisplayed();
         
         //System.out.println(chkMainFrame);
       // Thread.sleep(1000);
//         
         
         
         
         
	}

}
