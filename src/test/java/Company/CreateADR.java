package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateADR {
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void CreateADRTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		//redirects to Companies section
		driver.findElement(By.xpath("(//a[normalize-space()='Companies'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
				
		//click on Create ADR Case button
	
   		driver.findElement(By.xpath("(//span[normalize-space()='Create ADR Case'])[1]")).click();
     //click on x 
    // driver.switchTo().frame(driver.findElement(By.name("forum123")));
   		Thread.sleep(4000);
     driver.findElement(By.xpath("(//span[normalize-space()='close'])[1]")).click();
		
		//Click on OK button
        // driver.switchTo().frame(driver.findElement(By.name("forum123")));
   	//	Thread.sleep(4000);
	  //   driver.findElement(By.xpath("(//span[@class='ui-button-text'])[24]")).click();
		
	}
		@AfterTest
		public void tearDown() {
			//System.out.println("Test");
			//driver.quit();

	}

}
