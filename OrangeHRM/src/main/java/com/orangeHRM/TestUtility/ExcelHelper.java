package com.orangeHRM.TestUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

	File file;
	FileInputStream inputStream;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	DataFormatter format;

	public ExcelHelper(String excelPath,String sheetName) {

		try {
		file = new File(excelPath);// location

		inputStream = new FileInputStream(file);// file extension get .xlsx

		workbook = new XSSFWorkbook(inputStream);
		
		sheet=workbook.getSheet(sheetName);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public String findCellValue(int rowNum,int cellNum) {

		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);
		format=new DataFormatter();
		return format.formatCellValue(cell);
	}

	public int findRowSize() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int findCellSize() {
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}

	public String[][] findCellValues(int rowSize,int cellSize) {

		String obj[][]=new String[rowSize][cellSize];
		
		for(int i=0; i<rowSize;i++)
		{
			for(int j=0; j<cellSize; j++)
			{
				row = sheet.getRow(i);//0
				cell = row.getCell(j);//2
				format=new DataFormatter();
				obj[i][j]=format.formatCellValue(cell);
			}
		}
		
		return obj;
	}
}
