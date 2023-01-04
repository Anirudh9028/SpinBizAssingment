package PomAltroMutual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseUtility.base;

public class fundTransferPom extends base
{
	/*Test case 8 to 10*/

	
	
	
	public fundTransferPom()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Transfer Funds']") WebElement transferLink;
	
	@FindBy(xpath = "//select[@id= 'fromAccount']") WebElement fromAccount;
	
	@FindBy(xpath = "//select[@id='toAccount']") WebElement toAccount;
	
	@FindBy(xpath = "//input[@id ='transferAmount']") WebElement transferAmount;
	
	@FindBy(css = "#transfer") WebElement transferBtn;
	
	@FindBy(xpath = "//*[@id='_ctl0__ctl0_Content_Main_postResp']") WebElement successfulMsg;
	
	
	public void ClickOnTransferLink()
	{
		transferLink.click();
		
	}
	
	public void DrpFromAccount()
	{
		Select val = new Select(fromAccount);
		val.selectByVisibleText("800000 Corporate"); 
		
	}
	public void DrpToAccount()
	{
		Select val2 = new Select(toAccount);
		val2.selectByVisibleText("800001 Checking");
		
	}
	public void TransferAmount(String amt)
	{
		transferAmount.sendKeys(amt); 
		
	}
	
	public void ClickOnTransferBtn()
	{
		transferBtn.click();
		
	}
	public String successfulMsg()
	{
		 
		String sucsflMsg =successfulMsg.getText();
		return sucsflMsg;
	}
	
}
