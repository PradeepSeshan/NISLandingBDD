package LandingBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.apache.commons.io.FileUtils;
import Dataprovider.ConfigFileReader;

public class LandingBase {
	public static WebDriver driver;
	
	ConfigFileReader configFileReader= new ConfigFileReader();
	
	public static void initialization(){
		String browserName = ConfigFileReader.browserName();
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",ConfigFileReader.getDriverPath());	
			driver = new ChromeDriver(); 
			System.out.println("Executing on chrome");
			driver.manage().window().maximize();
			driver.get(ConfigFileReader.getApplicationUrl());
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\1187335\\Downloads\\geckodriver");	
			driver = new FirefoxDriver(); 
			System.out.println("Executing on firefox");
			driver.manage().window().maximize();
			driver.get(ConfigFileReader.getApplicationUrl());
		}
		
		else if(browserName.equals("htmldriver")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\1187335\\Downloads\\geckodriver");	
			driver = new HtmlUnitDriver(); 
			System.out.println("Executing on html unit driver");
			driver.manage().window().maximize();
			driver.get(ConfigFileReader.getApplicationUrl());
     }
	}
	
	public static void captureScreenshot(String fileName,String extension)throws IOException
	{

	// Take the screenshot and store as file format
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	// Open the current date and time
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

	//Copy the screenshot on the desire location with different name using current date and time
	FileUtils.copyFile(scrFile, new File("C:/shots/" + fileName+" "+timestamp+extension));
}
	
}
