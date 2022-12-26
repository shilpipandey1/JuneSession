package PreSale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Test.com.qa.MRLP.pages.PresalePage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PreSaleTest {
	
WebDriver driver;
	

@BeforeTest
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");		//to read from cofig file*
}
@Test
public void PreSales() throws InterruptedException
{
	driver.switchTo().frame(driver.findElement(By.name("forum123")));
	
	driver.findElement(By.id("sFCFileNumber")).sendKeys("19-01650IL");
	//driver.findElement(By.id("sFCFileNumber")).sendKeys("file");
			
	driver.findElement(By.id("btnSearch")).click();
	
	PresalePage presale = new PresalePage(driver);
	
	
	//click on PreSales button
	presale.ClickOnPreSaleButton();
	
	//switching frame
	driver.switchTo().frame(driver.findElement(By.name("forum123")));
	
	
	//click on party Show/Hide link
	presale.DeleteParty();
	presale.ShowHidePartyInformation();
	presale.ShowHideAddressinfo();
	presale.ShowHideProperty();
	presale.ShowHideLegalDescription();
	presale.DescriptionIndexing();
	presale.LoanInfo();
	presale.Client();
	presale.Dates();
	presale.SimultaneousForeClosure();
	presale.TwoCountySale();
	presale.TrusteeInformation();
	presale.Save();

	
}

	

	

}
