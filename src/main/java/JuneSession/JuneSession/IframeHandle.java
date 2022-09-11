package JuneSession.JuneSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//Browser

		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page

		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("1977");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Maruti");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys(" 800");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys(" Green ");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys(" 800");

		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("123333");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Naveen");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys(" Address");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys(" 800");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys(" TEst");
		driver.findElement(By.id("RESULT_TextField-13")).sendKeys(" 50123");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys(" 1234567890");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("test@yopmail.com");
		
		driver.switchTo().defaultContent();//come back to the main page
		
}
}
