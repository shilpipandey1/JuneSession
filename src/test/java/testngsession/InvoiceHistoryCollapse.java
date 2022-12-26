package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvoiceHistoryCollapse {
 static WebDriver driver;
	 
	 @BeforeTest
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
			driver.manage().window().maximize();
		}
	 @Test
		public void BudgetTrackingCollapseTest() throws InterruptedException {
		  
		    
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
		 js.executeScript("window.scrollTo(60, document.body.scrollHeight)");
	    // js.executeScript("window.scrollBy(0,60)");            //Scroll Down(+ve)
	     Thread.sleep(3000);
	     System.out.println("Scrolled down..");  
	     Thread.sleep(5000);
	     
        
        //BudgetTracking Collapse All
      //  driver.findElement(By.xpath("((//input[@id='btnToggle'])[2]")).click();
        
    // Thread.sleep(5000);
     
     //BudgetTracking Expand All
     driver.findElement(By.xpath("(//input[@id='btnToggle'])[1]")).click();
     Thread.sleep(6000);
     //BudgetTracking Collapse All
     driver.findElement(By.xpath("(//input[@id='btnToggle'])[2]")).click();
     Thread.sleep(5000);
     
     
     
    
		}
	 
	 @AfterTest
		public void tearDown() {
			//driver.quit();
	 }

}
