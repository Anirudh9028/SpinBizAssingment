package baseUtility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readConfigFile extends base
{	
		Properties pro;
		String path = System.getProperty("user.dir")+"//testdata//logindata";
		
		

		/*Constructor*/
		public readConfigFile() 
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
		
		/*for url*/
		public String getURL() 
		{
			/*here use key to get value*/
			String url = pro.getProperty("url");// get KEY value from file
			if(url!=null) {return url;}// check whether its not null
			else
			{throw new RuntimeException("url not specified in config file");} //if null then throw run time exception
		}
		
		/*for valid user name*/
		public String getUserName() 
		{
			String username = pro.getProperty("username");// get KEY value from file
			if(username!=null) {return username;}// check whether its not null
			else
			{throw new RuntimeException("username not specified in config file");} //if null then throw run time exception
		}
		
		/*for valid password*/
		public String getPassword() 
		{
			String password = pro.getProperty("password");// get KEY value from file
			if(password!=null) {return password;}// check whether its not null
			else
			{throw new RuntimeException("password not specified in config file");} //if null then throw run time exception
		}
		
		/*for invalid user name*/
		public String Inusername() 
		{
			String inusername = pro.getProperty("inusername");// get KEY value from file
			if(inusername!=null) {return inusername;}// check whether its not null
			else
			{throw new RuntimeException("inusername not specified in config file");} //if null then throw run time exception
		}
		
		/*for invalid password*/
		public String getInpassword() 
		{
			String inpassword = pro.getProperty("inpassword");// get KEY value from file
			if(inpassword!=null) {return inpassword;}// check whether its not null
			else
			{throw new RuntimeException("inpassword not specified in config file");} //if null then throw run time exception
		}
		public String getBrowser() 
		{
			String brw = pro.getProperty("browser");// get KEY value from file
			if(brw!=null) {return brw;}// check whether its not null
			else
			{throw new RuntimeException("brw not specified in config file");} //if null then throw run time exception
		}
		
		
		public String getLoginMainUrl() 
		{
			String loginMainUrl = pro.getProperty("loginMainUrl");// get KEY value from file
			if(loginMainUrl!=null) {return loginMainUrl;}// check whether its not null
			else
			{throw new RuntimeException("loginMainUrl not specified in config file");} //if null then throw run time exception
		}
		public String getAmount() 
		{
			String amount = pro.getProperty("amount");// get KEY value from file
			if(amount!=null) {return amount;}// check whether its not null
			else
			{throw new RuntimeException("amount not specified in config file");} //if null then throw run time exception
		}
		public String getTextdata() 
		{
			String textdata = pro.getProperty("textdata");// get KEY value from file
			if(textdata!=null) {return textdata;}// check whether its not null
			else
			{throw new RuntimeException("textdata not specified in config file");} //if null then throw run time exception
		}
		
		public String getIndexUrl() 
		{
			String indexUrl = pro.getProperty("indexUrl");// get KEY value from file
			if(indexUrl!=null) {return indexUrl;}// check whether its not null
			else
			{throw new RuntimeException("indexUrl not specified in config file");} //if null then throw run time exception
		}
	}


