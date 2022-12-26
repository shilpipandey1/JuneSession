package Test.com.qa.MRLP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PropertiesPage {
WebDriver driver = null;
	
	public PropertiesPage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	//initializing locators
	
	By ClickProperty = By.xpath("//a[normalize-space()='Property']");
	
	By CountyTaxCommissioner = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[2]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/h3[1]/a[1]");
	
	By TitleInformation  = By.xpath("//tbody/tr/td[@align='left']/h3[@class='section']/a[1]");
	
	By LegalDescription = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[2]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[7]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/h3[1]/a[1]");
	
	By DescriptionIndexing = By.cssSelector("td[class='bgHeader'] a[class='toggleLink']");
			
	By Save = By.xpath("//button[@id='action']");
	
	
	
	//Defining Function
	
	
	//click on property button
	
	public void ClickProperty() throws InterruptedException
	{
		driver.findElement(ClickProperty).click();
		Thread.sleep(3000);
	}
	
	
	//click on Show/Hide County Tax Commissioner
	public void CountyTaxCommissioner() throws InterruptedException
	{
		driver.findElement(CountyTaxCommissioner).click();;
		Thread.sleep(3000);
		
		driver.findElement(CountyTaxCommissioner).click();;
		Thread.sleep(3000);
		
		
	}
	
	//click on Show/Hide Title Information 
	
	public void TitleInfo() throws InterruptedException
	{
		driver.findElement(TitleInformation).click();;
		Thread.sleep(3000);
		
		driver.findElement(TitleInformation).click();;
		Thread.sleep(3000);
		
		
		
	}
	
	
	//click on Show/Hide Legal Description 
	
	public void LegalDescription() throws InterruptedException
	{
		driver.findElement(LegalDescription).click();;
		Thread.sleep(3000);
		
		driver.findElement(LegalDescription).click();;
		Thread.sleep(3000);

		
		
	}
	
	//click on ShowHide Description Indexing 
	
	public void DescriptionIndexing() throws InterruptedException
	{
		driver.findElement(DescriptionIndexing).click();;
		Thread.sleep(3000);
		
		driver.findElement(DescriptionIndexing).click();;
		Thread.sleep(3000);
		
		
	}
	
	//click on save button 
	
	public void Save()
	{
		driver.findElement(Save).click();
	}
	

}
