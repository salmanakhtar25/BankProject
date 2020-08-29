package com.GtplBank.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.GtplBank.generic.BaseLib;
import com.google.common.io.Files;

public class MyTestListener implements ITestListener{
	public static int executioncount,passcount,failcount,skipcount=0;

	public void onFinish(ITestContext result) {
		Reporter.log("Framework execution ends",true);
		Reporter.log("Total scripts executed;"+executioncount++,true);
		Reporter.log("Total scripts passed",+passcount++,true);
		Reporter.log("Total scripts failed",+failcount++,true);
		Reporter.log("Total scripts skipped",+skipcount++,true);
		
	}

	public void onStart(ITestContext arg0) {
		Reporter.log("Framework execution starts:" +new Date(),true);
		
		
	}

	

	public void onTestFailure(ITestResult result) {
		failcount++;
		Reporter.log(result.getName()+" script is failed",true);
		TakesScreenshot ts=(TakesScreenshot) BaseLib.driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshots/"+result.getName()+".png");
		try{
			Files.copy(srcFile, destFile);
		}
		catch (IOException e){
			e.printStackTrace();
		}
		Reporter.log("Screenshot has been taken",true);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"script is skipped",true);

		
	}

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"script execution starts"+new Date(),true);

		
	}

	public void onTestSuccess(ITestResult result) {
		passcount++;
		Reporter.log(result.getName()+"script is passed",true);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
