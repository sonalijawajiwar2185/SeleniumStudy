package webelementMethods;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownSelection {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	
	driver.manage().window().maximize();
	
	Thread.sleep(100);
	
     WebElement Selectmulopt = driver.findElement(By.name("selenium_commands"));
     
    Select smul=new Select(Selectmulopt);
    smul.selectByIndex(0);
    smul.selectByVisibleText("Switch Commands");
    smul.selectByIndex(1);
    smul.selectByIndex(3);
    smul.selectByIndex(4);
    
   System.out.println( "multiple selection option ="+smul.isMultiple());
   System.out.println("********using for each loop ********");
  
   //GetOption
     List<WebElement> option1 = smul.getOptions();
     for(WebElement go1:option1)
     {
    	 System.out.println(go1.getText());
     }
     System.out.println("                    ");
     System.out.println("**********using  iterator  ********");

     Iterator<WebElement> op1 = option1.iterator();
     while(op1.hasNext())
     {
    	 System.out.println(op1.next().getText());
     }
     System.out.println("*******using list iterator********");

     ListIterator<WebElement> op2 = option1.listIterator();
     while(op2.hasNext())
   {
	   System.out.println(op2.next().getText());
   }
     
     System.out.println("*******using For Loop********");
    for(int i=0;i<=option1.size()-1;i++)
    {
    	System.out.println(option1.get(i).getText());
    }
    //getFirstSelected Option
    WebElement opFirst = smul.getFirstSelectedOption();
    System.out.println(opFirst.getText());
       
   System.out.println("*****************");
    //GetAllSelectedOptionS
    List<WebElement> opAll = smul.getAllSelectedOptions();
     for(WebElement op1all:opAll)
     {
    	 System.out.println(op1all.getText());
     }
     

    	
//	 List<WebElement> multipleSelection = driver.findElements(By.xpath("//select[@name='selenium_commands']"));
//	 Thread.sleep(100);
//	 
//	 
//	 System.out.println("**********using for each loop*******");
//	 for(WebElement msc:multipleSelection)
//	 {
//		 System.out.println(msc.getText());
//	 }
//	 
//	 System.out.println("*********using Iterator**********");
//	 Iterator<WebElement> items = multipleSelection.iterator();
//	 
//	 while(items.hasNext())
//	 {
//		 System.out.println(items.next().getText());
//	 }
//	 
//	 System.out.println("*********using ListIterator**********");
//ListIterator<WebElement> lismul = multipleSelection.listIterator();
//System.out.println("****using Forward direction**********");
//
//while(lismul.hasNext())
// {
//	 System.out.println(lismul.next().getText());
// }
//System.out.println("****using backward direction**********");
//
//while(lismul.hasPrevious())
//{
//	System.out.println(lismul.previous().getText());
//}
//  




	}

}
