package com.b5m.www.Testcase;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;








import com.b5m.www.Elements.*;
import com.b5m.www.Function.*;

public class SPU_Iphone6s {
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
	String WindowSwitch;
	Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
	Mainpage_Function mf = new Mainpage_Function(driver);
	private String url = "http://www.b5m.com/";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.setProperty("webdriver.firefox.bin",Mainpage_Element.FirefoxBrowser);
		System.setProperty("webdriver.chrome.driver",Mainpage_Element.ChromeBrowser);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {	
		mf.driverStart(url, 3);
		//ef.AdClosed().click();
		ef.SearchLine("iphone 6s");
		ef.Submit();
		//�ȴ�С�����Զ��ر�
		Thread.sleep(10000);
	}

	@After
	public void tearDown() throws Exception {
		if(driver!=null){
			driver.quit();
			driver=null;
		}	
		
	}

	@Test
	public void SPU_Iphone_6s_JingDong() throws InterruptedException {
		SPU_Element_Find sef = new SPU_Element_Find(driver);
		/*int number =sef.ResultEqual(2, "SPU_Iphone_6s_JiongDong");		
		assertEquals("iphone 6s SPU�����������ȷ", 2,number);*/
		//�ȴ�С�����Զ��ر�
		//Thread.sleep(10000);
		/*ef.SPU_Iphone6s().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();*/
		mf.SpuPrice("Iphone6s�۸��������");
		ef.Iphone6s_JingDong().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		Thread.sleep(10000);	
		mf.PageVerify("������Ʒ�¼�");			
		}
	
	@Test	
	public void SPU_Iphone_6s_DangDang() throws InterruptedException {
		/*SPU_Element_Find sef = new SPU_Element_Find(driver);
		int number =sef.ResultEqual(2, "SPU_Iphone_6s_DangDang");
		assertEquals("iphone 6s SPU�����������ȷ", 2,number);
		//�ȴ�С�����Զ��ر�
		Thread.sleep(10000);
		ef.SPU_Iphone6s().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();*/
		mf.SpuPrice("Iphone6s�۸��������");
		ef.Iphone6s_DangDang().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		Thread.sleep(10000);	
		mf.PageVerify("������Ʒ�¼�");
		}

	@Test	
	public void SPU_Iphone_6s_YiHaoDian() throws InterruptedException {
		/*SPU_Element_Find sef = new SPU_Element_Find(driver);
		int number =sef.ResultEqual(2, "SPU_Iphone_6s_YiHaoDian");
		assertEquals("iphone 6s SPU�����������ȷ", 2,number);
		//�ȴ�С�����Զ��ر�
		Thread.sleep(10000);
		ef.SPU_Iphone6s().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();*/
		mf.SpuPrice("Iphone6s�۸��������");
		ef.Iphone6s_YiHaoDian().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		Thread.sleep(15000);
		mf.PageVerify("һ�ŵ���Ʒ�¼�");
		}

	@Test	
	public void SPU_Iphone_6s_TianMao() throws InterruptedException {
		/*SPU_Element_Find sef = new SPU_Element_Find(driver);
		int number =sef.ResultEqual(2, "SPU_Iphone_6s_TianMao");
		assertEquals("iphone 6s SPU�����������ȷ", 2,number);
		//�ȴ�С�����Զ��ر�
		Thread.sleep(10000);
		ef.SPU_Iphone6s().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();*/
		mf.SpuPrice("Iphone6s�۸��������");
		ef.Iphone6s_TianMao().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		Thread.sleep(10000);
		mf.PageVerify("��è��Ʒ�¼�");
		}

	@Test	
	public void SPU_Iphone_6s_SuNing() throws InterruptedException {
		/*SPU_Element_Find sef = new SPU_Element_Find(driver);
		int number =sef.ResultEqual(2, "SPU_Iphone_6s_SuNing");
		assertEquals("iphone 6s SPU�����������ȷ", 2,number);
		//�ȴ�С�����Զ��ر�
		Thread.sleep(10000);
		ef.SPU_Iphone6s().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();*/
		mf.SpuPrice("Iphone6s�۸��������");
		ef.Iphone6s_SuNing().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		Thread.sleep(10000);	
		mf.PageVerify("������Ʒ�¼�");
		}

	@Test	
	public void SPU_Iphone_6s_YiXun() throws InterruptedException {
		/*SPU_Element_Find sef = new SPU_Element_Find(driver);
		int number =sef.ResultEqual(2, "SPU_Iphone_6s_YiXun");
		assertEquals("iphone 6s SPU�����������ȷ", 2,number);
		//�ȴ�С�����Զ��ر�
		Thread.sleep(10000);
		ef.SPU_Iphone6s().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();*/
		mf.SpuPrice("Iphone6s�۸��������");
		ef.Iphone6s_YiXun().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		Thread.sleep(10000);
		mf.PageVerify("��Ѹ��Ʒ�¼�");
		}

	@Test	
	public void SPU_Iphone_6s_GuoMei() throws InterruptedException {
		/*SPU_Element_Find sef = new SPU_Element_Find(driver);
		int number =sef.ResultEqual(2, "SPU_Iphone_6s_GuoMei");
		assertEquals("iphone 6s SPU�����������ȷ", 2,number);
		//�ȴ�С�����Զ��ر�
		Thread.sleep(10000);
		ef.SPU_Iphone6s().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();*/
		mf.SpuPrice("Iphone6s�۸��������");
		ef.Iphone6s_GuoMei().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		Thread.sleep(10000);
		mf.PageVerify("������Ʒ�¼�");
		/*if (!(((WindowSwitch = mf.GoToNewWindow()))==Mainpage_Element.GuoMeiUrl)){
			mf.Snapshot("������תʧ��");
		}
		System.out.println(driver.getCurrentUrl());
		assertEquals("ҳ����תʧ��",mf.GoToNewWindow(), Mainpage_Element.GuoMeiUrl);	*/	
		}
	

	}








