package PomAltroMutual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtility.base;

public class contactusPom extends base
{

	/*test case 13 to 16*/
	
	
	
	public contactusPom()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text() = 'Contact Us']") WebElement contactUsLink;
	
	@FindBy(xpath = "//a[text()='online form']") WebElement onlineFormLink;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[5]/td[2]/textarea") 
	WebElement textField;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[6]/td[2]/input[1]") 
	WebElement submitbtn;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/div/h1") WebElement thankUmsg;
	
	@FindBy(xpath = "//*[@id='LoginLink']/font") WebElement singOffBtn;
	
	
	public void ClickOnContactUsLink()
	{
		contactUsLink.click();
		
	}
	public void ClickOnlineFormLink()
	{
		onlineFormLink.click();
		
	}
	
	public void TextField(String msg)
	{
		textField.sendKeys(msg);
		
	}
	
	public void ClickOnSubmitbtn()
	{
		submitbtn.click();
		
	}
	public String ThankUmsg()
	{
		String Tmsg = thankUmsg.getText();
		return Tmsg;
		
	}
	public void ClickOnSingOffBtn()
	{
		singOffBtn.click();
		
	}
	
	
	
}
