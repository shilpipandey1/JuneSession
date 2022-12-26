package Complaint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Test.com.qa.MRLP.pages.ComplaintPage;
//import Test.com.qa.MRLP.pages.MobileHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComplaintTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
}
	@Test
	public void ComplaintTest() throws InterruptedException
	{
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		driver.findElement(By.id("sFCFileNumber")).sendKeys("19-01650IL");
		//driver.findElement(By.id("sFCFileNumber")).sendKeys("file");
				
		driver.findElement(By.id("btnSearch")).click();
		//System.out.println("File Search is completed");
		
		ComplaintPage obj = new ComplaintPage(driver);
		
//		//clicking on mobile home button
//		obj.ClickMobileHomeButton();
//		Thread.sleep(3000);
//		
//		//switching frame
//		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		//click on Title Problem show/Hide link
		obj.ShowHideTittleProblem();
		
		//click on contacts show/Hide link
//		obj.ShowHideContacts();
//		
//		//click on Mortgagor show/Hide link
//		obj.ShowHideMortgagor();
//		
//		//click on Tax show/Hide link
//		obj.ShowHideTax();
//		
//		//Add Text to Mobile Home Notes text area
//		obj.MobileHomeNotes("Test String");
//		
//		//click on save button
//		obj.ClickonSave();	
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Test");
		//driver.quit();
	}


}
