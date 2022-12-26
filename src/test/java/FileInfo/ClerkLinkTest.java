package FileInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClerkLinkTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void FileInfoTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
			
       
          //click on clerkLink- need to look
         // driver.switchTo().frame(driver.findElement(By.name("forum123")));
          Thread.sleep(2000);
          driver.findElement(By.cssSelector("tr[id='3'] span[title='ClerkLink']")).click();
          

}
	
	@AfterTest
	public void tearDown() {
		
	   driver.quit();
	}
}
