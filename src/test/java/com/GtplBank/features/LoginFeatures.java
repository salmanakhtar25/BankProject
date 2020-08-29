package com.GtplBank.features;

import org.openqa.selenium.WebDriver;

import com.GtplBank.pageobjects.LoginPage;

public class LoginFeatures {
	WebDriver driver;
	LoginPage lp;
	public LoginFeatures(WebDriver driver){
		this.driver=driver;
		lp=new LoginPage(driver);
	}
	
	public void login(String Username,String Password){
		lp.getUntxtbx().sendKeys(Username);
		lp.getPwdtxtbx().sendKeys(Password);
		lp.getLoginbtn().click();
		}

}
