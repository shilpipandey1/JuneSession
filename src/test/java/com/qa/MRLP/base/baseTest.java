package com.qa.MRLP.base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import Test.com.qa.MRLP.Factory.DriverFactory;


public class baseTest {
	public WebDriver driver;
	public Properties prop;
	
	public DriverFactory df;
	
	public SoftAssert softAssert;
	
	@BeforeTest
	public void setup() throws IOException {
		df = new DriverFactory();
		
		prop = df.initProp();
		driver = df.initDriver(prop);
		
		softAssert = new SoftAssert();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
