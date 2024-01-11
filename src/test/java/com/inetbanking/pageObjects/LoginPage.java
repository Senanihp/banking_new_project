package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
ldriver=rdriver;
PageFactory.initElements(rdriver, this);
}
	@FindBy(xpath="//input[@name=\"uid\"]")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement lgnbtn;
	
public void setUsername(String uname) {
	txtUserName.sendKeys(uname);
}
public void setpass(String pwd) {
	Password.sendKeys(pwd);
}
public void submitbtn() {
	lgnbtn.click();
}
}