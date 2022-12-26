package Test.com.qa.MRLP.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Test.com.qa.MRLP.constants.AppConstants;

//import Test.com.qa.MRLP.constants.AppConstants;

import Test.com.qa.MRLP.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.qameta.allure.Step;
//import io.qameta.allure.Step;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	// 1. By locator - OR
		private By frame1 = By.name("forum123");
		private By FileNo = By.id("sFCFileNumber");
		private By search = By.id("btnSearch");
		private By invoice = By.xpath("//a[normalize-space()='Invoice']");
		private By addbutton = By.xpath("//a[normalize-space()='Invoice']//*[@id=\\\"BillingForm\\\"]/table/tbody/tr[8]/td/h3/span");
		private By dropdown1 = By.xpath("//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[1]/span[1]/button");
		private By dropdown2 = By.xpath("//li[.='IL FC Advance']");
		private By dropdown3 = By.xpath("//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[3]/span[1]/button");
		private By dropdown4 = By.xpath("//li[.='Advance for Special Assessment']");
		private By dropdown5 = By.xpath("//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[9]/span[1]/button");
		private By dropdown6 = By.xpath("//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[2]/span[1]/button");
//		private By dropdown7 = By.xpath("//input[@id='ufd-ddlProductList']");
//		private By dropdown8 = By.xpath("//input[@id='ufd-ddlProductList']");
//		private By txtAmount = By.xpath("//input[@name = 'txtAmount']");
//		
//		private By dropdown7 = By.xpath("//li[.='Advance for Special Assessment']//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[2]/span[1]/button");
//		private By dropdown8 = By.xpath("//input[@id='ufd-ddlProductList']");
//		private By txtAmount = By.xpath("//input[@name = 'txtAmount']");
		private By txtQuantity = By.xpath("//input[@name = 'txtQuantity']");
		private By savebutton1 = By.xpath("//span[@class='ui-button-text'][normalize-space()='Save'])[1]");
		
		private By cancelbutton = By.xpath("//button[@id='cleanblue_state0_buttonNo']");
		private By editcharge = By.xpath("//span[@title='Edit Charge'])[1]");
		private By textbox = By.xpath("//div[@id='2_txtComments___livespell_proxy'])[1]");
		private By savebutton2 = By.xpath("//span[@class='ui-button-text'][normalize-space()='Save'])[1]");
		private By deletelineitem = By.xpath("//span[@title='Delete Line Item'])[1]");
		private By cancelbutton2 = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td/form/table/tbody/tr[9]/td/table/tbody/tr[3]/td/div/table/tbody/tr/td/div[1]/div[3]/div[3]/div/table/tbody/tr[2]/td[13]/span[2]");
		private By cancelbutton3 = By.xpath("//span[@class='ui-button-text'][normalize-space()='x'])[2]");
		private By reason = By.xpath("//input[@id='Reason']");
		private By okbutton = By.xpath("//button[@id='cleanblue_state0_buttonOk']");
		
	// 2. page class constructor....
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			eleUtil = new ElementUtil(driver);
		}

		

//		@Step("getting login page url")
//		public String getLoginPageUrl() {
//			String url = eleUtil.waitForUrl(AppConstants.SMALL_DEFAULT_TIME_OUT, AppConstants.LOGIN_PAGE_URL_FRACTION);
//			System.out.println("login page url : " + url);
//			return url;
//		}
		
//		public boolean userInvoice() {
//
//			eleUtil.doSendKeysWithWait(this.firstName, AppConstants.MEDIUM_DEFAULT_TIME_OUT, firstName);
//			
//			eleUtil.doSendKeys(this.lastName, lastName);
//			eleUtil.doSendKeys(this.email, email);
//			eleUtil.doSendKeys(this.telephone, phone);
//			eleUtil.doSendKeys(this.password, password);
//			eleUtil.doSendKeys(this.confirmpassword, password);
//
		   //  eleUtil.doClick(this.agreeCheckBox);
		
		//click on MH title info show link
//		public void ShowHideMHTittleInfo() throws InterruptedException
//		{		
//			driver.findElement(ShowMHTittleInfo).click();
//			Thread.sleep(3000);
//			
//			driver.findElement(HideMHTittleInfo).click();
//			Thread.sleep(3000);
//					
//		}		
//

		
}
