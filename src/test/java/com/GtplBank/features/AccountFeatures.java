package com.GtplBank.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.GtplBank.generic.ExcelUtilities;
import com.GtplBank.pageobjects.DeleteAccountPage;
import com.GtplBank.pageobjects.NewAccountPage;

public class AccountFeatures {
	WebDriver driver;
	NewAccountPage nap;
	DeleteAccountPage dap;
	
	public AccountFeatures(WebDriver driver){
		this.driver=driver;
		nap=new NewAccountPage(driver);
		dap=new DeleteAccountPage(driver);
	}
	
	public void CreateNewAccount(){
		nap.getNewAcctlnk().click();
		ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String custid = eu.ReadData("Sheet2", 1, 0);
		nap.getCustIdTxtBx().sendKeys(custid);
		WebElement AccountType = nap.getSelectAcctdd();
		Select Account=new Select(AccountType);
		Account.selectByVisibleText("Savings");
		String Deposit = eu.ReadData("Sheet1", 11, 0);
		nap.getDepositTxtBx().sendKeys(Deposit);
		nap.getSbmtBtn().click();
		String ActualMsg = nap.getCreateAcctMsg().getText();
		String ExpectedMsg = "Account Generated Successfully!!!";
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		String AccountId = nap.getAcctIdEle().getText();
		String AccountNo = eu.WriteData(1, 1, AccountId);
		Reporter.log("your account number is "+AccountNo, true);
	}
	
	public void DeleteAccount(){
		dap.getDltAcctlnk().click();
		ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String AccountNo = eu.ReadData("Sheet2", 1, 1);
		dap.getAcctNoTxtBx().sendKeys(AccountNo);
		dap.getAcctSbmtBtn().click();
		String DeleteMsg = driver.switchTo().alert().getText();
		String ExpectedMsg = "Account Deleted Sucessfully";
		Assert.assertEquals(DeleteMsg, ExpectedMsg);
		Reporter.log(DeleteMsg, true);
		driver.switchTo().alert().accept();
		
	}

}
