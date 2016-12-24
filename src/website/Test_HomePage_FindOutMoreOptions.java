package website;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.Common_Config;

public class Test_HomePage_FindOutMoreOptions extends Common_Config 
{
	
	String baseUrl = "http://www.resilientplc.com";
  
	  public void Invoke_Browser()
	  {
		  launchBrowser();
	  }
	  
	  public void NavigateToSite() throws InterruptedException
	  {
		  driver.navigate().to(baseUrl);   
		  driver.manage().window().maximize();
				  	   
	  } 
	  
	@Test(priority=1)
	  public void GoTo_HomePage() throws InterruptedException 
	  {
		  Invoke_Browser();
		  NavigateToSite();
		  Thread.sleep(3000);
	  }	  
	
	  @Test(priority=2)
	  public void TestCase_MainPage_TwoNumbersOneMobile_FindOutMore() throws InterruptedException 
	  {  
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".et_pb_row_3 a.et_pb_promo_button.et_pb_button"))).click();
		  Thread.sleep(3000);
		  verifyPageTitle("The enterprise mobile • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	
	  @Test(priority=2)
	  public void TestCase_MainPage_CallRecording_FindOutMore() throws InterruptedException 
	  {  
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".et_pb_column_11 a.et_pb_promo_button.et_pb_button"))).click();
		  Thread.sleep(3000);
		  verifyPageTitle("Call recording • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	
	  @Test(priority=2)
	  public void TestCase_MainPage_FaceToFace_FindOutMore() throws InterruptedException 
	  {  
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".et_pb_row_9 a.et_pb_promo_button.et_pb_button"))).click();
		  Thread.sleep(3000);
		  verifyPageTitle("Face-to-face"
		  		+ " • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=2)
	  public void TestCase_MainPage_BusinessContinuity_FindOutMore() throws InterruptedException 
	  {  
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".et_pb_column_22 a.et_pb_promo_button.et_pb_button"))).click();
		  Thread.sleep(3000);
		  
		  verifyPageTitle("Protect critical numbers • smartnumbers");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=2)
	  public void TestCase_MainPage_OfficeMove_FindOutMore() throws InterruptedException 
	  {  
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  Thread.sleep(3000);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".et_pb_cta_3.et_pb_no_bg a.et_pb_promo_button.et_pb_button"))).click();
		  Thread.sleep(3000);
		  verifyPageTitle("Office moves • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=3)
	  public void Close_Browser() throws InterruptedException
	  {
		  browserClose();
	  }
}



