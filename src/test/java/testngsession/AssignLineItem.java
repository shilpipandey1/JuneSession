package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignLineItem {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void AssignLineItemTest() throws InterruptedException {
		
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
			         
			               
		      		   
//			   //Assign Line Item
			   
			   
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
