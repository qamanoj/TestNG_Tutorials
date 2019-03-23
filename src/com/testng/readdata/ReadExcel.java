package com.testng.readdata;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel
{
	public static void main(String[] args) throws Throwable 
	{
		String filepath="./TestData/Worksheet.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet1");
		int rw=sh.getLastRowNum();
		System.out.println(rw);//3
		for(int i=0;i<=rw;i++)
		{
			String data=sh.getRow(i).getCell(2).getStringCellValue();
			System.out.println(data);
		}
		wb.close();
	}
}
