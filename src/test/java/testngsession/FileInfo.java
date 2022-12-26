package testngsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileInfo {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void FileInfoTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		//click on View Workflow icon
		driver.findElement(By.xpath("//tr[@id='3']//span[@title='View Workflow'][normalize-space()='View']")).click();
		
		//driver.get("http://mywork-webui.appdev.mrlp:8099/ProductView/ManageProductView?productDetailId=796485&ID=1");
		
		
		//click on View Product Detail
		driver.findElement(By.xpath("//tr[@id='3']//span[@title='View Product Detail'][normalize-space()='View Product Detail']")).click();
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		//Click on cross x icon on View Product Detail pop up
		
          Thread.sleep(2000);
          
		//Click on Save button-Pass
		driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[3]/button[2]")).click();
		
		//click on Cancel button on view Product Detail pop up- pass
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@title='Cancel'])[4]")).click();
		
		//Click on View Contacts-need to look on clicking window pop up
          
//          driver.switchTo().frame(driver.findElement(By.name("forum123")));
//		
//		driver.findElement(By.xpath("(//span[@title='View Contacts'][normalize-space()='View Contacts'])[3]")).click();
//		  Thread.sleep(4000);
//		 // driver.switchTo().alert().accept();
//		  
//		  Alert alert = driver.switchTo().alert();		
//  		
//	        // Capturing alert message.    
//	        String alertMessage= driver.switchTo().alert().getText();		
//	        		
//	        // Displaying alert message		
//	        System.out.println(alertMessage);	
//	        Thread.sleep(2000);
//	        		
//	        // Accepting alert		
//	        alert.accept();		
//		  Actions builder = new Actions(driver);        
//          builder.sendKeys(Keys.ENTER);
          
          //click on clerkLink- need to look
          driver.switchTo().frame(driver.findElement(By.name("forum123")));
          Thread.sleep(2000);
          driver.findElement(By.cssSelector("tr[id='3'] span[title='ClerkLink']")).click();
          
          // click on Refresh button
          
         // driver.findElement(By.xpath("//span[@title='Refresh']")).click();
          
          // Click on Add button
          
         // driver.findElement(By.xpath("//span[@title='Add Product Referral']")).click();
          //driver.findElement(By.xpath("//select[@id='ProductList']")).click();
          
         // Select addproduct = new Select(driver.findElement(By.id("ProductList")));
  		 //Selecting value from dropdown product
         // addproduct.selectByIndex(2);
          
          // Clicking on save button-p
          
         // driver.findElement(By.xpath("//button[@onclick='javascript:IsCancelledProductExist();']")).click();
          
          //clicking on Cancel button-p
          
          //driver.findElement(By.xpath("(//button[@title='Cancel'])[2]")).click();
          
          //click on x on Add product pop up
          
         // driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='x'])[2]")).click();
          
          //click on Save button on Product Info screen
          
         // driver.findElement(By.xpath("(//button[@id='action'])[1]")).click();
          
          
          JavascriptExecutor js2 = (JavascriptExecutor)driver;
   		// js.executeScript("window.scrollTo(100, document.body.scrollHeight)");
 		js2.executeScript("window.scrollBy(0,70)");
          //Select value from Department drop down
          
                  
          Select department = new Select(driver.findElement(By.id("departments")));
   		 //Selecting value from department product
           department.selectByIndex(2);
           
//          driver.switchTo().frame(driver.findElement(By.name("forum123")));
//        driver.findElement(By.xpath("(//button[@class='focus'])[1]")).click();
          
          
//          driver.switchTo().frame(driver.findElement(By.name("forum123")));
//          driver.findElement(By.xpath("(body > form:nth-child(1) > div:nth-child(9) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(8) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(7) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > span:nth-child(1) > button:nth-child(2)")).click();
          
          //scroll down right hand slider on Product Info screen.
          
          JavascriptExecutor js = (JavascriptExecutor)driver;
 		// js.executeScript("window.scrollTo(100, document.body.scrollHeight)");
// 		js.executeScript("window.scrollBy(0,100)");
// 	   	 Thread.sleep(3000);
// 	     System.out.println("Scrolled down..");  
// 	     Thread.sleep(3000);

          
          
          
          
          
          
          
          
          
          
          
          
          
		
		
		
		
		         
         	     

	}    
	
	
	
	@AfterTest
	public void tearDown() {
		System.out.println("Test");
		//driver.quit();
	}

}
