package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompanyTest {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(""
				+ "http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void CompanyTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		//redirects to Companies section
		driver.findElement(By.xpath("(//a[normalize-space()='Companies'])[1]")).click();
//		Thread.sleep(3000);
//		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		//Click on Add Company button
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		driver.findElement(By.xpath("//*[@id=\"btnAddCompany\"]")).click();
	Thread.sleep(4000);
		
		//Click on Close button Add Company pop up
		//driver.findElement(By.xpath("(//button[@id='btnClose_Add'])[1]")).click();
		
		//Click on x on Add Company pop up
	//	driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		
		//Click on ok button on Add Company pop up
		
		//driver.switchTo().frame(driver.findElement(By.name("forum123")));
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//span[normalize-space()='Ok'])[1]")).click();
		
		//selecting value from Abbreviation drop down.
		
	 //  Select Abbre = new Select(driver.findElement(By.xpath("//*[@id=\"ufd-ddlClientList_Add\"]")));
		//Abbre.selectByIndex(2);
	
	driver.findElement(By.xpath("(//button[@type='button'])[26]")).click();
	Thread.sleep(4000);
	//driver.switchTo().frame(driver.findElement(By.name("forum123")));
	driver.findElement(By.xpath("(//*[@id=\"ufd-container\"]/div[5]/div/div/ul/li[2]")).click();
		
		//enter value in Loan#
		driver.findElement(By.xpath("(//input[@id='txtLoanNum_Add'])[1]")).sendKeys("12345");
		
		//enter value in Alternate#
		driver.findElement(By.xpath("(//input[@id='txtAlternateNumber_Add'])[1]")).sendKeys("12345");
		
		
		//Selecting Investor Check box
		
       WebElement option1 = driver.findElement(By.xpath("//input[@id='chkInvestor_Add']"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Investor checkbox is Toggled On");					

        } else {			
            System.out.println("Investor checkbox is Toggled Off");					
        }	
		
		//Selecting FC checkbox
        WebElement option2 = driver.findElement(By.xpath("(//input[@id='chkFC_Add'])[1]"));							

        // This will Toggle the Check box 		
        option2.click();			

        // Check whether the Check box is toggled on 		
        if (option2.isSelected()) {					
            System.out.println("FC checkbox is Toggled On");					

        } else {			
            System.out.println("FC checkbox is Toggled Off");					
        }	
        
               
      //Selecting OutSuorcer checkbox
        WebElement option3 = driver.findElement(By.xpath("//*[@id=\"chkOutsourcer_Add\"]"));							

        // This will Toggle the Check box 		
        option3.click();			

        // Check whether the Check box is toggled on 		
        if (option3.isSelected()) {					
            System.out.println("OutSuorcer checkbox is Toggled On");					

        } else {			
            System.out.println("OutSuorcer checkbox is Toggled Off");					
        }	
        
      //Selecting EV Client checkbox
        WebElement option4 = driver.findElement(By.xpath("//*[@id=\"chkEvClient_Add\"]"));							

        // This will Toggle the Check box 		
        option4.click();			

        // Check whether the Check box is toggled on 		
        if (option4.isSelected()) {					
            System.out.println("EV Client checkbox is Toggled On");					

        } else {			
            System.out.println("EV Client checkbox is Toggled Off");					
        }	
        
       
        //Selecting MH client checkbox
        WebElement option5 =driver.findElement(By.xpath("//*[@id=\"chkMHClient_Add\"]"));							

        // This will Toggle the Check box 		
        option5.click();

        // Check whether the Check box is toggled on 		
        if (option5.isSelected()) {					
            System.out.println(" MH client checkbox is Toggled On");					

        } else {			
            System.out.println(" MH client checkbox is Toggled Off");					
        }
        
        //Selecting NP client checkbox
        WebElement option6 =driver.findElement(By.xpath("//*[@id=\"chkNPClient_Add\"]"));							

        // This will Toggle the Check box 		
        option6.click();

        // Check whether the Check box is toggled on 		
        if (option6.isSelected()) {					
            System.out.println(" NP clientt checkbox is Toggled On");					

        } else {			
            System.out.println(" NP clientt checkbox is Toggled Off");					
        }
        
        
//        //Select value from Note Type drop down- Fail
//        
//        
////        Select notetype = new Select(driver.findElement(By.xpath("//input[@id='ufd-noteType']")));
//        
//      //  Select notetype = new Select(
//        		
//       // driver.findElement(By.cssSelector("#ufd-noteType")).click();
//        Thread.sleep(4000);
//       // driver.switchTo().frame(driver.findElement(By.name("forum123")));
//       // driver.findElement(By.xpath("//li[@name='62'][normalize-space()='Talked to Clerk / Judge']")).click();
//        
//// 		 //Selecting value from department product
//       // notetype.selectByIndex(2);
//        
//        //select value from product Type drop down
//       // driver.findElement(By.xpath("(//button[@class='focus'])[1]")).click();
//        
//        
//        //Click on OK button on Add Note pop up
//       // driver.findElement(By.cssSelector("button[id='btnSave'] span[class='ui-button-text']")).click();
//        
//        //Click on Cancel button
//       // driver.findElement(By.xpath("(//button[@onclick='closeNote()'])[1]")).click();
//        
//        //click on Notes Hide link
//        
//        driver.findElement(By.xpath("//tbody/tr/td/h3[@class='section']/a[1]")).click();
//        
//        //click on Notes Show link
//        
//       driver.findElement(By.cssSelector("(tbody tr td h3[class='section'] a:nth-child(1)")).click();

//        WebElement ele = driver.findElement(By.xpath("(//a[normalize-space()='Show'])[1]"));
//	     JavascriptExecutor jse = (JavascriptExecutor)driver;
//	     jse.executeScript("arguments[0].click()", ele);
//	     Thread.sleep(5000);
	     
	}
	
	@AfterTest
	public void tearDown() {
		//System.out.println("Test");
		//driver.quit();

}

}
