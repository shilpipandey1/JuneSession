package FileInfo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewContact {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void ViewContactTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
	
			
		//Click on View Contacts-need to look on clicking window pop up
          
         // driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		driver.findElement(By.xpath("(//span[@title='View Contacts'][normalize-space()='View Contacts'])[3]")).click();
		  Thread.sleep(4000);
		 // driver.switchTo().alert().accept();
		  
		  Alert alert = driver.switchTo().alert();		
  		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(2000);
	        		
	        // Accepting alert		
	        alert.accept();		
		  Actions builder = new Actions(driver);        
          builder.sendKeys(Keys.ENTER);

}
	
	@AfterTest
	public void tearDown() {
		
	   driver.quit();
	}
}
