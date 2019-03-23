package com.writedata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Write 
{
	@Test	
	public void tc_1() throws Throwable
	{
		String patch="./Testdata/TestData.xlsx";
		FileInputStream fis=new FileInputStream(patch);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Sheet1");	
		Row row=sh.getRow(2);
		Cell cell=row.createCell(6);
		cell.setCellValue("kumar");
		FileOutputStream fos=new FileOutputStream("./Testdata/TestData.xlsx");
		wb.write(fos);
		wb.close();		
	}
}
