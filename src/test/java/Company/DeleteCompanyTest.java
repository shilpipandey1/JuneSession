package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCompanyTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void DeleteCompanyTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		//redirects to Companies section
		driver.findElement(By.xpath("(//a[normalize-space()='Companies'])[1]")).click();
//		Thread.sleep(3000);
//		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		//Click on Delete Company button
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[id='btnDelete'] span[class='ui-button-text']")).click();
//		Thread.sleep(4000);
		
		//Click on No button on Delete Company pop up
		driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='No'])[5]")).click();
		
		//Click on x on Delete Company pop up
	//	driver.findElement(By.xpath("(//span[normalize-space()='close'])[1]")).click();
		
		//Click on yes button Delete Company pop up
		
		//driver.switchTo().frame(driver.findElement(By.name("forum123")));
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//span[@class='ui-button-text'][normalize-space()='Yes'])[5]")).click();
		
		//click on ok button
	//	driver.findElement(By.xpath("(//button[@id='cleanblue_state0_buttonOk'])[1]")).click();

				
		//click on Create ADR Case button
	
   //  driver.findElement(By.xpath("(//span[normalize-space()='Create ADR Case'])[1]")).click();
     //click on x 
    // driver.switchTo().frame(driver.findElement(By.name("forum123")));
    // driver.findElement(By.xpath("(//span[normalize-space()='close']")).click();
		
		//Click on OK button
      //   driver.switchTo().frame(driver.findElement(By.name("forum123")));
	//	driver.findElement(By.xpath("(//span[@class='ui-button-text'])[24]")).click();
		
	}
		@AfterTest
		public void tearDown() {
			//System.out.println("Test");
			//driver.quit();

	}

}
