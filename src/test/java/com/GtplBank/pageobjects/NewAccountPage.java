package com.GtplBank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage extends BasePage {
	
	@FindBy(name="cusid")
	private WebElement CustIdTxtBx;
	
	@FindBy(name="selaccount")
	private WebElement SelectAcctdd;
	
	@FindBy(name="inideposit")
	private WebElement DepositTxtBx;
	
	@FindBy(xpath="//input[@value='submit']")
	private WebElement SbmtBtn;
	
	@FindBy(className="heading3")
	private WebElement createAcctMsg;
	
	@FindBy(xpath="//td[text()='Account ID']/following-sibling::td")
	private WebElement AcctIdEle;
	
	public NewAccountPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getCustIdTxtBx() {
		return CustIdTxtBx;
	}

	public WebElement getSelectAcctdd() {
		return SelectAcctdd;
	}

	public WebElement getDepositTxtBx() {
		return DepositTxtBx;
	}

	public WebElement getSbmtBtn() {
		return SbmtBtn;
	}

	public WebElement getCreateAcctMsg() {
		return createAcctMsg;
	}

	public WebElement getAcctIdEle() {
		return AcctIdEle;
	}
    
}
