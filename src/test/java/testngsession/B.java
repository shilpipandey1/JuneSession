package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B {
	public class A {
		
		WebDriver driver;

		@BeforeTest
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
			driver.manage().window().maximize();
		}
		
		@Test
public void DemoTest() throws InterruptedException {
		  
		    
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
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	    // js.executeScript("window.scrollBy(0,70)");            //Scroll Down(+ve)
//	     Thread.sleep(3000);
//	     System.out.println("Scrolled down..");  
//	     Thread.sleep(3000);
//				     //driver.findElement(By.xpath("//a[starts-with(@href, '#') and text() ='Show']"));
		//driver.findElement(By.partialLinkText("Show")).click();
	   //  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td/form/table/tbody/tr[15]/td/h3/a")).click();
	     
	     
					
					
//		 WebElement java = driver.findElement(By.xpath("//a[starts-with(@href, '#') and text() ='Show']"));
//	     
//	     JavascriptExecutor js1 = (JavascriptExecutor)driver;
//	       
//	        // Call the JavascriptExecutor methods
//	        js1.executeScript("arguments[0].click();", java);
	    // driver.findElement(By.xpath("//*[@id=\"BillingForm\"]/table/tbody/tr[8]/td/h3/span")).click();
		 
	     
	     driver.findElement(By.xpath("(//span[@title='Edit Charge'])[1]")).click();
	     driver.findElement(By.xpath("(//div[@id='2_txtComments___livespell_proxy'])[1]")).sendKeys("Test");
		 
			// driver.findElement(By.xpath("//label[normalize-space()='Expense Comment']")).sendKeys("Test");
			// driver.findElement(By.xpath("(//*[@id=\"txtNoExpenseDescription\"]")).sendKeys("Test");
//			 
			 //driver.findElement(By.xpath("(//span[@title='Edit Charge'])[1]")).click();
						 //driver.findElement(By.cssSelector("(button[class='focus']")).click();
			// driver.findElement(By.xpath("//*[@id=\"txtNoExpenseDescription\"]")).sendKeys("Test");
			 Thread.sleep(10000);
		 driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Save'])[1]")).click();
		 System.out.println("Edit Charge Passed");
		}
					
@AfterTest
					

public void tearDown()

{
						
	System.out.println("Test");
	//driver.quit();
				}
	}
}

