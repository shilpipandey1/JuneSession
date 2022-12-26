package Properties;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Test.com.qa.MRLP.pages.PropertiesPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PropertiesTest {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");		
}
	
	@Test
	public void Property() throws InterruptedException
	{
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		driver.findElement(By.id("sFCFileNumber")).sendKeys("19-01650IL");
		//driver.findElement(By.id("sFCFileNumber")).sendKeys("file");
				
		driver.findElement(By.id("btnSearch")).click();
		
		
		PropertiesPage prop1 = new PropertiesPage(driver);
		
		prop1.ClickProperty();
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		
		
		prop1.CountyTaxCommissioner();
		prop1.TitleInfo();
		prop1.LegalDescription();
		prop1.DescriptionIndexing();
		prop1.Save();
		
		
	
	
}

}
