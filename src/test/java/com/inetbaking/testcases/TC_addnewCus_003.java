package com.inetbaking.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.NewCustomerPage;

public class TC_addnewCus_003 extends Base_class{
@Test
public void addnew() throws InterruptedException {
driver.get(baseurl);
logger.info("URL is opened");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
LoginPage ln=new LoginPage(driver);
	ln.setUsername(username);
	ln.setpass(Password);
	logger.info("entered password");
	ln.submitbtn();
	
	NewCustomerPage c1=new NewCustomerPage(driver);
	//driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
	c1.NewCutomer();
	c1.CustomerName("senani");
	c1.date("11","05","1999");
	c1.Address("bengaluruu");
	c1.City("bengaluru");
	c1.State("karnataka");
	c1.Pin("560098");
	c1.Email("senanigowda11@gmail.com");
	
	c1.Submit();
	
	
}

}