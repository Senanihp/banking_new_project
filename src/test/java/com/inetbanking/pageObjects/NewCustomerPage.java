package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	WebDriver ldriver;
public NewCustomerPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
@FindBy(xpath="//a[@href=\"addcustomerpage.php\"]")
WebElement NewCustomer_btn;

@FindBy(xpath="//input[@name=\"name\"]")
WebElement Customer_name;

@FindBy(xpath="//input[@type=\"date\"]")
WebElement Date;

@FindBy(xpath="//textarea[@name=\"addr\"]")
WebElement Address;

@FindBy(xpath="//input[@name=\"city\"]")
WebElement City;

@FindBy(xpath="//input[@name=\"state\"]")
WebElement State;

@FindBy(xpath="//input[@name=\"pinno\"]")
WebElement PIN;

@FindBy(xpath="//input[@name=\"emailid\"]")
WebElement Emailid;

@FindBy(xpath="//input[@name=\"sub\"]")
WebElement Submit_btn;

public void NewCutomer() {
	NewCustomer_btn.click();
}
public void CustomerName(String a) {
	CustomerName(a);
}
public void date(String mm,String dd,String yy) {
	Date.click();
	Date.sendKeys(mm);
	Date.sendKeys(dd);
	Date.sendKeys(yy);
	
}

public void Address(String add) {
	Address.sendKeys(add);
}
public void City(String Cityname) {
	City.sendKeys(Cityname);
}
public void State(String StateName) {
	State.sendKeys(StateName);
}
public void Pin(String pin) {
	PIN.sendKeys(pin);
}
public void Email(String email) {
	Emailid.sendKeys(email);
}
public void Submit() {
	Submit_btn.click();
}
}