package testngsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BudgetTracking {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void BudgetTrackingTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("19-01650IL");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//boolean flag = driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
		//Assert.assertEquals(flag, true);
		
		//Clicking on Invoice screen
				driver.findElement(By.xpath("//a[normalize-space()='Invoice']")).click();
				
				//driver.findElement(By.id("//input[@id='txtInvoiceSearch']")).sendKeys("FC-7416344IL");
				
		        Thread.sleep(4000);	
		         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
		         
		         Thread.sleep(4000);
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			     js.executeScript("window.scrollBy(0,70)");            //Scroll Down(+ve)
			     Thread.sleep(3000);
			     System.out.println("Scrolled down..");  
			     Thread.sleep(5000);
//			     //Add Notes-Show
//			     driver.findElement(By.tagName("//a[@class='toggleLink']")).click();
//			     
//			     Thread.sleep(5000);
//			     //Invoice History Expand All
			     driver.findElement(By.xpath("(//input[@id='btnToggle'])[2]")).click();
			     Thread.sleep(5000);
			   //Invoice History Collapse All
			     driver.findElement(By.xpath("(//input[@id='btnToggle'])[1]")).click();
			     
			     
			     
			     //Edit Budget TRacking
	       driver.findElement(By.xpath("(//span[@title='Edit'][normalize-space()='Edit'])[1]")).click();
	       driver.findElement(By.xpath("(//textarea[@id='txtAdditionalNotes'])[1]")).sendKeys("Test");
	       driver.findElement(By.cssSelector("form[id='EditBudgetForm'] button[title='Save']")).click();	
	        Thread.sleep(4000);
		        
			                 
		       
//	     //view Doc
		     
//      		     driver.findElement(By.xpath("//*[@id=\"1\"]/td[10]/span[3]")).click();			     
//      		     Thread.sleep(4000);
//	             Actions builder = new Actions(driver);        
//	             builder.sendKeys(Keys.ENTER);
//	             
////			     from selenium.webdriver.common.keys 
////			     tb.send_keys(Keys.ENTER) ;
////			   driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td/form/table/tbody/tr[17]/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div[1]/div[3]/div[3]/div/table/tbody/tr[2]/td[6]")).sendKeys(Keys.ENTER);
////			    // driver.findElement(By.xpath("//button[@onclick='javascript:validateLineItemFields();return false;']")).click();
////			 
	        //View  LIne Item  -T
			     
			   driver.findElement(By.cssSelector("tr[id='1'] span[title='View Line Item']")).click();
			   driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td/div[5]/div/div/div[2]/button[2]")).click();
			   driver.findElement(By.xpath("//input[@id='Reason']")).sendKeys("Test");
			   driver.findElement(By.xpath("//button[@id='cleanblue_state0_buttonOk']")).click();
			   
			   //Assign Line Item
			   
			   Thread.sleep(4000);
			   driver.findElement(By.cssSelector("tr[id='1'] span[title='Assign Budget Tracking to Unbilled Items']")).click();
			   driver.findElement(By.xpath("//button[@onclick=\"javascript:CloseBillingPopUp('assignBudgetToUnbilledItemsDialog');return false;\"]//span[@class='ui-button-text'][normalize-space()='x']")).click();
			   driver.findElement(By.xpath("//input[@id='Reason']")).sendKeys("Test");
			   driver.findElement(By.xpath("//button[@id='cleanblue_state0_buttonOk']")).click();
			   
			   
			   
}
	
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}



}
