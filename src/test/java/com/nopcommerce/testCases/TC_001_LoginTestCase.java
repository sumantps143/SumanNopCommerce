package com.nopcommerce.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;

public class TC_001_LoginTestCase extends BaseClass {
	
	
	@Test
	public void LoginTest() throws InterruptedException {
	//	driver.get(baseurl); paste it in baseclass.java
		logger.info("URL is opened");
		
		LoginPage lp= new LoginPage(driver);
		lp.setPassword(username);
		logger.info("username is entered");
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.clickSubmit();
		Thread.sleep(3000);
	    assertTrue(driver.getPageSource().contains("Dashboard / nopCommerce administration"));
	    logger.info("Test is passed");
		}

}
