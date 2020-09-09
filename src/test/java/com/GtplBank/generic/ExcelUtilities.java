package com.GtplBank.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	String filepath;
	
	public  ExcelUtilities(String filepath){
		this.filepath=filepath;
	}

	public String ReadData(String SheetName,int row,int cell){
		String value=null;
		try{
		FileInputStream fis=new FileInputStream(new File(filepath));
		Workbook wb=WorkbookFactory.create(fis);
		Cell cl = wb.getSheet(SheetName).getRow(row).getCell(cell);
		switch(cl.getCellType()){
		case STRING:
			value=cl.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cl)){
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				value=sdf.format(cl.getDateCellValue());
			}
				else{
					long longvalue = (long)cl.getNumericCellValue();
					value=Long.toString(longvalue);
				}
			break;
		case BOOLEAN:
			value=Boolean.toString(cl.getBooleanCellValue());
			break;
			default:
				break;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return value;
	}
	
	public String WriteData(String SheetName,int row,int cell, String value){
		try{
		FileInputStream fis=new FileInputStream(new File(filepath));
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row rw = sh.getRow(row);
		Cell cl = rw.createCell(cell);
		cl.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(new File(filepath));
		wb.write(fos);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
}
