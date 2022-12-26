package testngsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddShadow {
	
	 static WebDriver driver;
	 
	 @BeforeTest
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
			driver.manage().window().maximize();
		}
	 @Test
		public void AddShadowTimeTest() throws InterruptedException {
		  
		    
		    driver.switchTo().frame(driver.findElement(By.name("forum123")));

			driver.findElement(By.id("sFCFileNumber")).sendKeys("19-01650IL");
			
			driver.findElement(By.id("btnSearch")).click();
			System.out.println("File Search is completed");
							
			//Clicking on Invoice screen
			driver.findElement(By.xpath("//a[normalize-space()='Invoice']")).click();
			
			//driver.findElement(By.id("//input[@id='txtInvoiceSearch']")).sendKeys("FC-7416344IL");
			
	        Thread.sleep(15000);	
	         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
			
		   
		 Thread.sleep(4000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    // js.executeScript("window.scrollBy(0,70)");            //Scroll Down(+ve)
	     Thread.sleep(3000);
	     System.out.println("Scrolled down..");  
	     Thread.sleep(3000);
	     //Add Shadow Time
	              
     driver.findElement(By.xpath("//tbody/tr[19]/td[1]/h3[1]/span[1]")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//li[@class='active']")).click();
     Thread.sleep(4000);
     
     
    
     driver.findElement(By.cssSelector("#txtQuantityST")).sendKeys("1");
     driver.findElement(By.xpath("//input[@id='txtAmountST']")).sendKeys("1");
     driver.findElement(By.xpath("(//div[@id='20_txtCommentsST___livespell_proxy'])[1]")).sendKeys("Testtest");
     
     driver.findElement(By.xpath("(//button[@type='button'])[46]")).click();
     Thread.sleep(6000);
     //driver.findElement(By.xpath("(//li[@title='Anderson, Larissa'])[1]")).click();
     
    // driver.findElement(By.xpath("(//li[@title='Andric, Tena'])[1]")).click();
     
     driver.findElement(By.xpath("//input[@id='ufd-ddlBillingAttorneyST']")).sendKeys("Anderson, Larissa");
	 driver.findElement(By.xpath("//input[@id='ufd-ddlBillingAttorneyST']")).sendKeys(Keys.ENTER);
	 
	 //driver.findElement(By.cssSelector("(form[id='ctl00'] img[class='ui-datepicker-trigger']")).click();
	 
	 driver.findElement(By.xpath("//input[@id='txtExpenseDateST']")).sendKeys("11/7/2022");
	 
	 driver.findElement(By.xpath("//button[@id='btnsubmit']//span[@class='ui-button-text'][normalize-space()='Save']")).click();
     
//	     driver.findElement(By.xpath("(//button[@type='button'])[47]")).click();
//	     Thread.sleep(4000);
//	    // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
//	     //driver.findElement(By.xpath("//li[@class='active']")).click();
//	     //driver.findElement(By.xpath("(//button[@type='button'])[47]")).sendKeys("1");
//	     driver.findElement(By.xpath("((//input[@class='removeDirty' and @id='txtQuantityST']")).sendKeys("1");
//	     driver.findElement(By.xpath("(//div[@id='20_txtCommentsST___livespell_proxy']")).sendKeys("1");
//	    // driver.findElement(By.xpath("(//div[@id='20_txtCommentsST___livespell_proxy']")).click();
//	     
	 
	     
	  //Edit Shadow Time  
	 
//	 Thread.sleep(6000);
//	     
//        driver.findElement(By.xpath("(//span[@title='Edit Line Item'])[1]")).click();
//	    driver.findElement(By.xpath("//div[@id='20_txtCommentsST___livespell_proxy']")).sendKeys("Test");
//	    driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]/span")).click();
//	    
//	     //Delete Shadow Time
//	     Thread.sleep(4000);
//	    driver.findElement(By.xpath("//tr[@id='1']//span[@title='Delete Line Item']")).click();
//	 
////		 driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click( );
////	     //wait.until(ExpectedConditions.alertIsPresent( ));
//	     Alert alert3 = driver.switchTo( ).alert( );
//	     String text3 = alert3.getText( );
//	     System.out.println(text3);
//	     alert3.dismiss();
		}
	 
	 @AfterTest
		public void tearDown() {
			driver.quit();
	 }
}
