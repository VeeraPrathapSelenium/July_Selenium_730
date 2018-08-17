package com.WritingExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\tm\\Desktop\\New.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("NewSheet");
		
		XSSFRow row=sheet.createRow(0);
		
		XSSFCell cell=row.createCell(0);
		
		cell.setCellValue("I am writing excel");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		
		workbook.write(fos);
		
		fos.flush();
		
		fos.close();
		workbook.close();
		

	}

}
