package com.GtplBank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage extends BasePage {

	@FindBy(name="name")
	private WebElement CustNametxtbx;

	@FindBy(id="dob")
	private WebElement DobTextBx;

	@FindBy(xpath="//input[@value='m']")
	private WebElement malerdioBtn;

	@FindBy(xpath="//input[@value='f']")
	private WebElement femalerdioBtn;

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

	@FindBy(name="password")
	private WebElement pwdTxtbx;


	@FindBy(name="sub")
	private WebElement sbmtBtn;


	@FindBy(name="res")
	private WebElement RstBtn;

	@FindBy(xpath="//p[@class='heading3']")
	private WebElement NewCustMsg;

	@FindBy(xpath="//td[text()='Customer ID']/following-sibling::td")
	private WebElement custIdele;

	@FindBy(xpath="//table[@border='1']")
	private WebElement Table;





	public NewCustomerPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}



	public WebElement getTable() {
		return Table;
	}


	public WebElement getCustIdele() {
		return custIdele;
	}



	public WebElement getNewCustMsg() {
		return NewCustMsg;
	}


	public WebElement getCustNametxtbx() {
		return CustNametxtbx;
	}


	public WebElement getDobTextBx() {
		return DobTextBx;
	}


	public WebElement getMalerdioBtn() {
		return malerdioBtn;
	}


	public WebElement getFemalerdioBtn() {
		return femalerdioBtn;
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


	public WebElement getPwdTxtbx() {
		return pwdTxtbx;
	}


	public WebElement getSbmtBtn() {
		return sbmtBtn;
	}


	public WebElement getRstBtn() {
		return RstBtn;
	}

}
