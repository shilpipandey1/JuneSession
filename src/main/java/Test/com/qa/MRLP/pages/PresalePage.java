package Test.com.qa.MRLP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PresalePage {

WebDriver driver = null;
	
	public  PresalePage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	//initializing locators
	
	By PreSaleButton = By.xpath("//a[normalize-space()='Presale']");
	

	//By ShowHidePartyInfo = By.xpath("By ShowHidePartyInfo = By.xpath(\"//td[@nowrap='nowrap']//a[@class='toggleLink'][normalize-space()='Show']\");");
	
	By ShowHidePartyInfo = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/h3[1]/a[1]");
	
	By ShowHideAddress= By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/h3[1]/a[1]");
	
	By ShowHideProperty = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/h3[1]/a[1]");
	
	By ShowHideLegalDescription = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/h3[1]/a[1]");
	
	//By DescriptionIndexing = By.xpath("//td[@class='bgHeader']//a[@class='toggleLink'][normalize-space()='Show']");
	
	By DescriptionIndexing = By.cssSelector("td[class='bgHeader'] a[class='toggleLink']");
	
	By LoanInfo = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/h3[1]/a[1]");
	
	By ShowHideClient = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[2]/tbody[1]/tr[3]/td[1]/h3[1]/a[1]");
	
	By ShowHideDates = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[2]/tbody[1]/tr[5]/td[1]/h3[1]/a[1]");
	
	By ShowHideSimultaneousForeClosure = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[2]/tbody[1]/tr[7]/td[1]/h3[1]/a[1]");
	
	By ShowHideTwoCountySale = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[2]/tbody[1]/tr[9]/td[1]/h3[1]/a[1]");
	
	By ShowHideTrusteeInformation= By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[2]/tbody[1]/tr[11]/td[1]/h3[1]/a[1]");
	
	By Save = By.id("action");
	
	By DeleteParty = By.id("btnDeleteParty");
	
	By DeletePopupYes = By.id("cleanblue_state0_buttonYes");
	
	By DeletePopupNo = By.id("cleanblue_state0_buttonNo");
	
	By DeletePopupCross = By.xpath("//div[@class='cleanblueclose']");
	
	By OkonDeleteSuccessful = By.id("cleanblue_state0_buttonOk");
	
	By OkonSelectParty = By.id("cleanblue_state0_buttonOk");
			
	
	
	
	//Defining Methods
	
	//click on delete party button
	
	public void DeleteParty() throws InterruptedException
	{
	//click on delete party button	
	driver.findElement(DeleteParty).click();
	Thread.sleep(2000);
	
	//click on NO button on delete party popup
	driver.findElement(DeletePopupNo).click();
	Thread.sleep(3000);
		
	//click on delete party button
	driver.findElement(DeleteParty).click();
	Thread.sleep(3000);
	
	//click on x button on delete party popup
	driver.findElement(DeletePopupCross).click();
	Thread.sleep(3000);
	
	//click on delete party button
	driver.findElement(DeleteParty).click();
	Thread.sleep(3000);
		
	//click on Yes on delete party popup
	driver.findElement(DeletePopupYes).click();
	Thread.sleep(3000);
	
	//click on ok on party delete successful
	driver.findElement(OkonDeleteSuccessful).click();
	Thread.sleep(3000);
	
	}
	
	
	public void ClickOnPreSaleButton() throws InterruptedException
	{
	driver.findElement(PreSaleButton).click();
	Thread.sleep(3000);	
	}
	
	//click on show/hide link for party information
	
	public	void ShowHidePartyInformation() throws InterruptedException
	{
		driver.findElement(ShowHidePartyInfo).click();;		
		Thread.sleep(3000);
		driver.findElement(ShowHidePartyInfo).click();;	
		Thread.sleep(3000);
	}
	
	//click on show/Hide link for Address information
	
	public void ShowHideAddressinfo() throws InterruptedException
	{
		driver.findElement(ShowHideAddress).click();
		Thread.sleep(3000);
		driver.findElement(ShowHideAddress).click();
		Thread.sleep(3000);
	}
	
	//click on show/hide link for property
	
	public void ShowHideProperty() throws InterruptedException
	{
		driver.findElement(ShowHideProperty).click();
		Thread.sleep(3000);
		driver.findElement(ShowHideProperty).click();
		Thread.sleep(3000);
	}
	
	//click on show/hide link for legal description
	
	public void ShowHideLegalDescription() throws InterruptedException
	{
		driver.findElement(ShowHideLegalDescription).click();
		Thread.sleep(3000);
		driver.findElement(ShowHideLegalDescription).click();
		Thread.sleep(3000);
		
	}
	
	//click on Show/Hide link for description Indexing
	
	public void DescriptionIndexing() throws InterruptedException
	{
		driver.findElement(DescriptionIndexing).click();
		Thread.sleep(3000);
		driver.findElement(DescriptionIndexing).click();
		Thread.sleep(3000);
		
	}
	//click on Show/Hide link for loan info
	public void LoanInfo() throws InterruptedException
	{
		driver.findElement(LoanInfo).click();
		Thread.sleep(3000);
		driver.findElement(LoanInfo).click();
		Thread.sleep(3000);
		
	}
	
	//click on show/hide link for client
	public void Client() throws InterruptedException
	{
		driver.findElement(ShowHideClient).click();
		Thread.sleep(3000);
		driver.findElement(ShowHideClient).click();
		Thread.sleep(3000);
		
	}
	
	//click on Show/Hide Dates
	public void Dates() throws InterruptedException
	{
		driver.findElement(ShowHideDates).click();
		Thread.sleep(3000);
		driver.findElement(ShowHideDates).click();
		Thread.sleep(3000);		
	}
	
	//Click on Show/Hide Simultaneous ForeClosure
	public void SimultaneousForeClosure() throws InterruptedException
	{
		driver.findElement(ShowHideSimultaneousForeClosure).click();
		Thread.sleep(3000);
		driver.findElement(ShowHideSimultaneousForeClosure).click();
		Thread.sleep(3000);		
	}
	
	//click on Show/Hide 2-county sale
	
	public void TwoCountySale() throws InterruptedException
	{
		driver.findElement(ShowHideTwoCountySale).click();
		Thread.sleep(3000);
		driver.findElement(ShowHideTwoCountySale).click();
		Thread.sleep(3000);		
	}
	
	//click on ShowHide Trustee Information
	public void TrusteeInformation() throws InterruptedException
	{
		driver.findElement(ShowHideTrusteeInformation).click();
		Thread.sleep(3000);
		driver.findElement(ShowHideTrusteeInformation).click();
		Thread.sleep(3000);		
	}
	
	//click on Save button
	public void Save() throws InterruptedException
	{
		driver.findElement(Save).click();
		Thread.sleep(3000);
	}
	
}
