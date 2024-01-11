package com.inetbaking.testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends Base_class{
	@Test
public void loginTest() throws IOException {
		driver.get(baseurl);
		logger.info("URL is opened");
		LoginPage ln=new LoginPage(driver);
		driver.manage().window().maximize();
		
			ln.setUsername(username);
			ln.setpass(Password);
			logger.info("entered password");
			ln.submitbtn();
			String title=driver.getTitle();
			System.out.println(title);
			//intentionally failing to see screenshot
			if (driver.getTitle().equals("GTPL Bank Manager HomePage1234")){
				
					System.out.println("it matches");
					//Assert.assertTrue(true);
					logger.info("it has passed");
				}
				else{
					
					captureScreen(driver,"loginTest");
					//Assert.assertTrue(false);
					System.out.println("it doesn't match");
				}
			

	
}
			}
		
	

