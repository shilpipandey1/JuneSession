package testngsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdgeBrowser {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		 System.setProperty("webdriver.edge.driver",
		         "C:\\Users\\SHILPI.PANDEY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 WebDriverManager.edgedriver().setup();     
		 
		 //instance of EdgeDriver
		      WebDriver driver = new EdgeDriver();
		//driver.get("url");
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void InvoiceTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("19-01650IL");
		//driver.findElement(By.id("sFCFileNumber")).sendKeys("file");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//boolean flag = driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
		//Assert.assertEquals(flag, true);
		
		//Clicking on Invoice screen
				driver.findElement(By.xpath("//a[normalize-space()='Invoice']")).click();
				
				//driver.findElement(By.id("//input[@id='txtInvoiceSearch']")).sendKeys("FC-7416344IL");
				
		        Thread.sleep(15000);	
		         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
				
			    //driver.findElement(By.xpath("(//span[@title='Add'])[1]")).click();
			    driver.findElement(By.xpath("//*[@id=\"BillingForm\"]/table/tbody/tr[8]/td/h3/span")).click();
			 
			    System.out.println("Add Charge pop up opened");
			
		   driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[1]/span[1]/button")).click();
			   Thread.sleep(5000);
		     //driver.findElement(By.xpath("//*[@id='ufd-container']/div[61]/div/div/ul/li[2]")).click();
		     
			   
			 driver.findElement(By.xpath("//li[.='IL FC Advance']")).click();
			// driver.findElement(By.xpath("//input[@name = 'txtAmount']")).sendKeys("$5.00");
			// driver.findElement(By.xpath("//input[@name = 'txtQuantity']")).sendKeys("1");
			 
			 driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[3]/span[1]/button")).click();
		     Thread.sleep(5000);
			 driver.findElement(By.xpath("//li[.='Advance for Special Assessment']")).click();
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[9]/span[1]/button")).click();
			   Thread.sleep(2000);
			 driver.findElement(By.xpath("//li[.='ABC0001 - ABC Legal Services, LLC']")).click();
			 
			 	// driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[9]/span[1]/button")).sendKeys("");
			 
			// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
			
			
			 
			  driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[2]/span[1]/button")).click();
			  Thread.sleep(10000);
			 driver.findElement(By.xpath("//input[@id='ufd-ddlProductList']")).sendKeys("IL Foreclosure | Cancelled - test | 11/04/2021 | 739368");
			 driver.findElement(By.xpath("//input[@id='ufd-ddlProductList']")).sendKeys(Keys.ENTER);
			 	   
			 Thread.sleep(4000);
			   driver.findElement(By.xpath("//input[@name = 'txtAmount']")).sendKeys("$5.00");
			   driver.findElement(By.xpath("//input[@name = 'txtQuantity']")).sendKeys("1");
		   
		 driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Save'])[1]")).click();
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//button[@id='cleanblue_state0_buttonNo']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'X')]")).click();
		//driver.findElement(By.xpath("btn btn-default ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-hover")).click();
//			 
			 driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Cancel'])[2]")).click();
			 System.out.println("Add Charge Passed");
			 
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("(//span[@title='Edit Charge'])[1]")).click();
			 driver.findElement(By.xpath("(//div[@id='2_txtComments___livespell_proxy'])[1]")).sendKeys("Test");
			 Thread.sleep(5000);
		     driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Save'])[1]")).click();
		    System.out.println("Edit Charge Passed");
	 
//			 Thread.sleep(4000);
//			 
//			// driver.findElement(By.xpath("((//tr[@id='4499776']//span[@title='Delete Line Item']")).click();
//			 
//			 JavascriptExecutor js = (JavascriptExecutor)driver;
//			 js.executeScript("window.scrollTo(-100, document.body.scrollHeight)");
//		    // js.executeScript("window.scrollBy(0,70)");            //Scroll Down(+ve)
//		     Thread.sleep(3000);
//		     System.out.println("Scrolled up..");  
		     Thread.sleep(5000);
//			 
			
		      driver.findElement(By.xpath("(//span[@title='Delete Line Item'])[1]")).click( );
		 		
		     Alert alert2 = driver.switchTo( ).alert( );
		     String text2 = alert2.getText( );
		     System.out.println(text2);
		     alert2.dismiss( );
			 
			 //view Line Item History
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td/form/table/tbody/tr[9]/td/table/tbody/tr[3]/td/div/table/tbody/tr/td/div[1]/div[3]/div[3]/div/table/tbody/tr[2]/td[13]/span[2]")).click();			
		 System.out.println("View Line Item HIstory");
		 driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='x'])[2]")).click();
		 driver.findElement(By.xpath("//input[@id='Reason']")).sendKeys("Test");
		 driver.findElement(By.xpath("//button[@id='cleanblue_state0_buttonOk']")).click();
		 
			 
			 
	}
	
		
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}


}
