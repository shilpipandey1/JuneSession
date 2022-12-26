package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BT {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
	}
	
	@Test
	public void BTTest() throws InterruptedException {
		
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
			     Thread.sleep(3000);
			     //Edit Budget TRacking
//		        driver.findElement(By.xpath("(//span[@title='Edit'][normalize-space()='Edit'])[1]")).click();
//		        driver.findElement(By.cssSelector("form[id='EditBudgetForm'] button[title='Save']")).click();	
//		        
			     
               //view Line Item
			     
			     driver.findElement(By.xpath("//*[@id=\"1\"]/td[10]/span[3]")).click();
			     Thread.sleep(4000);
			     driver.findElement(By.xpath("//button[@onclick='javascript:validateLineItemFields();return false;']")).click();
		       
	}
	
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}


}
