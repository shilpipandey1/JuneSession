package Test.com.qa.MRLP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileHomePage {
WebDriver driver = null;
	
	public MobileHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//initializing locators	
	
	By MobileHomeButton = By.xpath("//a[normalize-space()='Mobile Home']");
	
	By ShowMHTittleInfo = By.xpath("//a[@class='StoggleLink']");
	
	By HideMHTittleInfo = By.xpath("//a[@class='StoggleLink']");
	
	By ShowContacts = By.xpath("//a[@class='cInftoggleLink']");
	
	By HideContacts = By.xpath("//a[@class='cInftoggleLink']");
	
	By ShowMortgagor = By.xpath("//a[@class='MotoggleLink']");
	
	By HideMortgagor = By.xpath("//a[@class='MotoggleLink']");
	
	By ShowTax = By.xpath("//a[@class='TxStoggleLink']");
	
	By HideTax = By.xpath("//a[@class='TxStoggleLink']");	
	
	By SaveButton = By.xpath("//button[@id='action']");
	
	By MobileHomeNotes = By.id("MobileHome_Notes");
	

	
	//Defining Methods
	
	//click on Mobile Home Button
	public void ClickMobileHomeButton() throws InterruptedException
	{
		System.out.println(ShowMHTittleInfo);
		driver.findElement(MobileHomeButton).click();
		Thread.sleep(3000);
	}
		
	//click on MH title info show link
	public void ShowHideMHTittleInfo() throws InterruptedException
	{		
		driver.findElement(ShowMHTittleInfo).click();
		Thread.sleep(3000);
		
		driver.findElement(HideMHTittleInfo).click();
		Thread.sleep(3000);
				
	}		
	
	
	
	public void ShowHideContacts() throws InterruptedException
	{
		driver.findElement(ShowContacts).click();
		Thread.sleep(3000);
		
		driver.findElement(HideContacts).click();
		Thread.sleep(3000);
	}
	
	public void ShowHideMortgagor() throws InterruptedException
	{
		driver.findElement(ShowMortgagor).click();
		Thread.sleep(3000);
		
		driver.findElement(HideMortgagor).click();
		Thread.sleep(3000);
	}
	
	public void ShowHideTax() throws InterruptedException
	{
		driver.findElement(ShowTax).click();
		Thread.sleep(3000);
		
		driver.findElement(HideTax).click();
		Thread.sleep(3000);
	}
	
	
	public void MobileHomeNotes(String text) throws InterruptedException
	{
		driver.findElement(MobileHomeNotes).sendKeys(text);;
		Thread.sleep(3000);
	}
	
	
	public void ClickonSave()
	{
		driver.findElement(SaveButton).click();
	}

}
