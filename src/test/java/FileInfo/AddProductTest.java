package FileInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProductTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void AddProductTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		// click on Refresh button
        
         driver.findElement(By.xpath("//span[@title='Refresh']")).click();
         
         // Click on Add button
         
         driver.findElement(By.xpath("//span[@title='Add Product Referral']")).click();
         driver.findElement(By.xpath("//select[@id='ProductList']")).click();
         
         Select addproduct = new Select(driver.findElement(By.id("ProductList")));
 		// Selecting value from dropdown product
         addproduct.selectByIndex(2);
         
         // Clicking on save button-p
         
        // driver.findElement(By.xpath("//button[@onclick='javascript:IsCancelledProductExist();']")).click();
         
         //clicking on Cancel button-p
         
       //  driver.findElement(By.xpath("(//button[@title='Cancel'])[2]")).click();
         
         //click on x on Add product pop up
         
         driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='x'])[2]")).click();
         
         //click on Save button on Product Info screen
         
         driver.findElement(By.xpath("(//button[@id='action'])[1]")).click();
	}        
	
	@AfterTest
	public void tearDown() {
		System.out.println("Test");
		//driver.quit();
	}

}
