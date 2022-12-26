package Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddNote1 {
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
       //click on Notes Hide link
        
        driver.findElement(By.xpath("//tbody/tr/td/h3[@class='section']/a[1]")).click();
        
        //click on Notes Show link
        //driver.switchTo().frame(driver.findElement(By.name("forum123")));
       driver.findElement(By.xpath("//a[normalize-space()='Show']")).click();
       
       //click on switchonNew button
     //  driver.findElement(By.xpath("//input[@id='btnSwitchNotesView']")).click();
       
     //click on switchonNew button
       driver.findElement(By.xpath("//input[@id='btnSwitchNotesView']")).click();
       
       //click on Add Note button
       
    driver.findElement(By.xpath("//*[@id=\"bnAddNote\"]")).click();
       
     //Enter text in Note text
    		driver.findElement(By.xpath("(//textarea[@id='MainContent_noteDialog_noteText'])[1]")).sendKeys("Test");
//     		
    		//Selecting Alert Check box     		
//     		
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
             
             //Click on OK button on Add Note pop up
             // driver.findElement(By.cssSelector("button[id='btnSave'] span[class='ui-button-text']")).click();
              
              //Click on Cancel button on Add Note pop up
             driver.findElement(By.xpath("(//button[@onclick='closeNote()'])[1]")).click();
              
            //Click on x on Add Note pop up
            //  driver.findElement(By.xpath("(//span[normalize-space()='close'])[1]")).click();
       
           
       

//      WebElement ele = driver.findElement(By.xpath("(//a[normalize-space()='Show'])[1]"));
//	     JavascriptExecutor jse = (JavascriptExecutor)driver;
//     jse.executeScript("arguments[0].click()", ele);
//     Thread.sleep(5000);
//	     
//         driver.findElement(By.xpath("(//input[@id='ufd-noteTypeView'])[1]")).click();
//          
//          driver.findElement(By.cssSelector("div[class='list-wrapper'] li[name='63']")).click();
//     
       //click on Selected Note Text Hide link
      
     driver.findElement(By.cssSelector("tr[id='idSelectTextRow'] a[class='toggleLink']")).click();
       
     //click on Selected Note Text Show link
       
       Thread.sleep(4000);
       
       driver.findElement(By.xpath("//*[@id=\"idSelectTextRow\"]/td/div/h3/a")).click();
       
	}
	
	@AfterTest
	public void tearDown() {
		//System.out.println("Test");
		//driver.quit();

	}

}
