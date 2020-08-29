package com.GtplBank.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib {
public static WebDriver driver;

@BeforeMethod
@Parameters({"Browser","url"})
public void precondition(String Browser,String url){
	driver=BrowserFactory.launchBrowser(Browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	}

@AfterMethod
public void postCondition(){
	driver.close();
}

}
