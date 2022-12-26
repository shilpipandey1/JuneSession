package Complaint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class complaint1 {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void TransferServiceTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		//redirects to Complaint section
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Complaint']")).click();
//		//Click on Transfer Service button
//		
//		driver.switchTo().frame(driver.findElement(By.name("forum123")));
//		driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Transfer Servicer'])[1]")).click();
//		
//		//click on Cancel button.
//		//driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Cancel'])[2]")).click();
//		
//		//Selecting Is all billing complete for the Current Client? checkbox
//		
//		 WebElement option1 = driver.findElement(By.xpath("(//input[@id='chkBillingComplete'])[1]"));							
//
//	        // This will Toggle the Check box 		
//	        option1.click();			
	}
	
	@AfterTest
	public void tearDown() {
	  driver.quit();
	}

}
