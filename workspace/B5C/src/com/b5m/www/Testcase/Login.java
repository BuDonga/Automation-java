package com.b5m.www.Testcase;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.b5m.www.Business.*;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.b5m.www.Elements.*;
import com.b5m.www.Function.*;

@RunWith(value = Parameterized.class)
	

public class Login {
	WebDriver driver = new ChromeDriver();
	Mainpage_Elements ef = new Mainpage_Elements(driver);
	Mainpage_Function mf = new Mainpage_Function(driver);
	Login_Business lb = new Login_Business(driver);
	Login_Elements le = new Login_Elements(driver);
	static Logger log = Logger.getLogger(Login.class);
	private String url = "http://www.b5cai.com/";
	private String loginUrl = "http://www.b5cai.com/login.html?back=http%3A%2F%2Fwww.b5cai.com%2F";
	private String account;
	private String password;		
		 
	@Parameters
	
	//读取excel
	public  static Collection<String[]> testData () throws IOException{
		Data_Driven.GetExcelData("Excel/ExcelData.xlsx");
		return Data_Driven.excel_records;
		}
	
	//把取出的excel数据赋值给自定义变量	 
	public Login(String account,String password) {
		this.account = account;
		this.password = password;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//设置需要测试的浏览器
		Configuration conf = new Configuration();
		System.setProperty(conf.browser ,conf.browser_path);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {	
		mf.driverStart(url, 3);
		
	}

	@After
	public void tearDown() throws Exception {
		if(driver!=null){
			driver.quit();
			driver=null;
		}			
	}

	@Test
	public void LoginTest1() throws InterruptedException {
		log.info("测试用例LoginTest1即将开始...\n");
		lb.IsLogin();
		lb.login(account,password, loginUrl);
		try{
			if (!le.loginBtn().isEnabled()){
				mf.Snapshot("LoginTest1_登录未成功");
				log.info("未登录成功");
			}
		}catch (Exception e){
			mf.Snapshot("LoginTest1_登录未成功");
			log.info("未登录成功,请检查账号密码是否正确");
		}finally{
			assertTrue("没有成功登录", le.loginBtn().isEnabled());	
			}
		log.info("登录成功");		
		}
	}

