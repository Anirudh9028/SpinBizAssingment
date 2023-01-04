package PomAltroMutual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtility.base;

public class recentTransanctionPom extends base
{
	/*Test case 11 to 12*/

	
	
	
	public recentTransanctionPom()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='MenuHyperLink2']") 
	WebElement transferLink;
	
	@FindBy(xpath = "//*[@id='_ctl0__ctl0_Content_Main_MyTransactions']/tbody/tr[2]/td[5]") 
	WebElement deposit_800001;
	
	@FindBy(xpath = "//*[@id='_ctl0__ctl0_Content_Main_MyTransactions']/tbody/tr[3]/td[5]")
	WebElement withdraw_800000;
	
	
	public void TransferLink()
	{
		transferLink.click();
	}
	
	
	public String Deposit_800001()
	{
		String credit = deposit_800001.getText();
		return credit;
		
	}
	public String Withdraw_800000()
	{
		String debit = withdraw_800000.getText();
		return debit;	
	}

}
