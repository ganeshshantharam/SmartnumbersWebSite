package website;


import org.testng.Assert;
import org.testng.annotations.Test;
import common.Common_Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test_HomePage_LowerBanner extends Common_Config  {
	
	   
	
	String baseUrl = "http://www.resilientplc.com";

	  
	  
	  @Test(priority=4)
	  public void invoke_browser()
	  {
		  launchBrowser();
	  }
	
	  @Test(priority=5)
	  public void navigateToSite() throws InterruptedException
	  {
		  driver.navigate().to(baseUrl);
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
	  }

	  // Bottom Banner-Solutions
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Solutions_Overview() throws InterruptedException
	  {
		  	  		  
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4607']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Solutions • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Solutions_TwoNumbersOneMobile() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4473']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("The enterprise mobile • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	 	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Solutions_CallRecording() throws InterruptedException
	  {	  
		  movetoElmentXpathAndClick("//*[@id='menu-item-4475']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Call recording • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  } 

	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Solutions_FaceToFaceRecording() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4628']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Face-to-face • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Solutions_OfficeMoves() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4477']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Office moves • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Solutions_BusinessContinuity() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4479']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Protect critical numbers • smartnumbers");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  // Bottom Banner-Products
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Products_Overview() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4606']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("smartnumbers overview • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Products_SmartnumbersMobile() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4485']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("About smartnumbers mobile.");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Products_SmartnumbersCallRecording() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4585']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("smartnumbers call recording • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Products_SmartnumbersFaceToFaceRecording() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4586']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("smartnumbers face-to-face-recording • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Products_SmartnumbersControl() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4484']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("About smartnumbers control • smartnumbers");
		  gotoHome(".//*[@id='logo']");
	  }

	  
	  // Bottom Banner-Partners
	    

	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Partners_Overview() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4492']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Partners • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Partners_DistributionPartners() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4491']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Distribution partners • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_Partners_TechnologyPartners() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4494']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Technology partners • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  
	// Bottom Banner-About Us
	  
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_AboutUs_Overview() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4588']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("About us • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_AboutUs_Careers() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4590']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Careers • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_AboutUs_Management() throws InterruptedException
	  {  
		  Thread.sleep(3000);
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4591']/a");
		  Thread.sleep(3000);
		  verifyPageTitle("Management • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_AboutUs_SocialResponsibility() throws InterruptedException
	  {  
	  	movetoElmentXpathAndClick(".//*[@id='menu-item-4592']/a");
	  	Thread.sleep(3000);
	  	verifyPageTitle("Social responsibility • Resilientplc");
	  	gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void MainPage_LowerBanner_Click_AboutUs_News() throws InterruptedException
	  {
	  	movetoElmentXpathAndClick(".//*[@id='menu-item-4589']/a");
	  	Thread.sleep(3000);
	  	verifyPageTitle("News • Resilientplc");
	  	gotoHome(".//*[@id='logo']");
	  }
	    
	  @Test(priority=7)
	  public void close_browser() throws InterruptedException
	  {
		   
		  browserClose();

	  }
}

