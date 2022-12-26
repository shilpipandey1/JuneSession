package Notes;

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

public class AddNote {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://appdev.mrlp%5Cspandey:1TimeCap%21@fms.appdev.mrlp:82/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void NoteTest() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.name("forum123")));

		driver.findElement(By.id("sFCFileNumber")).sendKeys("20-01821CT");
		
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("File Search is completed");
		//Clicking on Alert Ok button
		
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		//redirects to Notes section
		driver.findElement(By.xpath("(//a[normalize-space()='Notes'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.name("forum123")));
		//Click on + button
		driver.findElement(By.xpath("(//span[@title='Add'])[1]")).click();
		Thread.sleep(4000);
		//Enter text in Note text
		driver.findElement(By.xpath("(//textarea[@id='MainContent_noteDialog_noteText'])[1]")).sendKeys("Test");
		
		//Selecting Alert Check box
		
		
        WebElement option1 = driver.findElement(By.xpath("//input[@id='noteAlert']"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Alert checkbox is Toggled On");					

        } else {			
            System.out.println("Alert checkbox is Toggled Off");					
        }	
		
		//Selecting Followup checkbox
        WebElement option2 = driver.findElement(By.xpath("//input[@id='followUp']"));							

        // This will Toggle the Check box 		
        option2.click();			

        // Check whether the Check box is toggled on 		
        if (option2.isSelected()) {					
            System.out.println(" Followup checkbox is Toggled On");					

        } else {			
            System.out.println("Followup checkbox is Toggled Off");					
        }	
        
        
        //Select value from Note Type drop down- Fail
        
        
     // Select notetype = new Select(driver.findElement(By.xpath("//input[@id='ufd-noteType']")));
        
      //  Select notetype = new Select(
        		
      //  driver.findElement(By.cssSelector("#ufd-noteType")).click();
      //  Thread.sleep(4000);
       // driver.switchTo().frame(driver.findElement(By.name("forum123")));
        driver.findElement(By.xpath("//li[@name='62'][normalize-space()='Talked to Clerk / Judge']")).click();
        
		 //Selecting value from department product
     //  notetype.selectByIndex(2);
        
        //select value from product Type drop down
     //   Thread.sleep(4000);
      //  driver.findElement(By.xpath("(//input[@id='ufd-productListDialog'])[1]")).click();
      //  driver.findElement(By.xpath("(//li[@class='active'][normalize-space()='IL Foreclosure | 739368'])[1]")).click();
        
        
       // driver.findElement(By.xpath("(//button[@class='focus'])[1]")).click();
        
        
        //Click on OK button on Add Note pop up
       // driver.findElement(By.cssSelector("button[id='btnSave'] span[class='ui-button-text']")).click();
        
        //Click on Cancel button
        driver.findElement(By.xpath("(//button[@onclick='closeNote()'])[1]")).click();
        
        //click on Notes Hide link
        
      //  driver.findElement(By.xpath("//tbody/tr/td/h3[@class='section']/a[1]")).click();
        
        //click on Notes Show link
        
      // driver.findElement(By.cssSelector("(tbody tr td h3[class='section'] a:nth-child(1)")).click();

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
