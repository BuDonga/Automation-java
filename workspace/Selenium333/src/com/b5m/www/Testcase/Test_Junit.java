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

public class Test_Junit {
	WebDriver driver = new ChromeDriver();
	Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
	Mainpage_Function mf = new Mainpage_Function(driver);
	private String url = "http://www.b5m.com/";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver",Mainpage_Element.ChromeBrowser);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {	
		
	}

	@After
	public void tearDown() throws Exception {
		if(driver!=null){
			driver.quit();
			driver=null;
		}	
		
	}

	@Test
	public void SPU_Iphone_6s_Plus_JingDong() throws InterruptedException {
		SPU_Element_Find sef = new SPU_Element_Find(driver);
		int number =sef.ResultEqual(2, "SPU_Iphone_6s_Plus_JiongDong");
		assertEquals("iphone 6s Plus SPU结果数量不正确", 2,number);
		//等待小助手自动关闭
		Thread.sleep(10000);
		ef.SPU_Iphone6s_Plus().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		mf.SpuPrice("Iphone6s_Plus价格排序错误");
		ef.Iphone6s_Plus_JingDong().click();
		mf.GoToNewWindow();
		mf.GoToNewWindow();
		Thread.sleep(10000);		
		mf.PageVerify("京东商品下架_6s_Plus");
		System.out.println("This a testing11111111");
		}
	
	
	}









