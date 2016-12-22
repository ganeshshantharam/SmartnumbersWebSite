package website;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.Common_Config;

public class Test_Products_OverviewPage extends Common_Config {
	
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
	  
	@Test(priority=20)
	  public void GoToMainHomePage() throws InterruptedException 
	  {
		  Invoke_Browser();
		  NavigateToSite();
		  Thread.sleep(3000);
	  }	  
	
	@Test(priority=21)
	public void Products_OverView_SmartnumbersMobile_FindOutMore() throws InterruptedException
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
	  	  
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4044']/a"))).click();
			Thread.sleep(3000);
			movetoElmentCssAndClick(".et_pb_column_0 a.et_pb_promo_button");
			verifyPageTitle("About smartnumbers mobile.");
			gotoHome(".//*[@id='logo']");
	}	
	
	@Test(priority=21)
	public void Products_OverView_SmartnumbersCallRecording_FindOutMore() throws InterruptedException
	{
		WebDriverWait wd = new WebDriverWait(driver, 30);

			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4044']/a"))).click();
			Thread.sleep(3000);
			movetoElmentCssAndClick(".et_pb_column_1 a.et_pb_promo_button");
			verifyPageTitle("smartnumbers call recording • Resilientplc");
			gotoHome(".//*[@id='logo']");
	}	

	@Test(priority=21)
	public void Products_OverView_SmartnumbersFaceToFace_FindOutMore() throws InterruptedException
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4044']/a"))).click();
			Thread.sleep(3000);
			movetoElmentCssAndClick(".et_pb_column_1 a.et_pb_promo_button");
			verifyPageTitle("smartnumbers call recording • Resilientplc");
			gotoHome(".//*[@id='logo']");
	}	
	
	@Test(priority=21)
	public void Products_OverView_SmartnumbersControl__FindOutMore() throws InterruptedException
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4044']/a"))).click();
			Thread.sleep(3000);
			movetoElmentCssAndClick(".et_pb_column_3 a.et_pb_promo_button");
			verifyPageTitle("About smartnumbers control • smartnumbers");
			gotoHome(".//*[@id='logo']");
	}
}

