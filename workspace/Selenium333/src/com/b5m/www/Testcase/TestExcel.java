package com.b5m.www.Testcase;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(value = Parameterized.class)
public class TestExcel {
	private Logger logger = Logger.getLogger(TestCSV.class);
	private String name;
	private String age;
	private String weight;
	private String height;
	
	@Parameters
	public static Collection<String[]> testData () throws IOException{
	InputStream is = new FileInputStream("E:\\Work\\SVN\\10.Product Mng\\20.PPG\\30.Development Mng\\60.Automation\\workspace\\Selenium333\\Excel\\ExcelData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(is);
	
	//获得工作表
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	//得到总行数
	int rowNum = sheet.getLastRowNum();
	List<String[]> records = new ArrayList<String[]>();
		for (int i = 1; i <=rowNum; i++) {
	// 当前行
			XSSFRow row = sheet.getRow(i);
			int colNum = row.getLastCellNum();
			String[] data = new String[colNum];
			for (int j = 0; j < colNum; j++) {
				data[j] = row.getCell(j).getStringCellValue();
			}
			records.add(data);
		}
		return records;
	}
	
	public TestExcel(String name,String age ,String weight ,String height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void 熊出没() {
		logger.info("名字："+ name + " 年龄：" + age + " 身高:" + height + " 体重："+ weight);
		System.out.println("名字："+ name + " 年龄：" + age + " 身高:" + height + " 体重："+ weight);

	}

}
