package com.ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	
		
		File excelfilepath=new File("C:\\Users\\tm\\Desktop\\Selenium.xlsx");
		
		FileInputStream fis=new FileInputStream(excelfilepath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("TestData");
		
		
		
		
		//Get the Total Row Count on Excel Sheet
		
		int rowcount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			
			XSSFRow row=sheet.getRow(i);
			
			
			int cellcount=row.getLastCellNum();
			
			for(int c=0;c<=cellcount;c++)
			
			{
				
				
				XSSFCell cell=row.getCell(c);
				
				if(!(cell==null))
					
				
				switch (cell.getCellTypeEnum()) {
				case STRING:
					
					String celldata=cell.getStringCellValue();
					
					System.out.println(celldata);
					
					
					break;
					
				case NUMERIC:
					int ncelldata=(int) cell.getNumericCellValue();
					System.out.println(ncelldata);
					break;

				default:
					break;
				}
			
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
