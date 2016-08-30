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

import com.b5m.www.Elements.Mainpage_Element;
import com.b5m.www.Elements.Mainpage_Element_FastSearch;
import com.b5m.www.Function.*;

public class Mainpage_FastSearch {
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
	public void FastSearchLine1() {
		Mainpage_Function handle = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.FastSearch1().click();
		handle.GoToNewWindow();	
		System.out.println(driver.getCurrentUrl());
		if(!(driver.getCurrentUrl().equals(Mainpage_Element_FastSearch.FastSearch_line1Url))){
			handle.Snapshot("FastSearchLine1");
		}
		assertEquals("页面跳转不对", driver.getCurrentUrl(),Mainpage_Element_FastSearch.FastSearcj_12Url);
		
	}

	@Test
	public void FastSearchLine2() {
		Mainpage_Function handle = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.FastSearch2().click();
		handle.GoToNewWindow();	
		System.out.println(driver.getCurrentUrl());
		if(!(driver.getCurrentUrl().equals(Mainpage_Element_FastSearch.FastSearch_line1Url))){
			handle.Snapshot("FastSearchLine2");
		}
		assertEquals("页面跳转不对", driver.getCurrentUrl(),Mainpage_Element_FastSearch.FastSearch_line1Url);
	}
	
	@Test
	public void FastSearchLine3() {
		Mainpage_Function handle = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.FastSearch3().click();
		handle.GoToNewWindow();	
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("404")){
			handle.Snapshot("FastSearchLine3");
		}
		assertFalse(driver.getCurrentUrl().contains("404"));
	}
	
	@Test
	public void FastSearchLine4() {
		Mainpage_Function handle = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.FastSearch4().click();
		handle.GoToNewWindow();	
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("404")){
			handle.Snapshot("FastSearchLine4");
		}
		assertFalse(driver.getCurrentUrl().contains("404"));
	}
	
	@Test
	public void FastSearchLine5() {
		Mainpage_Function handle = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.FastSearch5().click();
		handle.GoToNewWindow();	
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("404")){
			handle.Snapshot("FastSearchLine5");
		}
		assertFalse(driver.getCurrentUrl().contains("404"));
	}
	
	@Test
	public void FastSearchLine6() {
		Mainpage_Function handle = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.FastSearch6().click();
		handle.GoToNewWindow();	
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("404")){
			handle.Snapshot("FastSearchLine6");
		}
		assertFalse(driver.getCurrentUrl().contains("404"));
	}
	
	@Test
	public void FastSearchLine7() {
		Mainpage_Function handle = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.FastSearch7().click();
		handle.GoToNewWindow();	
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("404")){
			handle.Snapshot("FastSearchLine7");
		}
		assertFalse(driver.getCurrentUrl().contains("404"));
	}
	
	@Test
	public void FastSearchLine8() {
		Mainpage_Function handle = new Mainpage_Function(driver);
		Mainpage_ElementsFind ef = new Mainpage_ElementsFind(driver);
		ef.FastSearch8().click();
		handle.GoToNewWindow();	
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("404")){
			handle.Snapshot("FastSearchLine7");
		}
		assertFalse(driver.getCurrentUrl().contains("404"));
	}
}
