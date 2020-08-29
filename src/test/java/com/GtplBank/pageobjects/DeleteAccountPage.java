package com.GtplBank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage extends BasePage{
	
	@FindBy(name="accountno")
	private WebElement AcctNoTxtBx;
	
	@FindBy(name="AccSubmit")
	private WebElement AcctSbmtBtn;
	
	public DeleteAccountPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getAcctNoTxtBx() {
		return AcctNoTxtBx;
	}

	public WebElement getAcctSbmtBtn() {
		return AcctSbmtBtn;
	}
	

}
