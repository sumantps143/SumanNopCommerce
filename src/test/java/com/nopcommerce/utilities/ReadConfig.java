package com.nopcommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//Read variable from config.properties

public class ReadConfig {
	
	Properties pro;
	
	
	//create a constructor to load the page
	public ReadConfig() {
		
		File src= new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src); //it will open the file in read mode
			pro = new Properties();
			pro.load(fis); //it will load the complete file
		} catch (Exception e) {   //if file not present 
			System.out.println("Exception is "+e.getMessage());
			
		}
	}
	
	//Create a method for every variable
	
	//for url :it will read the value from config.properties and return the url to base class
	//like create for others
	//call belwo methods in base class by creating object.
	public String getApplicationUrl() {
		String url=pro.getProperty("baseurl");
		return url;
		
	}
	
	public String getUserName() {
		String username=pro.getProperty("username");
		return username;
		
	}
	
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
		
	}
	
	public String getChromePath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
		
	}
	
	
	public String getFireFoxPath() {
		String firfoxpath=pro.getProperty("firefoxpath");
		return firfoxpath;
		
	}
	
	
	public String getIEPath() {
		String iepath=pro.getProperty("iepath");
		return iepath;
		
	}
	
	

}
