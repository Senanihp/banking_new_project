package com.inetbaking.testcases;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base_class {
	ReadConfig readconfig=new ReadConfig();
	
public String baseurl=readconfig.getApplicationURL();
public String username=readconfig.getUsername();
public String Password=readconfig.getPassword();
public static WebDriver driver;

public static Logger logger;

@Parameters("Browser")
@BeforeClass
public void Setup(String br) {
	
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("--remote-allow-origins=*");
	//options.addArguments("--disable-notifications");
	//driver=new ChromeDriver(options);
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\java programs\\Banking_mini_project\\drivers\\chromedriver.exe");
	//logger=Logger.getLogger("ebanking");
	//PropertyConfigurator.configure("Log4j.properties");
	
	if(br.equals("chrome")) {
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
    WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	}
	else{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\mseedgedriver.exe");
		driver=new EdgeDriver();
		
	}
	
	driver.get(baseurl);

		
	
}
@AfterClass
public void Teardown() {
	{
		driver.quit();
	}
}
	public void captureScreen(WebDriver driver , String tname)throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+ tname+".png");
		FileUtils.copyFile(src, target);
		System.out.println("screenshot taken");
	}
}

