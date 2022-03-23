package com.crm.PractiseVtigerDummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLogoutTest {
	
	 
	  @Test
	  public void loginlogoutTest()
	  
	  
	  {
		 
			 String browser=System.getProperty("browser");
			  
			  String url=System.getProperty("url");
			  String username=System.getProperty("username");
			  String password=System.getProperty("password");
			  System.out.println(browser);
			  System.out.println(url);
			  System.out.println(password);
			  System.out.println(username);
		  
		  //run time polymorhism
		 WebDriver driver=null;
		  if(browser.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				System.out.println("Chrome successfully launched");
			}
			else if(browser.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				System.out.println("launched browser"+browser);
				
			}
			else
			{
				System.out.println("Specify a valid browser");
			} 
		  
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(url);
			
			//login credentials
			
			driver.findElement(By.name("user_name")).sendKeys(username);
			driver.findElement(By.name("user_password")).sendKeys(password);
			driver.findElement(By.id("submitButton")).click();
			
			
			//logout
			WebElement wb=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions act = new Actions(driver);
			act.moveToElement(wb).perform();
			driver.findElement(By.linkText("Sign Out")).click();
			driver.quit();

}
}