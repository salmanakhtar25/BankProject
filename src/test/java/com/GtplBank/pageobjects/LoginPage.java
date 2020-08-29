package com.GtplBank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="uid")
	private WebElement untxtbx;
	
	@FindBy(name="password")
    private WebElement pwdtxtbx;
	
	@FindBy(name="btnLogin")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntxtbx() {
		return untxtbx;
	}

	public WebElement getPwdtxtbx() {
		return pwdtxtbx;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
}
