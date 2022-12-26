package FileInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewProductDetail {
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
		
				
		//click on View Product Detail
		driver.findElement(By.xpath("//tr[@id='3']//span[@title='View Product Detail'][normalize-space()='View Product Detail']")).click();
		//driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		//Click on cross x icon on View Product Detail pop up
		
          Thread.sleep(2000);
          
		//Click on Save button-Pass
	//	driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div[3]/button[2]")).click();
		
		//click on Cancel button on view Product Detail pop up- pass
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@title='Cancel'])[4]")).click();

}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Test");
		//driver.quit();
		
	}
}
