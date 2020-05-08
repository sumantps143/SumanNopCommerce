package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver; //create the driver object 
	
	public  LoginPage(WebDriver rdriver)  //create a constructor and  driver as parameter
	{
		//initiate the driver using init elements
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//identify the elements which are present in login page
	
	@FindBy(id="Email")
    WebElement textEmail;
	
	@FindBy(id="Password")
	WebElement textPwd;
	
	@FindBy(xpath="//*[@value='Log in']")
	WebElement btnLogin;
	
	
	//Action methods
	
	public void setUserName(String uName){
		textEmail.clear();
		textEmail.sendKeys(uName);
	}
	
    
	public void setPassword(String pwd) {
		textPwd.clear();
		textPwd.sendKeys(pwd);
	}
	
	public void clickSubmit(){
		btnLogin.click();
	}
	
	
	
}
