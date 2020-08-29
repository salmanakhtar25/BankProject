package com.GtplBank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	@FindBy(linkText="Manager")
	private WebElement Mngrlnk;

	@FindBy(linkText="New Customer")
	private WebElement NewCustlnk;

	@FindBy(linkText="Edit Customer")
	private WebElement editCustlnk;

	@FindBy(linkText="Delete Customer")
	private WebElement dltCustlnk;

	@FindBy(linkText="New Account")
	private WebElement NewAcctlnk;

	@FindBy(linkText="Edit Account")
	private WebElement EditAcctlnk;

	@FindBy(linkText="Delete Account")
	private WebElement DltAcctlnk;

	@FindBy(linkText="Deposit")
	private WebElement depositlnk;

	@FindBy(linkText="Withdrawal")
	private WebElement wthdrwllnk;

	@FindBy(linkText="Fund Transfer")
	private WebElement fundtrlnk;

	@FindBy(linkText="Change Password")
	private WebElement chngpwdlnk;

	@FindBy(linkText="Balance Enquiry")
	private WebElement balEnqlnk;

	@FindBy(linkText="Mini Statement")
	private WebElement minsttmtlnk;

	@FindBy(linkText="Customised Statement")
	private WebElement custsttmtlnk;

	@FindBy(linkText="Log out")
	private WebElement Lgoutlnk;

	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getMngrlnk() {
		return Mngrlnk;
	}

	public WebElement getNewCustlnk() {
		return NewCustlnk;
	}

	public WebElement getEditCustlnk() {
		return editCustlnk;
	}

	public WebElement getDltCustlnk() {
		return dltCustlnk;
	}

	public WebElement getNewAcctlnk() {
		return NewAcctlnk;
	}

	public WebElement getEditAcctlnk() {
		return EditAcctlnk;
	}

	public WebElement getDltAcctlnk() {
		return DltAcctlnk;
	}

	public WebElement getDepositlnk() {
		return depositlnk;
	}

	public WebElement getWthdrwllnk() {
		return wthdrwllnk;
	}

	public WebElement getFundtrlnk() {
		return fundtrlnk;
	}

	public WebElement getChngpwdlnk() {
		return chngpwdlnk;
	}

	public WebElement getBalEnqlnk() {
		return balEnqlnk;
	}

	public WebElement getMinsttmtlnk() {
		return minsttmtlnk;
	}

	public WebElement getCuststtmtlnk() {
		return custsttmtlnk;
	}

	public WebElement getLgoutlnk() {
		return Lgoutlnk;
	}

}
