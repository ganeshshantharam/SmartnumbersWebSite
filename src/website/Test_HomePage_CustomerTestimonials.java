package website;

import org.testng.annotations.Test;

import common.Common_Config;

public class Test_HomePage_CustomerTestimonials extends Common_Config 
{
	
	 		String baseUrl = "http://www.resilientplc.com";
	  
	 		public void Invoke_Browser()
	 		{
	 			launchBrowser();
	  
	 		}

	 		public void Navigate_To_Site() throws InterruptedException
	 		{
	 			driver.navigate().to(baseUrl);   
	 			driver.manage().window().maximize();
	 		} 
 
	 		@Test(priority=60)
	 		public void GoTo_HomePage() throws InterruptedException 
	 		{
	 			Invoke_Browser();
	 			Navigate_To_Site();
	 			Thread.sleep(3000);
	 		}	  
 	  
 	// Customer testimonials
	  
	 		  @Test(priority=61)
	 		  public void MainPage_CustomerTestimonials_Click_Sainsburys() throws InterruptedException
	 		  {
	 			  movetoElmentXpathAndClick("//*[@id='post-4098']/a/span/span");
	 			  Thread.sleep(3000);
	 			  verifyPageTitle("Sainsbury’s • Resilientplc");
	 			  gotoHome(".//*[@id='logo']");
	 		  }
	 		  
	 		  @Test(priority=61)
	 		  public void MainPage_CustomerTestimonials_Click_Cambridgeshire() throws InterruptedException
	 		  {  
	 			  movetoElmentXpathAndClick("//*[@id='post-3405']/a/span/span");
	 			  Thread.sleep(3000);
	 			  verifyPageTitle("Cambridgeshire Fire and Rescue Service • Resilientplc");
	 			  gotoHome(".//*[@id='logo']");
	 		  }
 		  
	 		  @Test(priority=61)
	 		  public void MainPage_CustomerTestimonials_Click_NorthamptonBoroughCouncil() throws InterruptedException
	 		  {  
	 			  movetoElmentXpathAndClick("//*[@id='post-3401']/a/span/span");
	 			  Thread.sleep(3000);
	 			  verifyPageTitle("Northampton Borough Council • Resilientplc");
	 			  gotoHome(".//*[@id='logo']");
	 		  }
	 		  
	 		  @Test(priority=61)
	 		  public void MainPage_CustomerTestimonials_Click_BT() throws InterruptedException
	 		  {
	 			  movetoElmentXpathAndClick("//*[@id='post-3398']/a/span/span");
	 			  Thread.sleep(3000);
	 			  verifyPageTitle("BT • Resilientplc");
	 			  gotoHome(".//*[@id='logo']");
	 		  }
 		    
	 		  @Test(priority=62)
	 		  public void Close_Browser() throws InterruptedException
	 		  {
	 			  browserClose();
	 		  }

}
