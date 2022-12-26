package testngsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	
	static WebDriver driver;
	 
	 @BeforeTest
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
			driver.manage().window().maximize();
		}
	 @Test
		public void DemoTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String URL ="http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/";
		
		driver.get(URL);
		String actualTitle= driver.getTitle();
		String expectedTitle= "FMS 2.0";
		Assert.assertEquals(actualTitle,expectedTitle);
		System.out.println("Login successful");
	    Thread.sleep(4000);
	    
	    
	    driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("19-01650IL");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		

		
		//Clicking on Invoice screen
		driver.findElement(By.xpath("//a[normalize-space()='Invoice']")).click();
		
		//driver.findElement(By.id("//input[@id='txtInvoiceSearch']")).sendKeys("FC-7416344IL");
		
        Thread.sleep(15000);	
         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
		
	    //driver.findElement(By.xpath("(//span[@title='Add'])[1]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"BillingForm\"]/table/tbody/tr[8]/td/h3/span")).click();
//	 
//	    System.out.println("Add Charge pop up opened");
//	
//	   driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[1]/span[1]/button")).click();
//	   Thread.sleep(5000);
//     //driver.findElement(By.xpath("//*[@id='ufd-container']/div[61]/div/div/ul/li[2]")).click();
//     
//	 driver.findElement(By.xpath("//li[.='IL FC Advance']")).click();
//	// driver.findElement(By.xpath("//input[@name = 'txtAmount']")).sendKeys("$5.00");
//	// driver.findElement(By.xpath("//input[@name = 'txtQuantity']")).sendKeys("1");
//	 
//	 driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[3]/span[1]/button")).click();
//     Thread.sleep(5000);
//	 driver.findElement(By.xpath("//li[.='Advance for Special Assessment']")).click();
//	 
//	 Thread.sleep(2000);
//	 driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[9]/span[1]/button")).click();
//	   Thread.sleep(2000);
//	 driver.findElement(By.xpath("//li[.='ABC0001 - ABC Legal Services, LLC']")).click();
//	 
//	 	// driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[9]/span[1]/button")).sendKeys("");
//	 
//	// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='forum123']")));
//	
//	
//	 
//	  driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[2]/span[1]/button")).click();
//	  Thread.sleep(10000);
//	 driver.findElement(By.xpath("//input[@id='ufd-ddlProductList']")).sendKeys("IL Foreclosure | Cancelled - test | 11/04/2021 | 739368");
//	 driver.findElement(By.xpath("//input[@id='ufd-ddlProductList']")).sendKeys(Keys.ENTER);
//	  //driver.findElement(By.xpath("//li[@class='active'][contains(text(),'IL Foreclosure | Cancelled - test | 11/04/2021 | 739368')]")).click();
//	 
//	   //driver.findElement(By.cssSelector("select[id='ddlProduct'] option[value='669101']")).click();
//	  // driver.findElement(By.xpath("//*[@id=\"ufd-container\"]/div[145]/div/div/ul/li[@name='1']")).click();
//	  // driver.findElement(By.xpath("//*[@id=\"ddlProduct\"]/option[2]']")).click();
//      // driver.findElement(By.xpath("//li[@class='active'][contains(text(),'IL Foreclosure | Cancelled - test | 11/04/2021 | 7')]']")).click();
//      // driver.findElement(By.xpath("//li[@class='active'][contains(text(),'IL Foreclosure | Cancelled - test | 11/04/2021 | 7')]")).click();
//	   
//	   
//	 Thread.sleep(4000);
//	   driver.findElement(By.xpath("//input[@name = 'txtAmount']")).sendKeys("$5.00");
//	   driver.findElement(By.xpath("//input[@name = 'txtQuantity']")).sendKeys("1");
//	   
//	 driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Save'])[1]")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//button[@id='cleanblue_state0_buttonNo']")).click();
////driver.findElement(By.xpath("//div[contains(text(),'X')]")).click();
////driver.findElement(By.xpath("btn btn-default ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-hover")).click();
//	 
//	 driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Cancel'])[2]")).click();
//	 
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("(//span[@title='Edit Charge'])[1]")).click();
//	 
//	 //driver.findElement(By.xpath("(//span[@title='Edit Charge'])[1]")).click();
//	 
//	 //driver.findElement(By.cssSelector("(button[class='focus']")).click();
//	// driver.findElement(By.xpath("//*[@id=\"txtNoExpenseDescription\"]")).sendKeys("Test");
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Save'])[1]")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("(//span[@title='Delete Line Item'])[5]")).click();
//	 
//	// driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click( );
//     //wait.until(ExpectedConditions.alertIsPresent( ));
//     Alert alert2 = driver.switchTo( ).alert( );
//     String text2 = alert2.getText( );
//     System.out.println(text2);
//     alert2.accept( );
	 Thread.sleep(4000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    // js.executeScript("window.scrollBy(0,70)");            //Scroll Down(+ve)
     Thread.sleep(3000);
     System.out.println("Scrolled down..");  
     Thread.sleep(3000);
    // driver.findElement(By.xpath("((//*[@id=\"BillingForm\"]/table/tbody/tr[19]/td/h3/span")).click();
     
     driver.findElement(By.xpath("//tbody/tr[19]/td[1]/h3[1]/span[1]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[1]/ul/li[1]/span[1]/button")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//li[@class='active']")).click();
     
//     driver.findElement(By.xpath("(//span[@title='Edit Line Item'])[1]")).click();
//   driver.findElement(By.xpath("//div[@id='20_txtCommentsST___livespell_proxy']")).sendKeys("Test");
//    driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]/span")).click();
//     
//     driver.findElement(By.xpath("tr[id='3'] span[title='Delete Line Item']")).click();
 
//	 driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click( );
//     //wait.until(ExpectedConditions.alertIsPresent( ));
     Alert alert3 = driver.switchTo( ).alert( );
     String text3 = alert3.getText( );
     System.out.println(text3);
     alert3.dismiss();

	  
	
	}




}
