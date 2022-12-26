package Foreclosure;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import Foreclosure.ChromeDriver;
//import testngsession.WebDriver;
//import testngsession.WebElement;

public class ForeclosureTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		
		
		
	}
	

	@Test
	public void DemoTest () throws InterruptedException 
	{		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("19-01650IL");
		//driver.findElement(By.id("sFCFileNumber")).sendKeys("file");
		
		driver.findElement(By.id("btnSearch")).click();
		//System.out.println("File Search is completed");
		
		//move to Foreclosure screen		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/a[7]")).click();
		Thread.sleep(5000);
				
		//Checking for span
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
		Thread.sleep(3000);
		
		
		
		//click on lock button
	    driver.findElement(By.xpath("//span[normalize-space()='Lock']")).click();	    
	    Thread.sleep(4000);
	    
	    //clicking on unlock button
		driver.findElement(By.xpath("//span[normalize-space()='UnLock']")).click();
		Thread.sleep(3000);

	    
	    //click on Add to sale day button	    
	    driver.findElement(By.cssSelector("#btnAddToSaleDay")).click();	    
	       
	    Thread.sleep(4000);
	    
	   //clicking on no button on  sale day screen popup	    
	    driver.findElement(By.xpath("//button[@id='cleanblue_state0_buttonNo']")).click();	    
	       	    	    
	    //click on Cancel Ad order (working)
	    driver.findElement(By.id("btnCancelAdOrder")).click();
	    Thread.sleep(4000);
	        	    
	    //closing popup of cancel ad order	    
	    Set<String> handler = driver.getWindowHandles();
	    
	    Iterator<String> it = handler.iterator();

	    String parentWindow = it.next();
	    
	    String childWindow = it.next();
	    
	    driver.switchTo().window(childWindow);
	    
	    driver.close();
	    
	    driver.switchTo().window(parentWindow);
	       
	    Thread.sleep(3000);
	    	        
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
	   // click on Bankrupty Notification Review
	    driver.findElement(By.id("btnBankruptcyNotificationReview")).click();
	    Thread.sleep(2000);
	    	    
	    //click on Debtor's Attorny Radio Button
	    WebElement attornyRadioButton = driver.findElement(By.xpath("//input[@value='DRA']"));
	    attornyRadioButton.click();
	    System.out.println(attornyRadioButton.isSelected());
	    Thread.sleep(3000);
	    
	    
	    //click on External Bankruptcy Radio Button
	    WebElement ExternalBankruptcyRadioButton = driver.findElement(By.xpath("//input[@value='ERSS']"));
	    ExternalBankruptcyRadioButton.click();
	    System.out.println(ExternalBankruptcyRadioButton.isSelected());
	    Thread.sleep(3000);
	    	    
	   // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
	    //click on filed for Bankruptcy input field
	    WebElement Debtorfield = driver.findElement(By.xpath("//input[@id='txtBKPrevCount']"));
	    Debtorfield.click();
	    System.out.println(Debtorfield.isSelected());
	    Thread.sleep(3000);
	    	    
	    //insert value in input field
	    Debtorfield.sendKeys("1");
	    
	    //clicking on Case Number input field
	    WebElement CaseNumber  =driver.findElement(By.xpath("//input[@id='txtBK']"));
	    CaseNumber.click();
	  	    
	    //inserting value input field
	    CaseNumber.sendKeys("1");
	    Thread.sleep(3000);
	    
	    //clicking on BNR popup ok button
	    driver.findElement(By.xpath("//button[@id='btnBankruptcyNotificationSave']//span[@class='ui-button-text'][normalize-space()='Ok']")).click();
	    Thread.sleep(3000);
	    	    
	    //clicking on popup yes button
	    driver.findElement(By.xpath("//*[@id=\"cleanblue_state0_buttonOk\"]")).click();
	    Thread.sleep(3000);
	        
	    
	   // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));	    
	    //clicking on bankruptcy 
	    driver.findElement(By.id("btnBankruptcyNotificationReview")).click();
	    Thread.sleep(2000);
	   	    
	    //clicking on BNR popup close button    
	    driver.findElement(By.cssSelector("#btnBankruptcyNotificationCancel")).click();	   	    //System.out.println("BNR popup is closed successfully");
	    Thread.sleep(3000);
	        	    
	    //Clicking on hide link	    
	    driver.findElement(By.xpath("//td[@class='heading']//a[@class='toggleLink'][normalize-space()='Hide']")).click();	    
	   // System.out.println("We have successfully clicked on hide link");
	    Thread.sleep(3000);
	    
	    //click on mailing information show link
	    driver.findElement(By.linkText("Show")).click();
	    //System.out.println("show link has been clicked");		
	    	    
	    //click on save button	    
	    driver.findElement(By.xpath("//button[@id='Button1']")).click();
	    //System.out.println("Save button is clicked");
	    Thread.sleep(3000);	    
	    
	    	 
	}    
		

}
