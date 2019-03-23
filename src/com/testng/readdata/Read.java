package com.testng.readdata;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read 
{
	public static void main(String[] args) throws Throwable
	{
		String filepath="./Testdata/Worksheet.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet1");
		Row rw=sh.getRow(0);
		String data=rw.getCell(0).getStringCellValue();
		String data1=rw.getCell(1).getStringCellValue();
		String data2=rw.getCell(2).getStringCellValue();
		int data3=(int) rw.getCell(3).getNumericCellValue();
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		wb.close();
	}
}