package com.crm.PractiseVtigerDummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoIbiboTest {
@Test
	public void  goIbiboTest()throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		
		//go to hotels
driver.findElement(By.xpath("//span[@class='header-sprite nav-icon-hotels gr-append-right5']")).click();
//click on radio buttons
driver.findElement(By.xpath("//h4[text()='India']/preceding-sibling::input")).click();
//click on search textfield and sendkeys
driver.findElement(By.xpath("//input[@data-testid='home-autosuggest-input']")).click();
driver.findElement(By.xpath("//input[@data-testid='home-autosuggest-input']")).sendKeys("Bengaluru");
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@data-testid='home-autosuggest-input']")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.xpath("//input[@data-testid='home-autosuggest-input']")).sendKeys(Keys.ENTER);
Thread.sleep(10000);
  driver.findElement(By.xpath("//div[text()='Check-in']/following-sibling::h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-9 SearchBlockUIstyles__CheckInDateWrapDiv-sc-fity7j-14 bjZxoj kSflmU']")).click();
		  
  
  driver.findElement(By.xpath("//span[@data-testid='date_31_2_2022']")).click();
  Thread.sleep(10000);
  
 
  
  
  
  driver.findElement(By.xpath("//input[@class='SearchBlockUIstyles__CitySearchInput-sc-fity7j-12 uGGSH']")).click();
  driver.findElement(By.xpath("//span[text()='Children']/following::span[text()='+']")).click();
  driver.findElement(By.xpath("//span[text()='Children']/following::span[text()='+']")).click();
  driver.findElement(By.xpath("//span[text()='Children']/following::span[text()='+']")).click();
  

  String select="//p[@class='PaxWidgetstyles__SelectedChildAgeErrorText-sc-gv3w6r-12 cvwGUW']/ancestor::div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 PaxWidgetstyles__ContentItemWrapperDiv-sc-gv3w6r-2 ibYPGm fAmNIr']/div";
 List<WebElement> selectAge= driver.findElements(By.xpath(select));

  for (WebElement ele : selectAge) 
{
	  ele.click();
	   driver.findElement(By.xpath("//ul[@class='PaxWidgetstyles__ChildDropdownWrap-sc-gv3w6r-9 cuOfFa']/li[text()='1']")).click();
}
  driver.findElement(By.xpath("//button[text()='Done']")).click();
	
	
	
	

    driver.findElement(By.xpath("//button[text()='Search Hotels']")).click();
	
	
    List<WebElement> allHotels = driver.findElements(By.xpath("//h4[@itemprop='name']"));
    
    for (WebElement webElement : allHotels) {
    	System.out.println("hotel name :: "+webElement.getText());
		
    }
	}
	
	
	
	
	
	

}
