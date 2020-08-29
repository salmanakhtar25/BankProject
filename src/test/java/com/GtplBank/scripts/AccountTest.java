package com.GtplBank.scripts;

import org.testng.annotations.Test;

import com.GtplBank.features.AccountFeatures;
import com.GtplBank.features.LoginFeatures;
import com.GtplBank.generic.BaseLib;
import com.GtplBank.generic.ExcelUtilities;

public class AccountTest extends BaseLib {
  
  @Test(priority=5)
  public void createAccount() {
	  ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String username = eu.ReadData("Sheet1", 2, 0);
		String password = eu.ReadData("Sheet1", 2, 1);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		AccountFeatures af=new AccountFeatures(driver);
		af.CreateNewAccount();
  }
  @Test(priority=6)
  public void deleteAccount(){
	  ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
		String username = eu.ReadData("Sheet1", 2, 0);
		String password = eu.ReadData("Sheet1", 2, 1);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		AccountFeatures af=new AccountFeatures(driver);
		af.DeleteAccount();
  }
  
}
