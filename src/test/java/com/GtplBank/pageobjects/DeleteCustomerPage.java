package com.GtplBank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage extends BasePage {

	@FindBy(name="cusid")
	private WebElement custIdtxtBx;

	@FindBy(name="AccSubmit")
	private WebElement sbmtBtn;

	@FindBy(name="res")
	private WebElement RstBtn;

	public DeleteCustomerPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public WebElement getCustIdtxtBx() {
		return custIdtxtBx;
	}

	public WebElement getSbmtBtn() {
		return sbmtBtn;
	}
	public WebElement getRstBtn() {
		return RstBtn;
	}

}
