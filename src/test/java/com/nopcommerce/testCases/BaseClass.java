package com.nopcommerce.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.nopcommerce.utilities.ReadConfig;


//All common steps before and after test
public class BaseClass {
	
	
	ReadConfig readconfig=new ReadConfig();
	public String baseurl=readconfig.getApplicationUrl();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
	
	
	//public String baseurl="https://admin-demo.nopcommerce.com/login";
	//public String username="admin@yourstore.com";
	//public String password="admin";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")  //bcz it takes parameters from xml
	@BeforeClass
	public void setUp(String br) 
	{
		 logger =Logger.getLogger("nopcommerce");
		 PropertyConfigurator.configure("log4j.properties");
		//System.setProperty("webdriver.chrome.driver","E:/POMWorkspaceComm/nopcommerceV1/Drivers/chromedriver.exe");
		
		//Note:pass the parameter from the xml to launch on different browser.
		 
		 if(br.equals("chrome"))
		 {
		        System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		        driver=new ChromeDriver();
		 }
		 
		 else if (br.equals("firfox")) {
			 System.setProperty("webdriver.gecko.driver",readconfig.getFireFoxPath());
			 driver=new FirefoxDriver();
		 }
		 
		 else if (br.equals("ie")) {
			 System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			 driver=new InternetExplorerDriver();
		 }
		 
		 driver.get(baseurl);
		 
		 
	}

	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
}
