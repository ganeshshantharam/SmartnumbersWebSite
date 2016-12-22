package website;

import org.testng.annotations.Test;

import common.Common_Config;

public class Test_HomePage_SmartnumbersBusinessServices extends Common_Config   
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
	  
	  	  @Test(priority=50)
	  	  public void gotoMainHomePage() throws InterruptedException 
	  	  {
			  invoke_browser();
			  navigateToSite();
			  Thread.sleep(3000);
	  	  }	  
	
	// Smartnumbers business services - Two numbers, one mobile
	  
		  @Test(priority=51)
		  public void MainPage_SmartnumbersBusinessServices_Click_TwoNumbersOneMobile() throws InterruptedException
		  {
			  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[1]/div/div/div[1]/a/img");
			  Thread.sleep(3000);
			  verifyPageTitle("The enterprise mobile • Resilientplc");
			  gotoHome(".//*[@id='logo']");
		  }
		  
		  @Test(priority=51)
		  public void MainPage_SmartnumbersBusinessServices_Click_CallRecording() throws InterruptedException
		  {  
			  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[2]/div/div/div[1]/a/img");
			  Thread.sleep(3000);
			  verifyPageTitle("Call recording • Resilientplc");
			  gotoHome(".//*[@id='logo']");
		  }
		  
		  @Test(priority=51)
		  public void MainPage_SmartnumbersBusinessServices_Click_FaceToFaceRecording() throws InterruptedException
		  {
			  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[3]/div/div/div[1]/a/img");
			  Thread.sleep(3000);
			  verifyPageTitle("Face-to-face • Resilientplc");
			  gotoHome(".//*[@id='logo']");

		  }
		  
		  @Test(priority=51)
		  public void MainPage_SmartnumbersBusinessServices_Click__BusinessContinuity() throws InterruptedException
		  {
			  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[4]/div/div/div[1]/a/img");
			  Thread.sleep(3000);
			  verifyPageTitle("Protect critical numbers • smartnumbers");
			  gotoHome(".//*[@id='logo']");
		  }
		  
		  @Test(priority=52)
		  public void close_browser() throws InterruptedException
		  {
			   
			  browserClose();

		  }
}
