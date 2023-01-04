package PomAltroMutual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseUtility.base;

public class accountSumaryPom extends base 
{

	/* test case 5 to 7 */
	

	
	
	public accountSumaryPom()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='View Account Summary']") WebElement accountSummary;
	
	@FindBy(xpath = "//select[@id='listAccounts']") WebElement drpDown;
	
	@FindBy(xpath = "//input[@id = 'btnGetAccount']") WebElement goBtn;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[2]/div/table/tbody/tr[1]/td/table/tbody/tr[4]/td[1]") 
	WebElement banlance;
	
	
	public void AccountSummary()
	{
		 
		accountSummary.click();
	}
	
	public void DropDown() 
	{
		 
		Select val = new Select(drpDown);
		val.selectByVisibleText("800001 Checking");
	}
	
	public String Balance() 
	{
		String bal = banlance.getText();
		return bal;
		
	}
	
	public void GoBtn() 
	{
		goBtn.click();
		
	}





}
