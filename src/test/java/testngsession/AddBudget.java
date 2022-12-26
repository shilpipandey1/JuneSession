package testngsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddBudget {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
	}
	
	@Test
	public void BudgetTrackingAddTest() throws InterruptedException {
		
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
//				 JavascriptExecutor js = (JavascriptExecutor)driver;
//				 //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//			     js.executeScript("window.scrollBy(0,70)");            //Scroll Down(+ve)
//			     Thread.sleep(3000);
//			     System.out.println("Scrolled down..");  
//			     Thread.sleep(3000);
			     //Add Budget TRacking
	        driver.findElement(By.xpath("//tbody/tr[17]/td[1]/h3[1]/span[1]")).click();
	        Alert alert = driver.switchTo( ).alert( );
		     String text = alert.getText( );
		     System.out.println(text);
		     alert.accept();	
		     
		     Thread.sleep(4000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 
			 js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    // js1.executeScript("window.scrollBy(0,-100)");            //Scroll up(+ve)
		     Thread.sleep(3000);
		     System.out.println("Scrolled up..");  
		     Thread.sleep(5000);
		    // driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		    // driver.findElement(By.xpath("//input[@id='ufd-ddlProduct']")).click();
		     
		     WebElement ele = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		     JavascriptExecutor jse = (JavascriptExecutor)driver;
		     jse.executeScript("arguments[0].click()", ele);
		     driver.findElement(By.xpath("(//li[@name='2'])[1]")).click();
		     driver.findElement(By.xpath("(//span[@title='Add'][normalize-space()='+'])[1]")).click();
		   // ----------------- 
		     
		     Thread.sleep(3000);
		     
		     
		     driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
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
			
		     
//		     driver.switchTo().frame(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td/table/tbody/tr/td[2]/div/iframe")));
//		    // driver.switchTo().frame("/html/body/table[2]/tbody/tr[1]/td/table/tbody/tr/td[2]/div/iframe3");
//		     Thread.sleep(20000);
//		     //driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td/table/tbody/tr/td[2]/div/iframe")).click();
//		     Thread.sleep(3000);
//		     driver.findElement(By.xpath("//td[contains(text(),\"Product:\")]/..//following-sibling::button")).sendKeys("IL Foreclosure | Cancelled - test | 11/04/2021 | 739368");
//		     
//		     //driver.findElement(By.xpath("//td[contains(text(),\"Product:\")]/..//following-sibling::button")).sendKeys(Keys.ENTER);
//		     
		     
		   //  driver.findElement(By.xpath("(/html/body/div[2]/table/tbody/tr[1]/td/form/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/span/button")).click();
//		     
//		     
//		     driver.findElement(By.xpath("driver.findElement(By.xpath(\"/html/body/table[2]/tbody/tr[1]/td/table/tbody/tr/td[2]/div/iframe\")).click();")).click();
//		     
//		     
		   // driver.findElement(By.tagName("//a[@class='toggleLink']")).click();

	}    
	
	
	
	@AfterTest
	public void tearDown() {
		System.out.println("Test");
		//driver.quit();
	}




}
