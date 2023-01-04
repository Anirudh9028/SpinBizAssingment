package baseUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public static WebDriver driver;
	public static Properties pro;
	public static String path = System.getProperty("user.dir")+"//testdata//logindata";
	
	
	public void readConfigFile() 
	{
		pro = new Properties();
		try 
		{
			/*read the file*/
			FileInputStream fis= new FileInputStream(path);
			try 
			{
				/*load the file*/
				pro.load(fis);
			} 
			catch (IOException e) {e.printStackTrace();}
		} 
		catch (FileNotFoundException e) {e.printStackTrace();}
	}
	
	
	
	public void LunchBrowser (String browser ,String url) 
	{
		
		
		
		if(browser.equalsIgnoreCase("chrome")||browser.equalsIgnoreCase("ch")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();// open chrome browser
			
			
		}
		else if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("ff"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver(); // open Firefox browser
		}
		else 
		{
			System.out.println("Invalid Browser Name");
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	
}
