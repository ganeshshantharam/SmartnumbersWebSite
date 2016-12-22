package website;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.Common_Config;

public class Test_HomePage_File_MenueOptions extends Common_Config  {
	
	  String baseUrl = "http://www.resilientplc.com";

	  public void invoke_browser()
	  {
		  	launchBrowser();
	  }
	
	  public void navigateToSite() throws InterruptedException
	  {
		  	driver.navigate().to(baseUrl);
		  	Thread.sleep(3000);
		  	driver.manage().window().maximize();
	  } 

	  // File Menu - Solutions
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_SolutionsMenue_OverviewOption() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");	  
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4367']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4367']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("Solutions • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_SolutionsMenue_TwoNumbersOneMobile() throws InterruptedException
	  {
	  	
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-2880']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-2880']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("The enterprise mobile • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_SolutionsMenu_CallRecording() throws InterruptedException
	  {
	  	
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-2970']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-2970']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("Call recording • Resilientplc");
		  	browserClose(); 
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_SolutionsMenu_FaceToFaceRecording() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4629']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4629']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("Face-to-face • Resilientplc");
		  	browserClose(); 
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_SolutionsMenu_OfficeMoves() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-1820']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-1820']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("Office moves • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_SolutionsMenu_BusinessContinuity() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-324']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-324']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("Protect critical numbers • smartnumbers");
		  	browserClose();
	  }
	  
	  // File Menu - Products
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Products_Overview() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4044']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4044']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("smartnumbers overview • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Products_SmartnumbersMobile() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-396']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-396']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("About smartnumbers mobile.");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Products_SmartnumbersCallRecording() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4584']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4584']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("smartnumbers call recording • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Products_SmartnumbersFaceToFaceRecording() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4568']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4568']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("smartnumbers face-to-face-recording • Resilientplc");
		  	browserClose();
	  }

	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Products_SmartnumbersControl() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-804']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-804']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("About smartnumbers control • smartnumbers");
		  	browserClose();
	  }

	  // File Menu - Customers

	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Customers() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-206']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-206']/a"))).click();
		  	Thread.sleep(3000);
		  	verifyPageTitle("Resilient plc case studies");
		  	browserClose();
	  }
	  
	  // File Menu - Partners

	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Partners_Overview() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4519']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4519']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4229']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4229']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("Partners • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Partners_DistributionPartners() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4519']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4519']/a"))).click();
		  	movetoElmentXpath("//*[@id='menu-item-4264']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu-item-4264']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("Distribution partners • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_Partners_TechnologyPartners() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4519']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4519']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4228']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4228']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("Technology partners • Resilientplc");
		  	browserClose();
	  }
	  
	  // File Menu - About Us

	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_AboutUs_Overview() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4523']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4523']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("About us • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_AboutUs_Management() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4150']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4150']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("Management • Resilientplc");
		  	browserClose();
	  }

	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_AboutUs_Careers() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4149']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4149']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("Careers • Resilientplc");
		  	browserClose();
	  }

	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_AboutUs_SocialResponsibility() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4148']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4148']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("Social responsibility • Resilientplc");
		  	browserClose();
	  }

	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_AboutUs_News() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-2382']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-2382']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("News • Resilientplc");
		  	browserClose();
	  }
	  
	  @Test(priority=8)
	  public void MainPage_FileMenu_Click_AboutUs_Blog() throws InterruptedException
	  {
		  	invoke_browser();
		  	navigateToSite();
		  
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-5619']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-5619']/a"))).click();

		  	Thread.sleep(3000);
		  	verifyPageTitle("Blog Archives • Resilientplc");
		  	browserClose();
	  }

	  // File Menu - Resources

		  @Test(priority=8)
		  public void MainPage_FileMenu_Click_AboutUs_Resources() throws InterruptedException
		  {
			  invoke_browser();
			  navigateToSite();
			  
			  WebDriverWait wd = new WebDriverWait(driver, 30);
			  	  
			  movetoElmentXpath(".//*[@id='menu-item-205']/a");
			  wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-205']/a"))).click();


			  Thread.sleep(3000);
			  verifyPageTitle("Resources • smartnumbers");
			  browserClose();
		  }
	  
		  
			// Bottom - Terms and Conditions

		  @Test(priority=8)
		  public void MainPage_FileMenu_Click_TermsAndConditions() throws InterruptedException
		  {
			  invoke_browser();
			  navigateToSite();
			  
			  WebDriverWait wd = new WebDriverWait(driver, 30);
			  	  
			  movetoElmentXpath(".//*[@id='menu-item-63']/a");
			  wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-63']/a"))).click();


			  Thread.sleep(3000);
			  verifyPageTitle("Terms and Conditions • Resilientplc");
			  browserClose();
		  }		  
}


