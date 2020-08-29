package com.GtplBank.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GtplBank.features.LoginFeatures;
import com.GtplBank.generic.BaseLib;
import com.GtplBank.generic.ExcelUtilities;


public class LoginTest extends BaseLib {
  @Test(priority=1)
  public void validLogin() {
	  ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
	  String username = eu.ReadData("Sheet1", 2, 0);
	  String password = eu.ReadData("Sheet1", 2, 1);
	  LoginFeatures lf=new LoginFeatures(driver);
	  lf.login(username, password);
	  String actualTitle = driver.getTitle();
	  Reporter.log(actualTitle, true);
	  String ExpectedTitle = "Guru99 Bank Manager HomePage"; 
	  Assert.assertEquals(ExpectedTitle, actualTitle);
	  
  }
  @Test(priority=2)
  public void InvalidLogin() {
	  ExcelUtilities eu=new ExcelUtilities("./testdata/GtplTestdata.xlsx");
	  String username = eu.ReadData("Sheet1", 2, 2);
	  String password = eu.ReadData("Sheet1", 2, 3);
	  LoginFeatures lf=new LoginFeatures(driver);
	  lf.login(username, password);
	  String ActualText = driver.switchTo().alert().getText();
	  Reporter.log(ActualText,true);
	  String ExpectedText = "User is not valid";
	  Assert.assertEquals(ExpectedText, ActualText);
	  driver.switchTo().alert().accept();
	  
}
}