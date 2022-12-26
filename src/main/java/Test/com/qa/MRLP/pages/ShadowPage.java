package Test.com.qa.MRLP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Test.com.qa.MRLP.util.ElementUtil;

public class ShadowPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	// 1. By locator - OR
		private By frame1 = By.name("forum123");
		private By FileNo = By.id("sFCFileNumber");
		private By search = By.id("btnSearch");
		private By invoice = By.xpath("//a[normalize-space()='Invoice']");
		private By addbutton = By.xpath("//tbody/tr[19]/td[1]/h3[1]/span[1]");
		private By dropdown1 = By.xpath("//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[1]/span[1]/button");
		private By dropdown2 = By.xpath("//li[.='IL FC Advance']");
		private By dropdown3 = By.xpath("//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[3]/span[1]/button");
		private By dropdown4 = By.xpath("//li[.='Advance for Special Assessment']");
		private By dropdown5 = By.xpath("//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[9]/span[1]/button");
		private By dropdown6 = By.xpath("//*[@id=\\\"popup\\\"]/div/div[1]/ul/li[2]/span[1]/button");
//		private By dropdown7 = By.xpath("//input[@id='ufd-ddlProductList']");
//		private By dropdown8 = By.xpath("//input[@id='ufd-ddlProductList']");
//		private By txtAmount = By.xpath("//input[@name = 'txtAmount']");
		

}
