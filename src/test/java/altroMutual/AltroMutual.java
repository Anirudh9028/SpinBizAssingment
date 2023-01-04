package altroMutual;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import PomAltroMutual.LoginPagePom;
import PomAltroMutual.accountSumaryPom;
import PomAltroMutual.contactusPom;
import PomAltroMutual.fundTransferPom;
import PomAltroMutual.recentTransanctionPom;
import baseUtility.base;
import baseUtility.readConfigFile;



public class AltroMutual extends base
{
	
	readConfigFile file = new readConfigFile();
	
	
	
	
	
	// lunch the browser setup
	
	@BeforeClass
	public void SetUp() 
	{
		
		LunchBrowser(file.getBrowser(),file.getURL());
		
	}
	@Test(priority = 1)
	public void loginWithInvalidData() 
	{
		LoginPagePom lpm = new LoginPagePom();
		lpm.Username(file.Inusername());
		lpm.Password(file.getInpassword());
		lpm.LoginBtn();
		
		String acturl = driver.getCurrentUrl();
		String exurl = file.getURL();
		Assert.assertEquals(exurl, acturl,"login With Invalid Data pass");
		
		
	}
	@Test(priority = 2)
	public void loginWithValidData() 
	{
		LoginPagePom lpm = new LoginPagePom();
		lpm.Username(file.getUserName());
		lpm.Password(file.getPassword());
		lpm.LoginBtn();
		
		String acturl = driver.getCurrentUrl();
		String exurl = file.getLoginMainUrl();
		Assert.assertEquals(exurl, acturl,"login With ValidData fail");
	}
	
	   @Test(priority = 3)
		public void Checkbalance() 
		{
			accountSumaryPom asp = new accountSumaryPom();
			
			asp.AccountSummary();
			asp.DropDown();
			asp.GoBtn();
			
			String actBal= asp.Balance();
			String exBal = "Available balance";
			
			Assert.assertEquals(exBal, actBal, "Available balance fail");
		}
		
		@Test(priority = 4)
		public void VerifyTransferAmount() 
		{
			fundTransferPom ftp = new fundTransferPom ();
			
			ftp.ClickOnTransferLink();
			ftp.DrpFromAccount();
			ftp.DrpToAccount();
			
			ftp.TransferAmount(file.getAmount());
			ftp.ClickOnTransferBtn();
			
			String acmsg = ftp.successfulMsg();
			String exmsg = "9876.0 was successfully transferred from Account 800000 into Account 800001 ";
			
			if(acmsg.contains(exmsg))
			{
				Assert.assertTrue(true,"transfer fail");
			}
				
		}
		
		@Test(priority = 5)
		public void VerifyRecentTransanction() 
		{
			recentTransanctionPom vrtp = new recentTransanctionPom ();
			
			vrtp.TransferLink();
			
			String deposit = vrtp.Deposit_800001();
			
			String withDraw = vrtp.Withdraw_800000();
			
			Assert.assertEquals (deposit,"$9876.00" ,"deposit fail");	
			Assert.assertEquals (withDraw,"-$9876.00","withDraw fail");
			
		}
		@Test(priority = 6)
		public void VerifyContactUs() 
		{
			contactusPom cup = new contactusPom ();
			
			cup.ClickOnContactUsLink();
			cup.ClickOnlineFormLink();
			cup.TextField(file.getTextdata());
			cup.ClickOnSubmitbtn();
			
			String actthanku = cup.ThankUmsg();
			String exthanku ="Thank You";
			
			Assert.assertEquals(actthanku, exthanku ,"field text fail");
			
			cup.ClickOnSingOffBtn();
			
			// verify singoff
			String acturl2 = driver.getCurrentUrl();
			String exurl2 = file.getIndexUrl();
			
			
			Assert.assertEquals(acturl2, exurl2,"SingOff fail");
			
		}
	
	
	
	
	
	//close the browser
	@AfterClass
	public void TearDown() 
	{
		driver.quit();
		
	}

}
