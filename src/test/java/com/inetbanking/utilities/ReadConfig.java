package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
public ReadConfig(){
	File src=new File("./configuration/config.properties");
	
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
	catch(Exception e){
		System.out.println("Exception is" +e.getMessage());
			
		}
	}
public String getApplicationURL() {
	String url=pro.getProperty("baseurl");
	return url;
}
public String getUsername() {
	String username=pro.getProperty("username");
	return username;
}
public String getPassword() {
	String password=pro.getProperty("Password");
	return password;
}
public String getchrome() {
	String chrome=pro.getProperty("Chromedriver");
	return chrome;

}
public String getedge() {
	String edge=pro.getProperty("edgedriver");
	return edge;
}
}
