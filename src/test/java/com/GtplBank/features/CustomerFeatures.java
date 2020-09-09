package com.GtplBank.features;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.GtplBank.generic.ExcelUtilities;
import com.GtplBank.pageobjects.DeleteCustomerPage;
import com.GtplBank.pageobjects.EditCustomerPage;
import com.GtplBank.pageobjects.NewCustomerPage;


public class CustomerFeatures {
	WebDriver driver;
	NewCustomerPage ncp;
	DeleteCustomerPage dcp;
	EditCustomerPage ecp;

	public CustomerFeatures(WebDriver driver){
		this.driver=driver;
		ncp=new NewCustomerPage(driver);
		ecp=new EditCustomerPage(driver);
		dcp=new DeleteCustomerPage(driver);
	}

	public void AddCustomer(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String CustName = eu.ReadData("Sheet1", 5, 0);
		String dob=eu.ReadData("Sheet1", 5, 1);
		String Address=eu.ReadData("Sheet1", 5, 2);
		String city=eu.ReadData("Sheet1", 5, 3);
		String State=eu.ReadData("Sheet1", 5, 4);
		String pin=eu.ReadData("Sheet1", 5, 5);
		String Mobno=eu.ReadData("Sheet1", 5, 6);
		String Email=eu.ReadData("Sheet1", 5, 7);
		String password=eu.ReadData("Sheet1", 5, 8);
		ncp.getNewCustlnk().click();
		ncp.getCustNametxtbx().sendKeys(CustName);
		ncp.getMalerdioBtn().click();
		ncp.getDobTextBx().sendKeys(dob);
		ncp.getAddrTextBx().sendKeys(Address);
		ncp.getCtyTxtbx().sendKeys(city);
		ncp.getStateTxtbx().sendKeys(State);
		ncp.getPinTxtbx().sendKeys(pin);
		ncp.getMobnoTxtbx().sendKeys(Mobno);
		ncp.getEmailTxtbx().sendKeys(Email);
		ncp.getPwdTxtbx().sendKeys(password);
		ncp.getSbmtBtn().click();
		String ExpectedMsg="Customer Registered Successfully!!!";
		String ActualMsg=ncp.getNewCustMsg().getText();
		Assert.assertEquals(ExpectedMsg, ActualMsg);
		String CustId = ncp.getCustIdele().getText();
		try{
		eu.WriteData("Sheet2",1, 0, CustId);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		WebElement table = ncp.getTable();
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++){
			WebElement row = rows.get(i);
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++){
				WebElement column = cols.get(j);
				String value = column.getText();
				Reporter.log(value, true);
			}
			
		}
		

	}
	
	public void EditCustomer(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String Address=eu.ReadData("Sheet1", 8, 0);
		String city=eu.ReadData("Sheet1", 8, 1);
		String State=eu.ReadData("Sheet1", 8, 2);
		String pin=eu.ReadData("Sheet1", 8, 3);
		String Mobno=eu.ReadData("Sheet1", 8, 4);
		String Email=eu.ReadData("Sheet1", 8, 5);
		ecp.getEditCustlnk().click();
		String custid = eu.ReadData("Sheet2", 1, 0);
		ecp.getCustIdtxtbx().sendKeys(custid);
	    ecp.getCustIdsbmtbtn().click();
	    ecp.getAddrTextBx().clear();
	    ecp.getAddrTextBx().sendKeys(Address);;
	    ecp.getCtyTxtbx().clear();
	    ecp.getCtyTxtbx().sendKeys(city);
	    ecp.getStateTxtbx().clear();
	    ecp.getStateTxtbx().sendKeys(State);
	    ecp.getPinTxtbx().clear();
	    ecp.getPinTxtbx().sendKeys(pin);
	    ecp.getMobnoTxtbx().clear();
	    ecp.getMobnoTxtbx().sendKeys(Mobno);
	    ecp.getEmailTxtbx().clear();
	    ecp.getEmailTxtbx().sendKeys(Email);
	    ecp.getSbmtBtn().click();
	    String actualtext = ecp.getEditMsgEle().getText();
	    Reporter.log(actualtext, true);
	    String ExpectedText = "Customer details updated Successfully!!!";
	    Assert.assertEquals(ExpectedText, actualtext);
	}

	public void DeleteCustomer(){
		dcp.getDltCustlnk().click();
		ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String custid = eu.ReadData("Sheet2", 1, 0);
		dcp.getCustIdtxtBx().sendKeys(custid);
		dcp.getSbmtBtn().click();
		String DeleteMsg = driver.switchTo().alert().getText();
		String EpectedMsg = "Customer deleted Successfully";
		Assert.assertEquals(EpectedMsg, DeleteMsg);
		Reporter.log(DeleteMsg, true);
		driver.switchTo().alert().accept();
	}

}
