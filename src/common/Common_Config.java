package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Common_Config {
	
	public WebDriver driver;
	
  	
  public void launchBrowser() 
  
  		{
	  
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//driver = new FirefoxDriver();
	  	    
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
			  	
  		
  		} 

  public void clickElementXpath (String elementXpath, String expectedTitle ) throws InterruptedException

		{
	
	  Thread.sleep(3000);	
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath))).click();
	  Thread.sleep(3000);

	  String actualTitle = null;
	  actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle );
	  Thread.sleep(3000);
		
		}
  
  public void browserClose()
  
  		{

	  driver.close();
	  driver.quit();
	 	
	  	}
  
  public void gotoHome(String homeButton) throws InterruptedException
  {
	  
	  driver.findElement(By.xpath(homeButton)).click();
	  Thread.sleep(3000);
  }



  public void verifyPageTitle(String expectedTitle) throws InterruptedException
  {
 
	  String actualTitle = null;
	  actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle );
	  Thread.sleep(3000);
	 
	 
  }
  
  public void movetoElmentXpathAndClick(String elementXpath)
  {
	
	  Actions act=new Actions(driver);
	  WebElement element = driver.findElement(By.xpath(elementXpath));
	  act.moveToElement(element).build().perform();
	  element.click();
	  
  }

  public void movetoElmentXpath(String elementXpath)
  {
	
	  Actions act=new Actions(driver);
	  WebElement element = driver.findElement(By.xpath(elementXpath));
	  act.moveToElement(element).build().perform();
	  
  }
  
  public void movetoElmentCssAndClick(String elementCss)
  {
	
	  Actions act=new Actions(driver);
	  WebElement element = driver.findElement(By.cssSelector(elementCss));
	  act.moveToElement(element).build().perform();
	  element.click();
	  
  }
  
  
  public void movetoElmentCss(String elementCss)
  {
	
	  Actions act=new Actions(driver);
	  WebElement element = driver.findElement(By.cssSelector(elementCss));
	  act.moveToElement(element).build().perform();
	  
  }
  
  
  
  }
 
 
 
