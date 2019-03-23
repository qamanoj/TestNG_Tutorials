package com.testng.readdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readAndWrite 
{
	public static void main(String[] args) throws Throwable 
	{
		String patch="./Testdata/TestFile.xlsx";
		FileInputStream file=new FileInputStream(patch);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(4);
		String s=rw.getCell(0).getStringCellValue();
		String s1=rw.getCell(1).getStringCellValue();
		String s2=rw.getCell(2).getStringCellValue();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("*************");
		int a=sh.getLastRowNum();
		System.out.println(a);
		for(int i=0;i<=a;i++)
		{
			String data=sh.getRow(i).getCell(2).getStringCellValue();
			System.out.println(data);
		}
		System.out.println("write in excellSheet");
		Cell cell=rw.createCell(5);
		cell.setCellValue("PASS EXCEL");
		FileOutputStream fl=new FileOutputStream(patch);
		wb.write(fl);
		wb.getClass();
	}
}
