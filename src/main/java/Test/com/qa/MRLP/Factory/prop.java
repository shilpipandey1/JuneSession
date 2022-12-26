package Test.com.qa.MRLP.Factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prop {
	
	public WebDriver driver;
	public static Properties prop;
	public OptionsManager optionsManager;

	
	
	
	public static void readproperties()  {
		Properties prop = new Properties();
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\SHILPI.PANDEY\\eclipse-workspace\\JavaTraining\\MRLPAutomation\\src\\test\\resourses\\config\\config.properties");
		    prop.load(input);
		    System.out.println(prop.getProperty("browser"));
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
		public static void writeproperties()  {
			
			try {
				OutputStream output = new FileOutputStream("C:\\Users\\SHILPI.PANDEY\\eclipse-workspace\\JavaTraining\\MRLPAutomation\\src\\test\\resourses\\config\\config.properties");
			     prop.setProperty("browser" , "chrome");
			     prop.store(output , "null");
			     
			} 
			
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	

}
