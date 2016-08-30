package com.b5m.www.Testcase;

import static org.junit.Assert.*;

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
import org.openqa.selenium.firefox.FirefoxDriver;

import com.b5m.www.Elements.*;
import com.b5m.www.Function.*;

public class SearchResult_Source {
	WebDriver driver = new FirefoxDriver();
	private String url = "http://www.b5m.com/";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.firefox.bin",Mainpage_Element.FirefoxBrowser);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		ef.SearchLine(Mainpage_Element.Mobile);
		ef.Submit();
		Thread.sleep(5000);
	}

	@After
	public void tearDown() throws Exception {
		if(driver!=null){
			driver.quit();
			driver=null;			
		}	
	}

	@Test
	public void Mobile_TaoBao() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("淘宝网");
		if (!(count==0)){
			mf.Snapshot("Mobile_TaoBao");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>2.00))){
			mf.Snapshot("Mobile_TaoBao_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>2.00);		
		
	}
	
	@Test
	public void Mobile_YiHoDian() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("一号店");
		if (!(count==0)){
			mf.Snapshot("YiHoDian");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>2600))){
			mf.Snapshot("Mobile_YiHoDian_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>2600);
			
	}
	
	@Test
	public void Mobile_SuNing() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("苏宁易购");
		if (!(count==0)){
			mf.Snapshot("Mobile_SuNing");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>2600))){
			mf.Snapshot("Mobile_SuNing_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>2600);
				
	}
	
	@Test
	public void Mobile_TianMao() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("天猫");
		if (!(count==0)){
			mf.Snapshot("Mobile_TianMao");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>1900))){
			mf.Snapshot("Mobile_TianMao_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>1900);
				
	}
	
	@Test
	public void Mobile_DangDang() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("当当网");
		if (!(count==0)){
			mf.Snapshot("Mobile_DangDang");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>1200))){
			mf.Snapshot("Mobile_DangDang_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>1200);
				
	}
	
	@Test
	public void Mobile_JingDong() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("京东商城");
		if (!(count==0)){
			mf.Snapshot("Mobile_JingDong");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>500))){
			mf.Snapshot("Mobile_JingDong_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>500);
				
	}
	
	@Test
	public void Mobile_YinTai() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("银泰网");
		if (!(count==0)){
			mf.Snapshot("Mobile_YinTai");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>280))){
			mf.Snapshot("Mobile_YinTai_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>280);
				
	}
	
	@Test
	public void Mobile_YiXun() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("易迅网");
		if (!(count==0)){
			mf.Snapshot("Mobile_YiXun");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>260))){
			mf.Snapshot("Mobile_YiXun_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>260);
				
	}

	@Test
	public void Mobile_WeiPinHui() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("唯品会");
		if (!(count==0)){
			mf.Snapshot("Mobile_WeiPinHui");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>70))){
			mf.Snapshot("Mobile_WeiPinHui_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>70);
				
	}
	
	@Test
	public void Mobile_ChaoHuaSuan() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("超划算");
		if (!(count==0)){
			mf.Snapshot("Mobile_ChaoHuaSuan");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>20))){
			mf.Snapshot("Mobile_ChaoHuaSuan_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>20);
				
	}
	
	@Test
	public void Mobile_YaMaXun() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("亚马逊");
		if (!(count==0)){
			mf.Snapshot("Mobile_YaMaXun");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>1))){
			mf.Snapshot("Mobile_YaMaXun_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>1);
				
	}
	
	@Test
	public void Mobile_YangMaTou() throws InterruptedException {	
		int count = 0;
		Mainpage_Function mf = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		count = mf.SourceExists("洋码头");
		if (!(count==0)){
			mf.Snapshot("Mobile_YangMaTou");			
		} 
		if (!((mf.StringToFloat(ef.TotalAmount().getText())>1))){
			mf.Snapshot("Mobile_YangMaTou_Amount");
		}
		assertTrue("商品来源没有隐藏",(count==0));
		assertTrue("搜索结果存在误差",mf.StringToFloat(ef.TotalAmount().getText())>1);
				
	}

}
