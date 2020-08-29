package com.GtplBank.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.GtplBank.features.CustomerFeatures;
import com.GtplBank.features.LoginFeatures;
import com.GtplBank.generic.BaseLib;
import com.GtplBank.generic.ExcelUtilities;

public class CustomerFeatureTest extends BaseLib {

	@Test(priority=3)
	public void addnewCustomer() throws EncryptedDocumentException, IOException{
		ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String username = eu.ReadData("Sheet1", 2, 0);
		String password = eu.ReadData("Sheet1", 2, 1);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		CustomerFeatures cf=new CustomerFeatures(driver);
		cf.AddCustomer();
		
	}
	@Test(priority=7)
	public void deletecustomer(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String username = eu.ReadData("Sheet1", 2, 0);
		String password = eu.ReadData("Sheet1", 2, 1);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		CustomerFeatures cf=new CustomerFeatures(driver);
		cf.DeleteCustomer();
		
	}
	@Test(priority=4)
	public void editcustomer(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String username = eu.ReadData("Sheet1", 2, 0);
		String password = eu.ReadData("Sheet1", 2, 1);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		CustomerFeatures cf=new CustomerFeatures(driver);
		cf.EditCustomer();
	}
}
