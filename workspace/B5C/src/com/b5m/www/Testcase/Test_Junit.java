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
	Mainpage_Elements ef = new Mainpage_Elements(driver);
	Mainpage_Function mf = new Mainpage_Function(driver);
	private String url = "http://www.b5m.com/";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver",Globel_Element.ChromeBrowser);
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
	}
	
	
	}









