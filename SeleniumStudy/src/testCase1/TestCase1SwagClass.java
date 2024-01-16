package testCase1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonlyUsedMethods.CommonMethodsUse;

public class TestCase1SwagClass {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement user_name = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement log_in_button = driver.findElement(By.id("login-button"));
		
		//sendkeys
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		log_in_button.click();
		
		//enter into inventory Add to Cart Operations

		WebElement backPack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement bike_light = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		WebElement t_shirt = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		
		backPack.click();
		bike_light.click();
		t_shirt.click();
		
		
		//click on Cart
		WebElement cart_items = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
		cart_items.click();
		
		//text of swag labs after click on add to cart
		
		WebElement textofSwag = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		System.out.println("text on Swag page is :"+textofSwag.getText());
		
		//count number of items in Cart
		List<WebElement> numberOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		
		System.out.println("Number odf Itemsa are:"+numberOfItems.size());
         //get text of each item
//		for(WebElement nof:numberOfItems)
//		{
//			System.out.println("Number of items are :"+nof.getText());
//			
//	    }
        	Iterator<WebElement> noi = numberOfItems.iterator();	
        	WebElement item1 = noi.next();
        	WebElement item2 = noi.next();
        	WebElement item3 = noi.next();
        	System.out.println("===============================");
        	System.out.println("Names of items are :"+item1.getText());
        	System.out.println("Names of item are :"+item2.getText());
        	System.out.println("Names of item are :"+item3.getText());

             if(item1.getText().equals("Sauce Labs Backpack") && item2.getText().equals("Sauce Labs Bike Light") && item3.getText().equals("Sauce Labs Bolt T-Shirt"));
              {
              System.out.println("Selected items are present in Cart");
              WebElement check_out_button = driver.findElement(By.id("checkout"));
              check_out_button.click();
              }              
              
              //after Check out
               WebElement first_name = driver.findElement(By.id("first-name"));
               WebElement last_name = driver.findElement(By.id("last-name"));

               WebElement postal_code = driver.findElement(By.id("postal-code"));
               
               
               //send keys
               first_name.sendKeys("SONALI ");
               last_name.sendKeys("JAWAJIWAR");
               postal_code.sendKeys("443556");
               
              // click on Continue
               driver.findElement(By.id("continue")).click();
               
               //finish the work
               WebElement finish_button = driver.findElement(By.id("finish"));
               finish_button.click();
               
               //printing Thanku Message
               WebElement Text_Message = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
               System.out.println(Text_Message.getText());
                System.out.println("===========================");
               //logout after Thanku Message
             
               if(Text_Message.getText().equals("Thank you for your order!"))
               {
            	   System.out.println("Done Successfully");
               }
               else
               {
            	   System.out.println("Not Done Successfully");
            	   
               }               
              WebElement Log_out_button = driver.findElement(By.id("react-burger-menu-btn"));
              Log_out_button.click();
              //logging out
              WebElement logging_out = driver.findElement(By.id("logout_sidebar_link"));
              logging_out.click();
              System.out.println("=======================");
              System.out.println("Logged_out Successfully ");
              
              //taking Screen Shot
              CommonMethodsUse.getScreenShot(driver,"SauceDemo Site");
              
            
           
			
        }
			
}














