package com.b5m.www.Testcase;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

import com.b5m.www.Function.Data_Split;
import com.b5m.www.Function.Mainpage_Function;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.*;

	@RunWith(value = Parameterized.class)
	public class TestCSV {
	private Logger logger = Logger.getLogger(TestCSV.class);
	private String name;
	private String age;
	private String weight;
	private String height;
	
	//������
	@Parameters
	public static Collection<String[]> testData() {
		return getTestData("E:\\Work\\SVN\\10.Product Mng\\20.PPG\\30.Development Mng\\60.Automation\\workspace\\Selenium333\\CSV\\data.csv");
	}
	
	//���캯����ֵ
	public TestCSV(String name,String age ,String weight ,String height) {
	this.name = name;
	this.age = age;
	this.weight = weight;
	this.height = height;
	}
	
	//��ȡCSV�е��ļ�
	public static Collection<String[]> getTestData(String path){
	List<String[]> records = new ArrayList<String[]>();
	String row;
	try {
	BufferedReader br = new BufferedReader(new FileReader(path));
	while ((row = br.readLine())!=null) {
	String fields[] = row.split(",");
	records.add(fields);
	}
	br.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	
	return records;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		logger.info("���֣�"+ name + " ���䣺" + age + " ���:" + height + " ���أ�"+ weight);
		System.out.println("���֣�"+ name + " ���䣺" + age + " ���:" + height + " ���أ�"+ weight);
		}
	}

