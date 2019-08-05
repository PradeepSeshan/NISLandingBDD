package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Dataprovider.ConfigFileReader;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@Test
public class Stepdefinition {
	public static WebDriver driver;
	ConfigFileReader configFileReader= new ConfigFileReader();
	
	@When("^User is in the login page$") 	
	public void user_is_in_the_login_page(){
		
		System.setProperty("webdriver.chrome.driver" ,ConfigFileReader.getDriverPath());
		 driver = new ChromeDriver();
		 driver.get(ConfigFileReader.getApplicationUrl());
		 driver.manage().window().maximize();

		}
	
	
	
    @Then("^User enters username and password$")
	public void user_enters_username_and_password()  {
		driver.manage().timeouts().implicitlyWait(ConfigFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@name='USER'])[1]")).sendKeys(ConfigFileReader.username());
		driver.findElement(By.xpath("(//input[@name='PASSWORD'])[1]")).sendKeys(ConfigFileReader.password());
		
	}
    
    
    
    @Then("^Message displayed login successfully$")
	public void message_displayed_login_successfully()  {
		driver.manage().timeouts().implicitlyWait(ConfigFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@class='green'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(ConfigFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		}
    
    
    
    
    @Then("^Verify the UI of landing home page$")
	public void verify_the_UI_of_landing_home_page()  {
		driver.manage().timeouts().implicitlyWait(ConfigFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		
		
		//Home Button
	      boolean HomeButtonDisplayed = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-home']")).isDisplayed();
	     
	      boolean HomeButtonEnabled = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-home']")).isEnabled();
	      
	      if (HomeButtonDisplayed== true & HomeButtonEnabled==true )
	      {
	       System.out.println("Homebutton is present on the page");
	    
	        }
	      else
	      {
	       System.out.println("\"\\Homebutton is not present on the page\"");
	     
	      }
	      
	      //Report Button
	      boolean ReportButtonDisplayed = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-reports']")).isDisplayed();
		     
	      boolean ReportButtonEnabled = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-reports']")).isEnabled();
	      
	      if (ReportButtonDisplayed== true & ReportButtonEnabled==true )
	      {
	       System.out.println("Reportbutton is present on the page");
	      }
	      else
	      {
	       System.out.println("\"\\Reportbutton is not present on the page\"");
	      }
	      
	      //Indicator Tab
	      boolean IndicatorTabDisplayed = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-reports']")).isDisplayed();
		     
	      boolean IndicatorTabEnabled = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-reports']")).isEnabled();
	      
	      if (IndicatorTabDisplayed== true & IndicatorTabEnabled==true )
	      {
	       System.out.println("Indicator Tab is present on the page");
	      }
	      else
	      {
	       System.out.println("\"\\Indicator Tab is not present on the page\"");
	       }
	      
	      //Project Tab
          boolean ProjectTabDisplayed = driver.findElement(By.xpath("//a[@class='projectlink arrow-position']")).isDisplayed(); 
    
          boolean ProjectTabEnabled = driver.findElement(By.xpath("//a[@class='projectlink arrow-position']")).isEnabled(); 
   
  
         if (ProjectTabDisplayed== true & ProjectTabEnabled == true )
         {
           System.out.println("Project Tab is present on the page");
          }
         else
         {
          System.out.println("\"\\Project Tab is not present on the page\"");
          }
         
	      //Preferences Button
          boolean PreferencesButtonDisplayed = driver.findElement(By.xpath("//div[@title=\'Preferences\']")).isDisplayed(); 
    
          boolean PreferencesButtonEnabled = driver.findElement(By.xpath("//div[@title=\'Preferences\']")).isEnabled(); 
   
         if (PreferencesButtonDisplayed== true & PreferencesButtonEnabled==true )
         {
           System.out.println("Preferences Button is present on the page");
          }
         else
        {
          System.out.println("\"\\Preferences Button is not present on the page\"");
         }
         
         //Logout Button
         boolean LogoutButtonDisplayed = driver.findElement(By.xpath("//div[@title='Logout']")).isDisplayed(); 
         
         boolean LogoutButtonEnabled = driver.findElement(By.xpath("//div[@title='Logout']")).isEnabled(); 
  
         if (LogoutButtonDisplayed== true & LogoutButtonEnabled == true )
         {
          System.out.println("Logout Button is present on the page");
         }
         else
         {
          System.out.println("\"\\Logout Button is not present on the page\"");
         }
         
       //Quick link
        boolean QuicklinkDisplayed = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-quick-links']")).isDisplayed(); 
        
        boolean QuicklinkEnabled = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-quick-links']")).isEnabled(); 
 
         if (QuicklinkDisplayed == true & QuicklinkEnabled == true )
         {
          System.out.println("Quicklink is present on the page");
         }
         else
        {
          System.out.println("\"\\Quicklink is not present on the page\"");
        
         }
    
       //Help icon
       boolean HelpiconDisplayed = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-quick-links']")).isDisplayed(); 
       
       boolean HelpiconEnabled = driver.findElement(By.xpath("//div[@ng-reflect-klass='nav-item nav-quick-links']")).isEnabled(); 

       if (HelpiconDisplayed == true & HelpiconEnabled == true )
       {
         System.out.println("Help icon is present on the page");
        }
       else
        {
         System.out.println("\"\\Help icon is not present on the page\"");
        }
       
      //Project All Tab	
         boolean ProjectAllTabDisplayed = driver.findElement(By.xpath("//div[@class='tab highlightTab']")).isDisplayed(); 
      
         boolean ProjectAllTabEnabled = driver.findElement(By.xpath("//div[@class='tab highlightTab']")).isEnabled(); 

      if (ProjectAllTabDisplayed == true & ProjectAllTabEnabled== true )
       {
        System.out.println("Project All Tab is present on the page");
       }
      else
       {
         System.out.println("\"\\Project All Tab is not present on the page\"");
        }
     
     //Project Favorites Tab	
       boolean ProjectFavoritesTabDisplayed = driver.findElement(By.xpath("//span[text()='Favorites']")).isDisplayed(); 
     
       boolean ProjectFavoritesTabEnabled = driver.findElement(By.xpath("//span[text()='Favorites']")).isEnabled(); 

       if (ProjectFavoritesTabDisplayed == true & ProjectFavoritesTabEnabled== true )
       {
        System.out.println("Project -- Favorites Tab is present on the page");
       }
       else
      {
        System.out.println("\"\\Project -- Favorites Tab is not present on the page\"");
       }
       
       //Project Add Favorites	
       boolean ProjectAddFavoritesDisplayed = driver.findElement(By.xpath("//div[@id='add-favorites']")).isDisplayed(); 
     
       boolean ProjectAddFavoritesEnabled = driver.findElement(By.xpath("//div[@id='add-favorites']")).isEnabled(); 

       if (ProjectAddFavoritesDisplayed == true & ProjectAddFavoritesEnabled== true )
       {
        System.out.println("Project -- Add Favorites Button is present on the page");
       }
       else
      {
        System.out.println("\"\\Project -- Add Favorites Button is not present on the page\"");
        
       }
       
       //Nielsen Logo
       boolean NielsenLogoDisplayed = driver.findElement(By.xpath("//div[@class='nielsen-logo']")).isDisplayed(); 
       if (NielsenLogoDisplayed == true )
       {
        System.out.println("Nielsen Logo is displayed on the page");
       }
       else
      {
        System.out.println("\"\\Nielsen Logo is not present on the page\"");
        }
       
      //Username 
       boolean UsernameDisplayed = driver.findElement(By.xpath("//div[@class='username']")).isDisplayed(); 
       if (UsernameDisplayed == true )
       {
        System.out.println("Username is displayed on the page");
       }
       else
      {
        System.out.println("\"\\Nielsen Logo is not present on the page\"");
        }
       
       
  }
    }



	

