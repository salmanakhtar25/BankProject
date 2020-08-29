package com.GtplBank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage extends BasePage{

	@FindBy(name="cusid")
	private WebElement CustIdtxtbx;
	
	@FindBy(name="AccSubmit")
	private WebElement CustIdsbmtbtn;
	
	@FindBy(name="name")
	private WebElement CustNametxtbx;
	
	@FindBy(name="dob")
	private WebElement DobTextBx;

    @FindBy(name="gender")
	private WebElement gendertxtbx;

	
	@FindBy(name="addr")
	private WebElement AddrTextBx;

	@FindBy(name="city")
	private WebElement ctyTxtbx;

	@FindBy(name="state")
	private WebElement stateTxtbx;

	@FindBy(name="pinno")
	private WebElement pinTxtbx;

	@FindBy(name="telephoneno")
	private WebElement MobnoTxtbx;

	@FindBy(name="emailid")
	private WebElement emailTxtbx;

	
    @FindBy(name="sub")
	private WebElement sbmtBtn;


	@FindBy(name="res")
	private WebElement RstBtn;
	
	@FindBy(className="heading3")
	private WebElement editMsgEle;
	
	public EditCustomerPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
	

	public WebElement getCustIdtxtbx() {
		return CustIdtxtbx;
	}


	public WebElement getCustIdsbmtbtn() {
		return CustIdsbmtbtn;
	}


	public WebElement getCustNametxtbx() {
		return CustNametxtbx;
	}

	public WebElement getDobTextBx() {
		return DobTextBx;
	}

	public WebElement getGendertxtbx() {
		return gendertxtbx;
	}

	public WebElement getAddrTextBx() {
		return AddrTextBx;
	}

	public WebElement getCtyTxtbx() {
		return ctyTxtbx;
	}

	public WebElement getStateTxtbx() {
		return stateTxtbx;
	}

	public WebElement getPinTxtbx() {
		return pinTxtbx;
	}

	public WebElement getMobnoTxtbx() {
		return MobnoTxtbx;
	}

	public WebElement getEmailTxtbx() {
		return emailTxtbx;
	}

	public WebElement getSbmtBtn() {
		return sbmtBtn;
	}

	public WebElement getRstBtn() {
		return RstBtn;
	}


	public WebElement getEditMsgEle() {
		return editMsgEle;
	}
	
	
	
	
	
	
	
	
}
