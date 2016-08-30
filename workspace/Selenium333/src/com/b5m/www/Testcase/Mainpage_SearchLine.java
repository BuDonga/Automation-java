package com.b5m.www.Testcase;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.b5m.www.Elements.*;
import com.b5m.www.Function.*;

public class Mainpage_SearchLine {
	WebDriver driver = new FirefoxDriver();
	private String url = "http://www.b5m.com/";
	Mainpage_Function mf = new Mainpage_Function(driver);
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.firefox.bin",Mainpage_Element.FirefoxBrowser);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);	
		
	}

	@After
	public void tearDown() throws Exception {
		if(driver!=null){
			driver.quit();
			driver=null;
		}		
	}

	@Test
	public void Search_Apple() throws InterruptedException {
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.SearchLine(Mainpage_Element.Apple);
		ef.Submit();
		//等待4秒，小助手消失，方便报错截图
		Thread.sleep(4000);
		if(!(mf.StringToFloat(ef.TotalAmount().getText())>42.00)){
			mf.Snapshot("Search_Apple");
		} else if(!(driver.getCurrentUrl().equals(Mainpage_Element.AppleUrl))){
			mf.Snapshot("Search_Apple_urlError");		
		}
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>42.00);
		assertEquals("页面跳转不正确",driver.getCurrentUrl(),Mainpage_Element.AppleUrl);			
	}
	
	@Test
	public void Search_Shoes() throws InterruptedException {
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.SearchLine(Mainpage_Element.Shoes);
		ef.Submit();
		//等待4秒，小助手消失，方便报错截图
		Thread.sleep(4000);
		if(!(mf.StringToFloat(ef.TotalAmount().getText())>24.00)){
			mf.Snapshot("Search_Shoes");
		}else if(!(driver.getCurrentUrl().equals(Mainpage_Element.ShoesUrl))){
			mf.Snapshot("Search_Shoes_urlError");		
		}
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>24.00);
		assertEquals("页面跳转不正确",driver.getCurrentUrl(),Mainpage_Element.ShoesUrl);			
	}

	@Test
	public void Search_Skirt() throws InterruptedException {
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.SearchLine(Mainpage_Element.Skirt);
		ef.Submit();
		//等待4秒，小助手消失，方便报错截图
		Thread.sleep(4000);
		if(!(mf.StringToFloat(ef.TotalAmount().getText())>24.00)){
			mf.Snapshot("Search_Skirt");
		} else if(!(driver.getCurrentUrl().equals(Mainpage_Element.SkirtUrl))){
			mf.Snapshot("Search_Skirt_urlError");		
		}
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>48.00);
		assertEquals("页面跳转不正确",driver.getCurrentUrl(),Mainpage_Element.SkirtUrl);				
	}
	
	@Test
	public void Search_Mobile() throws InterruptedException {
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.SearchLine(Mainpage_Element.Mobile);
		ef.Submit();
		//等待4秒，小助手消失，方便报错截图
		Thread.sleep(4000);
		if(!(mf.StringToFloat(ef.TotalAmount().getText())>3.0)){
			mf.Snapshot("Search_Mobile");
		} else if(!(driver.getCurrentUrl().equals(Mainpage_Element.MobileUrl))){
			mf.Snapshot("Search_Mobile_urlError");		
		}
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>3.0);
		assertEquals("页面跳转不正确",driver.getCurrentUrl(),Mainpage_Element.MobileUrl);		
	}
	
	@Test
	public void Search_Facial_Mask() throws InterruptedException {
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.SearchLine(Mainpage_Element.Facial_Mask);
		ef.Submit();
		//等待4秒，小助手消失，方便报错截图
		Thread.sleep(4000);
		if(!(mf.StringToFloat(ef.TotalAmount().getText())>16.00)){
			mf.Snapshot("Search_Facial_Mask");
		} else if(!(driver.getCurrentUrl().equals(Mainpage_Element.Facial_MaskUrl))){
			mf.Snapshot("Search_Facial_Mask_urlError");		
		}
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>16.00);
		assertEquals("页面跳转不正确",driver.getCurrentUrl(),Mainpage_Element.Facial_MaskUrl);
	}
	
	@Test
	public void Search_Longan() throws InterruptedException {
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.SearchLine(Mainpage_Element.Longan);
		ef.Submit();
		//等待4秒，小助手消失，方便报错截图
		Thread.sleep(4000);
		if(!(mf.StringToFloat(ef.TotalAmount().getText())>500.00)){
			mf.Snapshot("Search_Longan");
		} else if(!(driver.getCurrentUrl().equals(Mainpage_Element.LonganUrl))){
			mf.Snapshot("Search_Longan_urlError");		
		}
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>500.00);
		assertEquals("页面跳转不正确",driver.getCurrentUrl(),Mainpage_Element.LonganUrl);					
	}
}
