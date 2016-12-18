package website;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.Common_Config;

public class Test_ResourcesPage extends Common_Config  {
	
	
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
	  
	  
	  
	@Test(priority=9)
	  public void goto_resources_page() throws InterruptedException 
	  {
		  
		  invoke_browser();
		  navigateToSite();
		  Thread.sleep(3000);
		  
	  }	  
	  
  @Test(priority=10)
  public void top_5_benifits_of_smartnumbers_for_fixed_line_telephony() throws InterruptedException 
  {
	  

	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5789"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Top 5 benefits of smartnumbers for fixed-line telephony • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void how_smartnumbers_puts_you_in_control_of_your_communications() throws InterruptedException 
  {
	  
	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5758"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("How smartnumbers puts you in control of your communications • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void recording_conversations_under_mifid_a_quick_guide_to_compliance() throws InterruptedException 
  {

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5736"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Recording conversations under MiFID II: a quick guide to compliance • Resilientplc");
	  gotoHome(".//*[@id='logo']"); 
	  
  }
  
  @Test(priority=10)
  public void face_to_face_recording_for_financial_services_a_growing_imperative() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5574"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Face to face recording for financial services: a growing imperative • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  
  @Test(priority=10)
  public void one_public_estate_maintaining_business_continuity_during_estate_rationalisation() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5571"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("One Public Estate: maintaining business continuity during estate rationalisation • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  
  @Test(priority=10)
  public void five_questions_to_ask_when_moving_your_telecoms_to_new_premises() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5436"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("5 questions to ask when moving your telecoms to new premises • Resilientplc");
	  gotoHome(".//*[@id='logo']"); 
	  
  }
  
  
  @Test(priority=10)
  public void one_public_estate_for_number_management_success_stories() throws InterruptedException 
  {
	  
	
	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5427"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("One Public Estate: 4 number management success stories • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void keeping_you_in_control_during_sip_migration() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5403"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Keeping you in control during SIP migration • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  
  @Test(priority=10)
  public void mifid_ebook() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5339"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("MiFID II eBook • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  
  @Test(priority=10)
  public void smartnumbers_mobile_datasheet() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4738"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("smartnumbers mobile datasheet • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void smartnumbers_call_recording_datasheet() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4577"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("smartnumbers call recording datasheet • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void smartnumbers_face_to_face_recording_datasheet() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4444"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("smartnumbers face-to-face recording datasheet • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  
  @Test(priority=10)
  public void legal_sector_industry_brief() throws InterruptedException 
  {
	  

	  
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3711"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("A new approach to mobile call recording • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void public_sector_industry_brief() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3635"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Legal sector industry brief • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void the_enterprise_mobile_for_sales_organisations() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3631"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Public sector industry brief • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void mifid_smart_guide_to_mobile_call_recording() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3628"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("The enterprise mobile for sales organisations • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void smart_guide_to_the_costs_and_risks_of_allowing_business_and_personal_calls_on_one_phone() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3623"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("MiFID II: smart guide to mobile call recording • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void smartnumbers_control_datasheet() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3617"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("smartnumbers control datasheet • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void de_risk_office_moves_solution_brief() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3610"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("De-risk office moves solution brief • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void protect_critical_numbers_solution_brief() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3605"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Protect critical numbers solution brief • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void compliant_mobile_call_recording_solution_brief() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3599"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Compliant mobile call recording solution brief • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void mobile_call_recording_ebook() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3591"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Mobile call recording eBook • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void byod_voice_made_easy_solution_brief() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3588"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("BYOD voice made easy solution brief • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void byod_voice_the_lost_piece_of_the_byod_puzzle() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3579"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("BYOD voice - The lost piece of the BYOD puzzle • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void sustainability_and_the_corporate_mobile_ebook() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3575"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Sustainability and the corporate mobile eBook • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=10)
  public void insurance_industry_brief() throws InterruptedException 
  {
	    
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3563"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Insurance industry brief • Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=11)
  public void close_browser() throws InterruptedException
  {
	   
	  browserClose();

  }
}
