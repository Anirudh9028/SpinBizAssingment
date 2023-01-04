package PomAltroMutual;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtility.base;


public class LoginPagePom extends base
{
	/* test case 1 to 4*/
	
	
	
	
	public LoginPagePom()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id = "uid") WebElement userName;
	
	@FindBy(id = "passw") WebElement passWord;
	
	@FindBy(xpath = "//input[@value = 'Login']") WebElement loginBtn;
	
	
	public void Username(String usr) {
		 userName.sendKeys(usr);
		
		}
	
	
	public void Password(String pwd) {
		passWord.sendKeys(pwd);
		
		
	}
	
	public void LoginBtn() {
		
		loginBtn.click();
	}

}
