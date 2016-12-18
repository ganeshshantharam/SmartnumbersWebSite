package website;


import org.testng.Assert;
import org.testng.annotations.Test;
import common.Common_Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		  driver.manage().window().maximize();
	  }

	  // Bottom Banner-Solutions
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Solutions_Overview() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4607']/a");
		  verifyPageTitle("Solutions • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Solutions_TwoNumbersOneMobile() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4473']/a");
		  verifyPageTitle("The enterprise mobile • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	 	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Solutions_CallRecording() throws InterruptedException
	  {	  
		  movetoElmentXpathAndClick("//*[@id='menu-item-4475']/a");
		  verifyPageTitle("Call recording • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  } 

	  @Test(priority=6)
	  public void mainPage_banner_click_Solutions_FaceToFaceRecording() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4628']/a");
		  verifyPageTitle("Face-to-face • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Solutions_OfficeMoves() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4477']/a");
		  verifyPageTitle("Office moves • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Solutions_BusinessContinuity() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4479']/a");
		  verifyPageTitle("Protect critical numbers • smartnumbers");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  // Bottom Banner-Products
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Products_Overview() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4606']/a");
		  verifyPageTitle("smartnumbers overview • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Products_SmartnumbersMobile() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4485']/a");
		  verifyPageTitle("About smartnumbers mobile.");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=6)
	  public void mainPage_banner_click_Products_SmartnumbersCallRecording() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4585']/a");
		  verifyPageTitle("smartnumbers call recording • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=6)
	  public void mainPage_banner_click_Products_SmartnumbersFaceToFaceRecording() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4586']/a");
		  verifyPageTitle("smartnumbers face-to-face-recording • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Products_SmartnumbersControl() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4484']/a");
		  verifyPageTitle("About smartnumbers control • smartnumbers");
		  gotoHome(".//*[@id='logo']");
	  }

	  
	  // Bottom Banner-Partners
	    

	  @Test(priority=6)
	  public void mainPage_banner_click_Partners_Overview() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4492']/a");
		  verifyPageTitle("Partners • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_Partners_DistributionPartners() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4491']/a");
		  verifyPageTitle("Distribution partners • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=6)
	  public void mainPage_banner_click_Partners_TechnologyPartners() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4494']/a");
		  verifyPageTitle("Technology partners • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  
	// Bottom Banner-About Us
	  
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_AboutUs_Overview() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4588']/a");
		  verifyPageTitle("About us • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_AboutUs_Careers() throws InterruptedException
	  { 
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4590']/a");
		  verifyPageTitle("Careers • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }

	  @Test(priority=6)
	  public void mainPage_banner_click_AboutUs_Management() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick(".//*[@id='menu-item-4591']/a");
		  verifyPageTitle("Management • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_AboutUs_SocialResponsibility() throws InterruptedException
	  {  
	  	movetoElmentXpathAndClick(".//*[@id='menu-item-4592']/a");
	  	verifyPageTitle("Social responsibility • Resilientplc");
	  	gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_banner_click_AboutUs_News() throws InterruptedException
	  {
	  	movetoElmentXpathAndClick(".//*[@id='menu-item-4589']/a");
	  	verifyPageTitle("News • Resilientplc");
	  	gotoHome(".//*[@id='logo']");
	  }
	  
	  
		// Smartnumbers business services - Two numbers, one mobile
		  
		  
	  @Test(priority=6)
	  public void mainPage_smartnumbers_business_services_cick_TwoNumbersOneMobile() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[1]/div/div/div[1]/a/img");
		  verifyPageTitle("The enterprise mobile • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_smartnumbers_business_services_cick_CallRecording() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[2]/div/div/div[1]/a/img");
		  verifyPageTitle("Call recording • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_smartnumbers_business_services_cick_FaceToFaceRecording() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[3]/div/div/div[1]/a/img");
		  verifyPageTitle("Face-to-face • Resilientplc");
		  gotoHome(".//*[@id='logo']");

	  }
	  
	  @Test(priority=6)
	  public void mainPage_smartnumbers_business_services_cick_BusinessContinuity() throws InterruptedException
	  {
		  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[4]/div/div/div[1]/a/img");
		  verifyPageTitle("Protect critical numbers • smartnumbers");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  
		// Customer testimonials
	  
	  
	  @Test(priority=6)
	  public void mainPage_customer_testimonials_click_Sainsburys() throws InterruptedException
	  {
		  movetoElmentXpathAndClick("//*[@id='post-4098']/a/span/span");
		  verifyPageTitle("Sainsbury’s • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  
	  @Test(priority=6)
	  public void mainPage_customer_testimonials_click_Cambridgeshire() throws InterruptedException
	  {  
		  movetoElmentXpathAndClick("//*[@id='post-3405']/a/span/span");
		  verifyPageTitle("Cambridgeshire Fire and Rescue Service • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_customer_testimonials_click_NorthamptonBoroughCouncil() throws InterruptedException
	  {  
		  
		  movetoElmentXpathAndClick("//*[@id='post-3401']/a/span/span");
		  verifyPageTitle("Northampton Borough Council • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	  
	  @Test(priority=6)
	  public void mainPage_customer_testimonials_click_BT() throws InterruptedException
	  {
		   
		  movetoElmentXpathAndClick("//*[@id='post-3398']/a/span/span");
		  verifyPageTitle("BT • Resilientplc");
		  gotoHome(".//*[@id='logo']");
	  }
	    
	  @Test(priority=7)
	  public void close_browser() throws InterruptedException
	  {
		   
		  browserClose();

	  }
	
	  
}

