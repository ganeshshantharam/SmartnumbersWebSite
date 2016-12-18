package website;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.Common_Config;

public class Test_Privacy_Policy extends Common_Config  

{
	
	String baseUrl = "http://www.resilientplc.com";
	  
	  
	  public void invoke_browser()
	  {
		  launchBrowser();
		  
	  }
	
	  
	  public void navigateToSite() throws InterruptedException
	  {
		  

		  driver.navigate().to(baseUrl);   
		  driver.manage().window().maximize();
				  	   
	  } 
	  
	  
	@Test(priority=40)
	  public void gotoMainHomePage() throws InterruptedException 
	  {
		  invoke_browser();
		  navigateToSite();
		  Thread.sleep(3000);
	  }	  
	
  @Test(priority=41)
  public void privacyPolicy() throws InterruptedException
  {
	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
  	  
	  movetoElmentXpath("//*[@id='menu-item-65']/a");
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu-item-65']/a"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Privacy Policy • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
	  
  }
  
  
}
